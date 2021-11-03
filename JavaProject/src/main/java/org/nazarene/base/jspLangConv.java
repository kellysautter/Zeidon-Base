/**
    This file is part of the Zeidon Java Object Engine (Zeidon JOE).

    Zeidon JOE is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Zeidon JOE is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with Zeidon JOE.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2009-2010 QuinSoft
**/

package org.nazarene.base;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.quinsoft.zeidon.CursorPosition;
import com.quinsoft.zeidon.EntityInstance;
import com.quinsoft.zeidon.ZeidonException;
import com.quinsoft.zeidon.vml.VmlObjectOperations;
import com.quinsoft.zeidon.vml.VmlOperation;
import com.quinsoft.zeidon.vml.zVIEW;
import com.quinsoft.zeidon.View;

/**
 * @author QuinSoft
 *
 */

public class jspLangConv extends VmlObjectOperations
{
	
   View vDlgLang =  new zVIEW( );
   View vDlgLangID = new zVIEW( );
   View vMsgLang =  new zVIEW( );
   View vTableLang =  new zVIEW( );
   String szLanguage = null;

   public jspLangConv( View view )
   {
      super( view );
   }
   
   //getLanguageObject( View ViewToWindow, String szDialog, String szLanguage )
   public int
   getLanguageObject( View ViewToWindow )
   {
	    zVIEW    sHost = new zVIEW( );
	    zVIEW    mUser = new zVIEW( );
	    zVIEW    mDomainLanguage = new zVIEW( );
	    //String szLanguage = null;
	    String szDirectory = null;
	    int nRC = 0;
	    int RESULT = 0;
	    int iCnt = 0;
	    boolean bLangExists=false;
	    boolean bActivateHost=false;
	    
	    ViewToWindow.log().info( "*** Begin getLanguageObject ***" );
        //task.log().debug( "*** %s: %s", entityName, "<empty?/deleted?>" );

	    
	    // Get the default language. Right not current language is a work attribute. Should there
	    // be two language attributes, one on the user and one on the host as a default?
	    if ( GetViewByName( mUser, "mUser", ViewToWindow, zLEVEL_TASK ) >= 0 ) 
	    { 
	    	// Check demographics first
	    	if ( CheckExistenceOfEntity( mUser, "Demographics") == 0)
	    		szLanguage = mUser.cursor("Demographics").getAttribute("PreferredLanguage").getString();
		    //ViewToWindow.log().info( "*** getLanguageObject mUser PreferredLanguage *** ", szLanguage  );
	    }
	    if ( szLanguage == null || szLanguage == "")
	    {
		    if ( GetViewByName( sHost, "sHost", ViewToWindow, zLEVEL_TASK ) < 0 )
		    { 
		    	RESULT = ActivateObjectInstance( sHost, "sHost", ViewToWindow, 0, zSINGLE );
		    	bActivateHost = true;
		    }
		    szLanguage = sHost.cursor("Host").getAttribute("PreferredLanguage").getString();	    	
		    //ViewToWindow.log().info( "*** getLanguageObject sHost PreferredLanguage *** ", szLanguage  );
	    }
	    // English will be default
	    if ( szLanguage == null || szLanguage == "")
	       szLanguage = "EN";
	    ViewToWindow.log().info( "*** getLanguageObject Language *** ", szLanguage  );
	    
	    
        //String viewName = "LangObj" + szDialog + szLanguage;
        String viewName = "LangObj";
        vDlgLang = ViewToWindow.getViewByName( viewName );
        String viewNameID = "LangObjID";
        vDlgLangID = ViewToWindow.getViewByName( viewNameID );
        String msgViewName = "MsgLangObj";
        vMsgLang = ViewToWindow.getViewByName( msgViewName );
        String tblViewName = "TblLangObj";
        vTableLang = ViewToWindow.getViewByName( tblViewName );
        
        // I am concerned about the login page. We won't know the user at this point so I am assuming we will get
        // a language from the host? Or will we assume english? So if that is different from the user's primary
        // language, then we will need to load this again when they are logging in.
        if ( vDlgLang == null || !vDlgLang.cursor("Language").getAttribute( "Language" ).getString().equals(szLanguage))
        {
    	    zVIEW    vTempViewVar_0 = new zVIEW( );
    	    zVIEW    mLangTxt = new zVIEW( );
    	    String strLine = "";

		    //ViewToWindow.log().info( "*** BUILDING LANGUAGE OBJECTS *** ", szLanguage  );

    	    // I KNOW I NEED TO CREATE A NEW FIELD IN THE HOST TABLE FOR THE JS DIRECTORY!!!
		    if ( GetViewByName( sHost, "sHost", ViewToWindow, zLEVEL_TASK ) < 0 )
		    { 
		    	RESULT = ActivateObjectInstance( sHost, "sHost", ViewToWindow, 0, zSINGLE );
		    }
    	    szDirectory = sHost.cursor("Host").getAttribute("JSDir").getString();
    	    if ( szDirectory.equals(""))
    	    {
	    	    szDirectory = sHost.cursor("Host").getAttribute("JasperReportDir").getString();
	    	    szDirectory.indexOf("reports");
	    	    szDirectory = szDirectory.replaceFirst("reports", "js");
    	    }
    	    
    	    // Create a js file in the js directory where we will store in two arrays the list of message identifiers, and the list of message conversions.
    	    // Then there is another js file "msgLang.js", that has a function  getJSMsg("Msg ID", "Original String") that can be called from the javascript in
    	    // a dialog action.
    	    szDirectory = szDirectory + "msgLangLst.js";

    	    int lFileHandle = 0;
    	    // This the array to hold the message ids.
			strLine = "var msgIDLst = [ \r\n";
			BufferedWriter bw = null;

            try {
            	
            	File file = null;
            	
            	try{
            		 file = new File( szDirectory );          
            	}catch (Exception e)
            	{
         		    ViewToWindow.log().info( "*** ERROR on new File( " + szDirectory + " ) !!!!!!  *** "  );	 
            	}
            
      	 /* This logic will make sure that the file 
      	  * gets created if it is not present at the
      	  * specified location*/
                	
        	try{
            	  if (!file.exists())
               	     file.createNewFile();
        	}catch (Exception e)
        	{
     		    ViewToWindow.log().info( "*** ERROR on file.createNewFile() for file " + szDirectory  + " !!!!!!  *** "  );	 
        	}

      	  // FileWriter fw = new FileWriter(file);
      	 //  bw = new BufferedWriter(fw);
          bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8"));
      	  bw.write(strLine);      	  

/**********************************************/    	    
    	    
			vDlgLang = ViewToWindow.activateEmptyObjectInstance("wDlgLang");
			vDlgLang.cursor("Language").createEntity();
			vDlgLang.cursor("Language").getAttribute( "Language" ).setValue( szLanguage );
    	    
			vDlgLangID = ViewToWindow.activateEmptyObjectInstance("wDlgLang");
			vDlgLangID.cursor("Language").createEntity();
			vDlgLangID.cursor("Language").getAttribute( "Language" ).setValue( szLanguage );
			
			vMsgLang = ViewToWindow.activateEmptyObjectInstance("wDlgLang");
			vMsgLang.cursor("Language").createEntity();
			vMsgLang.cursor("Language").getAttribute( "Language" ).setValue( szLanguage );
			
			vTableLang = ViewToWindow.activateEmptyObjectInstance("wDlgLang");
			vTableLang.cursor("Language").createEntity();
			vTableLang.cursor("Language").getAttribute( "Language" ).setValue( szLanguage );
			    	    
    	    //BuildLangQual( ViewToWindow, vTempViewVar_0, szDialog, szLanguage );
    	    BuildLangQual( ViewToWindow, vTempViewVar_0, szLanguage );
    	    RESULT = ActivateObjectInstance( mLangTxt, "mLangTxt", ViewToWindow, vTempViewVar_0, zMULTIPLE );
    	    DropView( vTempViewVar_0 );

			if ( RESULT >= 0 )
    	    {
				bLangExists = true;
 		       RESULT = SetCursorFirstEntity( mLangTxt, "LanguageText", "" );
 		       while ( RESULT > zCURSOR_UNCHANGED  )
 		       {
 		    	  // Need to check if OriginalDialogText exists because dynamic domains won't have this. I should probably put this in the activate...
 		    	  if ( mLangTxt.cursor("LanguageText").getAttribute("TextValue").getString() != ""  && mLangTxt.cursor("OriginalDialogText").checkExistenceOfEntity().isSet())
 		    	  { 
 		    		  // If this is NOT a message text.
 		    		  if ( CompareAttributeToString( mLangTxt, "OriginalDialogText", "IsMessage", "" ) == 0 && CompareAttributeToString( mLangTxt, "OriginalDialogText", "IsTableData", "" ) == 0 )
 		    		  {
 		    			  if ( CompareAttributeToString( mLangTxt, "OriginalDialogText", "TextIdentifier", "" ) == 0 )
 		    			  {
				 		  	  vDlgLang.cursor("Texts").createEntity();
				 			  vDlgLang.cursor("Texts").getAttribute( "OrigText" ).setValue( mLangTxt.cursor("OriginalDialogText").getAttribute("UniqueTextValue").getString() );
				 			  vDlgLang.cursor("Texts").getAttribute( "LangText" ).setValue( mLangTxt.cursor("LanguageText").getAttribute("TextValue").getString() );
				 			  //vDlgLang.cursor("Texts").getAttribute( "TextIdentifier" ).setValue( mLangTxt.cursor("OriginalDialogText").getAttribute("TextIdentifier").getString() );
 		    			  }
 		    			  else
 		    			  { 		    				  
 		    				 vDlgLangID.cursor("Texts").createEntity();
 		    				 vDlgLangID.cursor("Texts").getAttribute( "OrigText" ).setValue( mLangTxt.cursor("OriginalDialogText").getAttribute("UniqueTextValue").getString() );
 		    				 vDlgLangID.cursor("Texts").getAttribute( "LangText" ).setValue( mLangTxt.cursor("LanguageText").getAttribute("TextValue").getString() );
 		    				 vDlgLangID.cursor("Texts").getAttribute( "TextIdentifier" ).setValue( mLangTxt.cursor("OriginalDialogText").getAttribute("TextIdentifier").getString() );
 		    			  }
 		    		  }
 		    		  else if ( CompareAttributeToString( mLangTxt, "OriginalDialogText", "IsMessage", "Y" ) == 0 )
 		    		  {
 		    			 // Message Text
 		    			 vMsgLang.cursor("Texts").createEntity();
 		    			 vMsgLang.cursor("Texts").getAttribute( "OrigText" ).setValue( mLangTxt.cursor("OriginalDialogText").getAttribute("UniqueTextValue").getString() );
 		    			 vMsgLang.cursor("Texts").getAttribute( "LangText" ).setValue( mLangTxt.cursor("LanguageText").getAttribute("TextValue").getString() );
 		    			 vMsgLang.cursor("Texts").getAttribute( "TextIdentifier" ).setValue( mLangTxt.cursor("OriginalDialogText").getAttribute("TextIdentifier").getString() );
 		    			 // Not sure if I should create a separate check for javascript message? Thinking I probably should but not sure...
 		    			 if (iCnt > 0)
 		    				 strLine = ", \r\n";
 		    			 else
 		    				 strLine = "";
 		    			 iCnt++;
 		    			 strLine = strLine + "\"" + mLangTxt.cursor("OriginalDialogText").getAttribute("TextIdentifier").getString() + "\"";
 		    			 bw.write(strLine);
 		    		  }
 		    		  else if ( CompareAttributeToString( mLangTxt, "OriginalDialogText", "IsTableData", "Y" ) == 0 )
 		    		  {
  		    			 // Data from a table Text
 		    			 vTableLang.cursor("Texts").createEntity();
 		    			 vTableLang.cursor("Texts").getAttribute( "OrigText" ).setValue( mLangTxt.cursor("OriginalDialogText").getAttribute("UniqueTextValue").getString() );
 		    			 vTableLang.cursor("Texts").getAttribute( "LangText" ).setValue( mLangTxt.cursor("LanguageText").getAttribute("TextValue").getString() );
 		    			 //vTableLang.cursor("Texts").getAttribute( "TextIdentifier" ).setValue( mLangTxt.cursor("OriginalDialogText").getAttribute("TextIdentifier").getString() );
 		    		  }
 		    	  }
 		    	   
 			      RESULT = SetCursorNextEntity( mLangTxt, "LanguageText", "" );
 		       }
				strLine = "\r\n ]; \r\n";
				bw.write(strLine);
				// This is the array for the message conversions.
				strLine = "var msgLst = [ \r\n";
				bw.write(strLine);
				iCnt = 0;
				
 		       RESULT = SetCursorFirstEntity( mLangTxt, "LanguageText", "" );
 		       while ( RESULT > zCURSOR_UNCHANGED  )
 		       {
 		    	   
  		    	  if ( mLangTxt.cursor("LanguageText").getAttribute("TextValue").getString() != ""  && 
  		    		   mLangTxt.cursor("OriginalDialogText").checkExistenceOfEntity().isSet() && 
  		    		   CompareAttributeToString( mLangTxt, "OriginalDialogText", "IsMessage", "Y" ) == 0 &&
  		    		   CompareAttributeToString( mLangTxt, "OriginalDialogText", "TextIdentifier", "" ) != 0)
  		    	  {
		    			 if (iCnt > 0)
 		    				 strLine = ", \r\n";
 		    			 else
 		    				 strLine = "";
  		    	  		iCnt++;
 		    			 strLine = strLine + "\"" + mLangTxt.cursor("LanguageText").getAttribute("TextValue").getString() + "\"";
 		    			 bw.write(strLine);
  		    	  }
  		    		  
  		    		  RESULT = SetCursorNextEntity( mLangTxt, "LanguageText", "" );
 		       }
				strLine = "\r\n ]; \r\n";
				bw.write(strLine);
    	    }
			// If there was no language data, we still need to create the variables
			if (!bLangExists)
			{
				strLine = "\r\n ]; \r\n";
				bw.write(strLine);
				strLine = "var msgLst = [ ];";
				bw.write(strLine);
				
			}
			bw.close();
			
		    //ViewToWindow.log().info( "*** END of Building Language Objects *** ", szLanguage  );
     	  
    	    vDlgLang.setName( viewName );
    	    vDlgLangID.setName( viewNameID );
    	    vMsgLang.setName( msgViewName );
            vTableLang.setName( tblViewName );
             }
             catch( Exception e)
             {
            	String strError = e.getMessage();
     		    ViewToWindow.log().info( "*** ERROR Building Language Objects !!!!!!  *** ",  strError );	 
     		    //throw new Exception( e );
             }
        }
	   
	    return nRC;
   }
	

   // Get the first error message (if any).
   public final String
   getLanguageText( String szOrigText )
   {
	  //if ( getView( vDlgLang ) == null )
	   if ( vDlgLang == null )
    	  return szOrigText;

      if ( vDlgLang.cursor("Texts").setFirst("OrigText", szOrigText).isSet() )
    	  return vDlgLang.cursor("Texts").getAttribute("LangText").getString();
      else
    	  return szOrigText;
   }
   
   public final String
   getLanguageText( String szOrigText, String szIdentifier )
   {
	  //if ( !VmlOperation.isValid( vDlgLangID ) )
      if ( vDlgLangID == null )
    	  return szOrigText;

	  // Find the text value by it's TextIdentifier
	  if ( !szIdentifier.equals("") )
	  {	      
		  if ( vDlgLangID.cursor("Texts").setFirst("TextIdentifier", szIdentifier).isSet() )
	    	  return vDlgLangID.cursor("Texts").getAttribute("LangText").getString();
	      else
	    	  return szOrigText;
	  
	  }
	  else
	  {		  
		  // Regular find.
	      if ( vDlgLang.cursor("Texts").setFirst("OrigText", szOrigText).isSet() )
	    	  return vDlgLang.cursor("Texts").getAttribute("LangText").getString();
	      else
	    	  return szOrigText;
	  }
   }

   // Get the first error message (if any).
   public final String
   getMessageText( String szOrigText, String szMsgID )
   {
	  //if ( !VmlOperation.isValid( vMsgLang ) )
      if ( vMsgLang == null )
    	  return szOrigText;
	  if (szMsgID != "")
	  {
	      if ( vMsgLang.cursor("Texts").setFirst("OrigText", szOrigText).isSet() )
	    	  return vMsgLang.cursor("Texts").getAttribute("LangText").getString();		  
	      else
	    	  return szOrigText;
	  }
	  else
      if ( vMsgLang.cursor("Texts").setFirst("OrigText", szOrigText).isSet() )
    	  return vMsgLang.cursor("Texts").getAttribute("LangText").getString();
      else
    	  return szOrigText;
   }

   // Get the first error message (if any).
   public final String
   getTableText( String szOrigText )
   {
	  //if ( getView( vDlgLang ) == null )
	  if ( vTableLang == null )
    	  return szOrigText;

      if ( vTableLang.cursor("Texts").setFirst("OrigText", szOrigText.trim()).isSet() )
    	  return vTableLang.cursor("Texts").getAttribute("LangText").getString();
      else
    	  return szOrigText;
   }

   public final String
   getLanguage( )
   {
	   return szLanguage;
   }
   

	private int 
	BuildLangQual( View     vSubtask,
	               zVIEW    vQualObject, 
	               //String szDialog, 
	               String szLanguage)
	{
	   int      RESULT = 0;
	   
	   RESULT = SfActivateSysEmptyOI( vQualObject, "KZDBHQUA", vSubtask, zMULTIPLE );
	   CreateEntity( vQualObject, "EntitySpec", zPOS_AFTER );
	   SetAttributeFromString( vQualObject, "EntitySpec", "EntityName", "LanguageText" );
	   CreateEntity( vQualObject, "QualAttrib", zPOS_AFTER );
	   SetAttributeFromString( vQualObject, "QualAttrib", "EntityName", "LanguageText" );
	   SetAttributeFromString( vQualObject, "QualAttrib", "AttributeName", "Language" );
	   SetAttributeFromString( vQualObject, "QualAttrib", "Value", szLanguage );
	   SetAttributeFromString( vQualObject, "QualAttrib", "Oper", "=" );

	   /*
	   RESULT = SfActivateSysEmptyOI( vQualObject, "KZDBHQUA", vSubtask, zMULTIPLE );
	   CreateEntity( vQualObject, "EntitySpec", zPOS_AFTER );
	   SetAttributeFromString( vQualObject, "EntitySpec", "EntityName", "DialogTextByLanguage" );
	   CreateEntity( vQualObject, "QualAttrib", zPOS_AFTER );
	   SetAttributeFromString( vQualObject, "QualAttrib", "EntityName", "DialogTextByLanguage" );
	   SetAttributeFromString( vQualObject, "QualAttrib", "AttributeName", "LanguageTypeCode" );
	   SetAttributeFromString( vQualObject, "QualAttrib", "Value", szLanguage );
	   SetAttributeFromString( vQualObject, "QualAttrib", "Oper", "=" );
	   
	   CreateEntity( vQualObject, "QualAttrib", zPOS_AFTER );
	   SetAttributeFromString( vQualObject, "QualAttrib", "Oper", "AND" );
	   CreateEntity( vQualObject, "QualAttrib", zPOS_AFTER );
	   SetAttributeFromString( vQualObject, "QualAttrib", "EntityName", "DialogTextByLanguage" );
	   SetAttributeFromString( vQualObject, "QualAttrib", "AttributeName", "DialogName" );
	   SetAttributeFromString( vQualObject, "QualAttrib", "Value", szDialog );
	   SetAttributeFromString( vQualObject, "QualAttrib", "Oper", "=" );
	   */
	   return( 0 );
	} 
   
}
