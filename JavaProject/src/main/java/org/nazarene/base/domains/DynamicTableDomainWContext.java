/**
    This file is enhances Zeidon-JOE DynamicTableDomain by allowing the use of Domain Contexts.

 */

package org.nazarene.nazsis.domains;

import java.util.Map;

import com.quinsoft.zeidon.Application;
import com.quinsoft.zeidon.CursorResult;
import com.quinsoft.zeidon.Task;
import com.quinsoft.zeidon.View;
import com.quinsoft.zeidon.ZeidonException;
import com.quinsoft.zeidon.domains.DomainContext;
import com.quinsoft.zeidon.domains.DynamicTableDomain;
import com.quinsoft.zeidon.objectdefinition.LodDef;
import com.quinsoft.zeidon.utils.QualificationBuilder;

import org.apache.commons.lang3.StringUtils;

import com.quinsoft.zeidon.EntityInstance;
import com.quinsoft.zeidon.domains.TableDomainContext;


/**
 * This domain is a DynamicTableDomain but we sort the external value Ascending order. 
 * @author KJS
 *
 */
public class DynamicTableDomainWContext extends DynamicTableDomain
{
    public DynamicTableDomainWContext(Application application, Map<String, Object> domainProperties, Task task )
    {
        super( application, domainProperties, task );
    }

    
    @Override
    protected View activateApplicationDomain( Task task, DomainContext context )
    {
    	LodDef viewOd = task.getApplication().getLodDef( task, "DomainT" );

        View view = new QualificationBuilder( task.getSystemTask() )
                                            .setApplication( task.getApplication() )
                                            .setLodDef( viewOd )
                                            .forEntity( "Domain" )
                                            .addAttribQual( "Name", getName() )
                                            .activate();
        if ( view.cursor( "Domain" ).getEntityCount() == 0 )
            throw new ZeidonException( "Dynamic domain '%s' has no values in the DB", this.toString() );
                 
        return view;
    }
    
    
    protected void loadTableEntries( Task task, TableDomainContext context, View domainView )
    {
        context.resetTableEntries(task);
        if (getName().equals(context.getName()))
        {
	        for ( EntityInstance entity : domainView.cursor( "Domain" ).getChildren( "DomainValue" ) )
	        {
	            String internalValue = entity.getAttribute( "InternalStringValue" ).getString();
	            if ( StringUtils.isBlank( internalValue ) )
	                internalValue = entity.getAttribute( "InternalIntegerValue" ).getString();
	            String externalValue = entity.getAttribute( "ExternalDescription" ).getString();
	            context.addTableEntry( task, internalValue, externalValue );
	        }
        }
        else
        {
        	domainView.cursor("Context").setFirst("Name", context.getName());
        	if (domainView.cursor("ContextDomainValue").checkExistenceOfEntity().toInt() >= 0 )
        	{
	            for ( EntityInstance entity : domainView.cursor( "Context" ).getChildren( "ContextDomainValue" ) )
	            {
	                String internalValue = entity.getAttribute( "InternalStringValue" ).getString();
	                if ( StringUtils.isBlank( internalValue ) )
	                    internalValue = entity.getAttribute( "InternalIntegerValue" ).getString();
	                String externalValue = entity.getAttribute( "ExternalDescription" ).getString();
	                context.addTableEntry( task, internalValue, externalValue );
	            }
        	}
        }
    }

}
