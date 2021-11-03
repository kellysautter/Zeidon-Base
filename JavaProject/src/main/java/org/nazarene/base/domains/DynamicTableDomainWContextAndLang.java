/**
    This file is enhances Zeidon-JOE DynamicTableDomain by allowing the use of Domain Contexts.

 */

package org.nazarene.nazsis.domains;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.quinsoft.zeidon.Application;
import com.quinsoft.zeidon.CursorPosition;
import com.quinsoft.zeidon.CursorResult;
import com.quinsoft.zeidon.Task;
import com.quinsoft.zeidon.View;
import com.quinsoft.zeidon.ZeidonException;
import com.quinsoft.zeidon.domains.DomainContext;
import com.quinsoft.zeidon.domains.DynamicTableDomain;
import com.quinsoft.zeidon.objectdefinition.LodDef;
import com.quinsoft.zeidon.utils.QualificationBuilder;
import com.quinsoft.zeidon.vml.zVIEW;

import org.apache.commons.lang3.StringUtils;

import com.quinsoft.zeidon.EntityInstance;
import com.quinsoft.zeidon.domains.TableDomainContext;


/**
 * This domain is a DynamicTableDomain but we sort the external value Ascending order. 
 * @author KJS
 *
 */
public class DynamicTableDomainWContextAndLang extends DynamicTableDomain
{
	
    public DynamicTableDomainWContextAndLang(Application application, Map<String, Object> domainProperties, Task task )
    {
        super( application, domainProperties, task );
    }

    @Override
    protected View loadApplicationDomainView( Task task, DomainContext context, String viewName )
    {
        Application app = getApplication();
        synchronized( viewName.intern() )
        {
        	// For language domains, we always want to drop the domain because this might be for a new language.
            View domainView = app.getViewByName( viewName );
            if ( domainView != null )
            	domainView.drop();
                //return domainView;

            domainView = activateApplicationDomain( task, context );
            app.setNameForView( viewName, domainView );
            return domainView;
        }
    }

    
    @Override
    protected View activateApplicationDomain( Task task, DomainContext context )
    {
    	zVIEW  vQualObject = new zVIEW( );
       	View   sHost;
   	    String szLanguage = "";
   	    int nRC = 0;
   	    int RESULT = 0;
    	   
           View mUser = task.getViewByName("mUser");
           if ( mUser != null )
	   	    { 
	   	    	// Check demographics first
	   	    	if ( mUser.cursor("Demographics").checkExistenceOfEntity().toInt() >= 0)
	   	    		szLanguage = mUser.cursor("Demographics").getAttribute("PreferredLanguage").getString();
	   	    }
	   	    if ( szLanguage == null || szLanguage == "")
	   	    {
	   	    	sHost = task.getViewByName("sHost");
	   		    if ( sHost != null )
	   		    	szLanguage = sHost.cursor("Host").getAttribute("PreferredLanguage").getString();
	   	    }

    	   LodDef viewOd = task.getApplication().getLodDef( task, "DomainT" );
    	
           //View view = new QualificationBuilder( task.getSystemTask() )
           View view = new QualificationBuilder( task )
								           .setApplication( task.getApplication() )
								           .setLodDef( viewOd )
								           .forEntity( "Domain" )
								           .addAttribQual( "Name", getName() )
								           .forEntity( "LanguageText" )
								           .addAttribQual( "Language", szLanguage )
								           .forEntity( "ContextLanguageText" )
								           .addAttribQual( "Language", szLanguage )
								           .activate();
    	   
         if ( view.cursor( "Domain" ).getEntityCount() == 0 )
            throw new ZeidonException( "Dynamic domain '%s' has no values in the DB", this.toString() );
         
         view.cursor("Domain" ).getAttribute("wLanguage").setValue( szLanguage ); 
         
         // I am currently going to assume that all domains are originally in english.
         if ( szLanguage.equals("EN") || szLanguage == "" )
         {
	         view.cursor("DomainValue").orderEntities("DomainValue.ExternalDescription A");
	         for ( CursorResult rc = view.cursor( "Context" ).setFirst();
	                 rc.isSet();
	                 rc = view.cursor( "Context" ).setNext() )
	           {
	               view.cursor("ContextDomainValue").orderEntities("ContextDomainValue.ExternalDescription A");
	           }
         }
         else
         {
             view.cursor("DomainValue").orderEntities("LanguageText.TextValue A");
             for ( CursorResult rc = view.cursor( "Context" ).setFirst();
                     rc.isSet();
                     rc = view.cursor( "Context" ).setNext() )
               {
                   view.cursor("ContextDomainValue").orderEntities("ContextLanguageText.TextValue A");
               }        	 
         }
                 
        return view;
    }
    
    
    @Override
    protected void loadTableEntries( Task task, TableDomainContext context, View domainView )
    {
    	View    sHost;
	    String szLanguage = "";
	    int nRC = 0;
	    int RESULT = 0;
	    
	    // Get the default language. Right not current language is a work attribute. Should there
	    // be two language attributes, one on the user and one on the host as a default?
        View mUser = task.getViewByName("mUser");
        if ( mUser != null )
	    { 
	    	// Check demographics first
	    	if ( mUser.cursor("Demographics").checkExistenceOfEntity().toInt() >= 0)
	    		szLanguage = mUser.cursor("Demographics").getAttribute("PreferredLanguage").getString();
	    }
	    if ( szLanguage == null || szLanguage == "")
	    {
	    	sHost = task.getViewByName("sHost");
		    if ( sHost != null )
		    	szLanguage = sHost.cursor("Host").getAttribute("PreferredLanguage").getString();
	    }
        context.resetTableEntries(task);
        
        if (getName().equals(context.getName()))
        {
        	// Looking at the domain values for parent domain (not a context).
            for ( CursorResult rc = domainView.cursor("DomainValue").setFirst( );
                    rc.isSet();
                    rc = domainView.cursor("DomainValue").setNextContinue() )
              {
            	String internalValue = domainView.cursor("DomainValue").getAttribute( "InternalStringValue" ).getString();
            	String externalValue = "";
	            if ( StringUtils.isBlank( internalValue ) )
	                internalValue = domainView.cursor("DomainValue").getAttribute( "InternalIntegerValue" ).getString();
                // If the preferred language is not blank, or it's not english (that is the default), and we have a translation for the preferred language, then
                // add that value to the domain list, not the original value.
            	if ( szLanguage != "" && !szLanguage.equals("EN") && domainView.cursor("LanguageText").setFirst("Language", szLanguage).isSet() && !domainView.cursor("LanguageText").getAttribute("TextValue").getString().equals(""))
            		externalValue = domainView.cursor("LanguageText").getAttribute( "TextValue" ).getString();
            	else
            		externalValue = domainView.cursor("DomainValue").getAttribute( "ExternalDescription" ).getString();
  	            context.addTableEntry( task, internalValue, externalValue );
              }            
        }
        else
        {
        	// Looking at a context for the domain.
        	domainView.cursor("Context").setFirst("Name", context.getName());
        	if (domainView.cursor("ContextDomainValue").checkExistenceOfEntity().toInt() >= 0 )
        	{
                for ( CursorResult rc = domainView.cursor("ContextDomainValue").setFirst( );
                        rc.isSet();
                        rc = domainView.cursor("ContextDomainValue").setNextContinue() )
                {
	                String internalValue = domainView.cursor("ContextDomainValue").getAttribute( "InternalStringValue" ).getString();
		            String externalValue = "";
	                if ( StringUtils.isBlank( internalValue ) )
	                    internalValue = domainView.cursor("ContextDomainValue").getAttribute( "InternalIntegerValue" ).getString();
	                // If the preferred language is not blank, or it's not english (that is the default), and we have a translation for the preferred language, then
	                // add that value to the domain list, not the original value.
                	if ( szLanguage != "" && !szLanguage.equals("EN") && domainView.cursor("ContextLanguageText").setFirst("Language", szLanguage).isSet() && !domainView.cursor("ContextLanguageText").getAttribute("TextValue").getString().equals(""))
                		externalValue = domainView.cursor("ContextLanguageText").getAttribute( "TextValue" ).getString();
                	else
                		externalValue = domainView.cursor("ContextDomainValue").getAttribute( "ExternalDescription" ).getString();
	                context.addTableEntry( task, internalValue, externalValue );                	
                }
        	}
        }
    }

    @Override
    protected synchronized View loadDomainView( Task task, DomainContext context )
    {
       	View   sHost;
   	    String szLanguage = "";
   	    boolean bSameLang = false;
    	   
        View mUser = task.getViewByName("mUser");
        if ( mUser != null )
   	    { 
   	    	// Check demographics first
   	    	if ( mUser.cursor("Demographics").checkExistenceOfEntity().toInt() >= 0)
   	    		szLanguage = mUser.cursor("Demographics").getAttribute("PreferredLanguage").getString();
   	    }
   	    if ( szLanguage == null || szLanguage == "")
   	    {
   	    	sHost = task.getViewByName("sHost");
   		    if ( sHost != null )
   		    	szLanguage = sHost.cursor("Host").getAttribute("PreferredLanguage").getString();
   	    }
    	// For language conversion, I am thinking maybe we want to store the Language on the Domain and then
    	// check here if we are using a different language. Then reload the domain like we do the language text values.
        View domainView = null;
        String viewName = getDomainViewName( context );
        domainView = task.getViewByName( viewName );
      
        if ( domainView != null )
        	bSameLang = domainView.cursor("Domain").getAttribute("wLanguage").getString().equals(szLanguage);
        if ( domainView == null || ! bSameLang )
        {
        	if ( domainView != null )
        		domainView.drop();
            View appView = loadApplicationDomainView( task, context, viewName );
            domainView = appView.newView( task );
            domainView.setName( viewName );
            loadTableEntries( task, (TableDomainContext) context, domainView );
        }

        return domainView;
    }

}
