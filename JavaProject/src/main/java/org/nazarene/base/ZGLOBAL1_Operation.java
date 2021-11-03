/** This file is part of the Zeidon Java Object Engine (Zeidon JOE).

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

//import java.io.File;
import com.quinsoft.zeidon.AttributeInstance;

import java.awt.Desktop;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import javax.script.*;

import java.io.InputStreamReader;
//import java.lang.Math;
//import java.text.NumberFormat;
//import java.util.*;
import java.nio.CharBuffer;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import java.util.Properties;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.StringUtils;
// import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.lang3.math.NumberUtils;
import org.joda.time.Days;
import org.joda.time.DateTime;
//import org.joda.time.Days;












// For JasperReports
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.math.*;

import com.quinsoft.zeidon.Application;
//import com.quinsoft.zeidon.ActivateFlags;
import com.quinsoft.zeidon.CursorPosition;
import com.quinsoft.zeidon.CursorResult;
import com.quinsoft.zeidon.TaskQualification;
import com.quinsoft.zeidon.Task;
import com.quinsoft.zeidon.View;
import com.quinsoft.zeidon.vml.VmlOperation;
import com.quinsoft.zeidon.vml.zVIEW;
//import com.quinsoft.zeidon.utils.JoeUtils;
import com.quinsoft.zeidon.zeidonoperations.ZDRVROPR;
import com.quinsoft.zeidon.zeidonoperations.KZOEP1AA;
import com.quinsoft.zeidon.zeidonoperations.ActiveDirectory;
import com.quinsoft.zeidon.EntityInstance;

import static com.quinsoft.zeidon.vml.VmlOperation.MessageSend;
import static com.quinsoft.zeidon.vml.VmlOperation.zCURSOR_UNCHANGED;
import static com.quinsoft.zeidon.vml.VmlOperation.zLEVEL_TASK;
import static com.quinsoft.zeidon.vml.VmlOperation.zMSGQ_OBJECT_CONSTRAINT_ERROR;
import static com.quinsoft.zeidon.vml.VmlOperation.zPOS_AFTER;
import static com.quinsoft.zeidon.vml.VmlOperation.zSINGLE;

import com.quinsoft.zeidon.domains.Domain;
import com.quinsoft.zeidon.objectdefinition.AttributeDef;
import com.quinsoft.zeidon.objectdefinition.DomainType;
import com.quinsoft.zeidon.objectdefinition.EntityDef;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;












import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;











// for excel reads
// package net.codejava.excel;
// import java.io.File;
import java.nio.charset.Charset;
import java.io.FileInputStream;
// import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.util.NumberToTextConverter;

import java.io.PrintWriter;


/**
 * @author QuinSoft
 *
 * Admin password zPrefixCF6j8nasPa8FAO7iwIB8fR6YDeupqBTOcqJwU9kP1v3kLB8fRpSarg==
 */

public class ZGLOBAL1_Operation extends VmlOperation
{
    private final ZDRVROPR m_ZDRVROPR;
    private final KZOEP1AA m_KZOEP1AA;
    private final ActiveDirectory m_ActiveDirectory;
    //public ZGLOBAL1_Operation( TaskQualification taskQual )
    public ZGLOBAL1_Operation( View view )
    {
       super( view );
       m_ZDRVROPR = new ZDRVROPR( view );
       m_KZOEP1AA = new KZOEP1AA( view );
       m_ActiveDirectory = new ActiveDirectory( );
       //private final KZOEP1AA m_KZOEP1AA;
   }
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // .Function Name: >>>SetAttributeFromCurrentDateTime
    //
    // .Description: Set an Attribute to Current Date Time
    //
    // .Return Value: int
    //    (Same as SetAttributeFromString() )
    //
    // .Parameter:
    //    Data type       Name        (I/O/U) Description
    //    View            View          (I)   View for Attribute
    //    String          entityName    (I)   Name of Entity
    //    String          attributeName (I)   Name of Attribute
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // .Detail description
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    SetAttributeFromCurrentDateTime( View   View,
                                     String entityName,
                                     String attributeName )
    {
      String  stringTimeStamp = null;
      int rc;

      stringTimeStamp = KZOEP1AA.SysGetDateTime( stringTimeStamp );
      StringBuilder sb_szDate = new StringBuilder( 32 );
      KZOEP1AA.SysGetDateTime( sb_szDate );

      rc = SetAttributeFromString( View, entityName, attributeName, stringTimeStamp );
      return rc;
    }

    /*
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // .Function Name: >>>DecimalSumOf
    //
    // .Description: Compute the sum of a double attribute over all
    //               instances of an entity
    //
    // .Return Value: BigDecimal - sum
    //
    // .Parameter:
    //    Datatype        Name            (I/O/U) Description
    //    View            View              (I)   View for Entity
    //    String          entityName        (I)   Name of Entity
    //    String          attributeName     (I)   Name of Attribute
    //    String          stringParentName  (I)   Name of Parent Entity
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // .Detail description
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public Double
    DecimalSumOf( View   vSum,
                  String entityName,
                  String attributeName,
                  String stringParentName )
    {
       Double decimalSum;
       Double decimalValue = null;
       int RESULT;

       decimalSum = 0.0;

       RESULT = SetCursorFirstEntity( vSum, entityName, stringParentName );
       while ( RESULT > zCURSOR_UNCHANGED )
       {
         decimalSum += GetDecimalFromAttribute( decimalValue, vSum, entityName, attributeName );
          RESULT = SetCursorNextEntity( vSum, entityName, stringParentName );
       }

       return decimalSum;
    }

    // Sets the cursor to the latest entity based on a date/time stamp
    // attribute.  The attribute passed should be a date/time stamp, but
    // could be any attribute with ascending collating sequence.
    public int
    SetCursorLatestEntity( View   view,
                           String entityName,
                           String attributeName )
    {
       OrderEntityForView( view, entityName, attributeName );
       SetCursorLastEntity( view, entityName, "" );
       return 0;
    }

    public int
    GetIntFromAttrByContext( MutableInt lValue,
                             View   view,
                             String stringEntity,
                             String stringAttribute,
                             String stringContext )
    {
 	  int lValueInt = 0;

 	  lValueInt = GetVariableFromAttribute( lValueInt, 0, zTYPE_INTEGER, 0,
                                             view, stringEntity, stringAttribute, stringContext, 0 );

 	  lValue.setValue(lValueInt);
       return lValue.intValue();
    }

    public int
    GetStrFromAttrByContext( StringBuilder sbValue,
                             int    lOrigLth,
                             View   view,
                             String stringEntity,
                             String stringAttribute,
                             String stringContext )
    {
       MutableInt k = new MutableInt( 0 );
       int     lLth;
    // String  string;

       // If the Context value is null, use the default Context.
       if ( lOrigLth < 10000 )
          lLth = lOrigLth;
       else
          lLth = 10000;
try
{

       if ( stringContext == null || StringUtils.isBlank( stringContext ) )
          GetVariableFromAttribute( sbValue, k, zTYPE_STRING, lLth,
                                    view, stringEntity, stringAttribute, "", zUSE_DEFAULT_CONTEXT );
       else
          GetVariableFromAttribute( sbValue, k, zTYPE_STRING, lLth,
                                    view, stringEntity, stringAttribute, stringContext, 0 );
}
catch( Exception e )
{
sbValue.append("");
}

       return k.intValue( );
    }

    public int
    SetAttrFromIntByContext( View   view,
                             String stringEntity,
                             String stringAttribute,
                             int    lValue,
                             String stringContext )
    {
      int rc;

      rc = SetAttributeFromVariable( view, stringEntity, stringAttribute,
                                     lValue, zTYPE_INTEGER, 0, stringContext, 0);
      return rc;
    }

    public int
    AddToAttrFromIntByContext( View   view,
                               String stringEntity,
                               String stringAttribute,
                               int    lValue,
                               String stringContext )
    {
      int rc;

      rc = AddToAttributeFromVariable( view, stringEntity, stringAttribute,
                                       lValue, zTYPE_INTEGER, 0, stringContext );
      return rc;
    }

    /*
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // .Function name: >>>GetEnvVariable
    //
    // .Description: Get an environment variable
    //
    // .Return value: int
    //    0 - OK
    //    else Error
    //
    // .Parameter:
    //    Data type,      Name             (I/O/U) Description
    //    String          stringReturnWert   (O)   value of the env var (returned)
    //    String          stringVariableName (I)   name of the env var
    //    int             nMaxReturnLth      (I)   max. length of stringReturnWert
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public String
    GetEnvVariable( String stringReturnValue,
                    String stringVariableName,
                    int    nMaxReturnLth )
    {
       stringReturnValue = KZOEP1AA.SysGetEnvVar( stringReturnValue, stringVariableName, nMaxReturnLth );
       return stringReturnValue;
    }
    
    /*
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // .Function Name: >>>StrToInt
    //
    // .Description: Convert an String to an Integer
    //
    // .Return Value: int
    //    (Integer Value of String )
    //
    // .Parameter:
    //    Data type,      Name,       (I/O/U) Description
    //    String          stringStr         (I)   String to convert
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // .Detail description
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public int
    StrToInt( String string )
    {
       return Integer.parseInt( string );
    }

    /*
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // .Function Name: >>>IsNumber
    //
    // .Description: Is String a Number
    //
    // .Return Value: int  0=yes, 2=No
    //    (Integer Value of String )
    //
    // .Parameter:
    //    Data type,      Name,       (I/O/U) Description
    //    String          stringStr         (I)   String to convert
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // .Detail description
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public int
    IsNumber( String str )
    {
       try {
          Double.valueOf( str);
       } catch (Exception e) {
          return 2;
       }
       return 0;
    }
    /*
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // .Function Name: >>>StrToDecimal
    //
    // .Description: Convert an String to a Decimal
    //
    // .Return Value: BigDecimal
    //             0 - OK
    //             else: invalid string
    //
    // .Parameter:
    //    Data type,      Name,       (I/O/U) Description
    //    String          stringStr         (I)   String to convert
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // .Detail description
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public Double
    StrToDecimal( String stringStr )
    {
 	   if ( stringStr == null )
 		   return 0.0;

 	   if ( stringStr.equals("") )
 		   return 0.0;


          return Double.valueOf( stringStr );
  
    }

    /*
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // .Function Name: >>>IntToDecimal
    //
    // .Description: Convert an Int to a Decimal
    //
    // .Return Value: BigDecimal
    //             0 - OK
    //             else: invalid string
    //
    // .Parameter:
    //    Data type,      Name,       (I/O/U) Description
    //    String          stringStr         (I)   String to convert
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // .Detail description
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public Double
    IntToDecimal( Integer intStr )
    {

          return intStr.doubleValue();
  
    }
    /*
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // .Function Name: >>>DecimalToInt
    //
    // .Description: Convert an Decimal to a Int
    //
    // .Return Value: Int
    //             0 - OK
    //             else: invalid string
    //
    // .Parameter:
    //    Data type,      Name,       (I/O/U) Description
    //    String          stringStr         (I)   String to convert
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // .Detail description
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public Integer
    DecimalToInt( Double intStr )
    {

          return intStr.intValue();
  
    }
    /*
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // .Function Name: >>>CodeToChar
    //
    // .Description: Returns the Char for the given code
    //
    // .Return Value: zVOID
    //
    // .Parameter:
    //    Data type,      Name,       (I/O/U) Description
    //    String          stringStr     (O)   String, which contains the char
    //    int             sCode         (I)   Code for Char
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // .Detail description
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public String
    CodeToChar( String stringStr, int sCode )
    {
       char[] arrayChar = new char[ 2 ];

        arrayChar[ 0 ] = (char) (sCode & 0x00ff);
        arrayChar[ 1 ] = (char) 0;
        arrayChar[ 2 ] = 'x';  // testing to ensure array bounds checking occurs at run time
        return stringStr = arrayChar.toString( );
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    // .Function Name: >>>CharToCode
    //
    // .Description: Returns the code of the first char in string
    //
    // .Return Value: int - code for char
    //
    // .Parameter:
    //    Data type,      Name,       (I/O/U) Description
    //    String          stringStr         (I)   String with char on first pos
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // .Detail description
    //
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    CharToCode( String stringStr )
    {
       int nCode = 0;

       nCode = (int) stringStr.charAt( 0 );
       return nCode;
    }

    public MutableInt
    GetDateAttributeDifferenceInDays( MutableInt    lDays,
                                      View   srcView,
                                      String srcEntityName,
                                      String srcAttributeName,
                                      View   tgtView,
                                      String tgtEntityName,
                                      String tgtAttributeName )
    {
       DateTimeRecord  SourceDate = null;
       DateTimeRecord  TargetDate = null;
       String          stringSourceDate = null;
       String          stringTargetDate = null;
       int             lDaysTmp;
       int 			   days = 0;

       // read the attributes

       DateTime BeginDate = srcView.cursor(srcEntityName).getAttribute(srcAttributeName).getDateTime();
       DateTime EndDate = tgtView.cursor(tgtEntityName).getAttribute(tgtAttributeName).getDateTime();

       if ( BeginDate != null && EndDate != null)
    	   days = Days.daysBetween( EndDate, BeginDate).getDays();

       lDays.setValue(days);

       return lDays;
    }


    public int GetEntityNameFromStructure( String stringInternalEntityStructure, StringBuilder returnEntityName )
    {
        returnEntityName.setLength( 0 );
        returnEntityName.append( stringInternalEntityStructure );
        return 0;
    }

    public String GetEntityNameFromStructure( String stringInternalEntityStructure, String returnEntityName )
    {
     // returnEntityName = stringInternalEntityStructure;
     // return returnEntityName;
       return stringInternalEntityStructure;
    }

    public int
    AddWorkingDaysToDate( View   tgtView,
                          String tgtEntityName,
                          String tgtAttributeName,
                          int    lWorkingDays )
    {
       int  lRegularDays;
       int  lRemainder;
       int  nRC;

       // Convert Working Days to Regular Days and add them to a Date Attribute.
       // To determine regular days, we will take working daYS and
       // simply multiply by 7/5, using remainder and not fraction.
       // Thus 8 working days is divided by 5 to get 1 with remainder 3.
       // We multiply the 1 by 7 and add the 3 to get 10.
       lRegularDays = lWorkingDays / 5;
       lRemainder   = lWorkingDays - (lRegularDays * 5);
       lRegularDays = (lRegularDays * 7) + lRemainder;

       nRC = AddToAttributeFromVariable( tgtView, tgtEntityName, tgtAttributeName,
                                         lRegularDays, zTYPE_INTEGER, 0, "Day" );
       return nRC;
    }

    public int
    CompareAttributeByShortString( View   view,
                                   String entityName,
                                   String attributeName,
                                   String compareValue )

    {
        String  stringTempString = null;
        int nLth = 0;
        int nRC;

        stringTempString = GetVariableFromAttribute( stringTempString, nLth, zTYPE_STRING, 254,
                                                     view, entityName, attributeName, "", 0 );

    // nLth = stringStringValue.length( );
       nRC = stringTempString.compareTo( compareValue );
       return nRC;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: ActivateWorkObjectFromFile
    //
    // Activate a work object from a file
    //
    public int
    ActivateWorkObjectFromFile( zVIEW  vWorkView,
                                String stringFileName,
                                String stringLOD_Name,
                                View   ViewToWindow ) throws IOException
    {
       int  file;
       int  nRC;

       // First make sure the file exists. If not, return an error code.
       file = m_KZOEP1AA.SysOpenFile( ViewToWindow, stringFileName, COREFILE_READ );
       if ( file == -1 )
          return -1;

       m_KZOEP1AA.SysCloseFile( ViewToWindow, file, 0 );

       // Next Activate the OI from the file just created.
       nRC = ActivateOI_FromFile( vWorkView, stringLOD_Name, ViewToWindow,
                                  stringFileName, zSINGLE );
       return nRC;

    } // ActivateWorkObjectFromFile

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AddDaysToDate
    //
    // Add Days To a Date Attribute
    //
    public int  // TODO
    AddDaysToDate( View view, String entityName, String attributeName, int days )
    {
      int nRC;

      nRC = AddToAttributeFromVariable( view, entityName,
                                        attributeName, days,
                                        zTYPE_INTEGER, 0, "Day" );
      return nRC;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AddMonthsToDate
    //
    // Add Months To a Date Attribute
    //
    public int  // TODO
    AddMonthsToDate( View view,
                   String entityName,
                   String attributeName,
                   int months )  // Days or Months?
    {
       int nRC;

       nRC = AddToAttributeFromVariable( view, entityName,
                                         attributeName, months,
                                         zTYPE_INTEGER, 0, "Month" );
       return nRC;
    } // AddDaysToDate


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: SeparateName
    //
    // Separate a name into first and last names
    //
    public int
    SeparateName( String        fullName,
                  StringBuilder firstName,
                  StringBuilder lastName )
    {
    // String lpNext;
       int k = 0;
       int nLth = fullName.length( );

       String s = fullName.trim( );  // remove whitespace from beginning and end of FullName

       // Eliminate any "Mr." or "Ms." characters in front of the name and then point to first non-blank.
       if ( s.charAt( k ) == 'M' && (s.charAt( k + 1 ) == 'r' || s.charAt( k + 1 ) == 's') && s.charAt( k + 2 ) == '.' )
       {
          k = 3;
           while ( s.charAt( k ) == ' ' )
              k++;
       }

       // put original string into an array of chars
       //
    // char[] charArray = new char[ nLth + 1 ];  // we are eliminating characters, so this should be plenty of room
       int j = 0;
       int nLastBegin = 0;
    // int nFirstEnd = 0;
       while ( k <= nLth )
       {
          if ( nLastBegin == 0 )
          {
             if ( s.charAt( k ) == ' ' || s.charAt( k ) == '\t' )
             {
             // nFirstEnd = k;
                firstName.insert( j++, '\0' );  // terminate first name
                nLastBegin = k + 1;

                // Skip to next non-blank or end of string.
                while ( s.charAt( nLastBegin ) == ' ' || s.charAt( nLastBegin ) == '\t' )
                   nLastBegin++;

                j = 0;  // process last name
                while ( nLastBegin <= nLth )
                   lastName.insert( j++, s.charAt( nLastBegin++ ) );

                break;  // out of outer while loop
                }
             else
             {
                firstName.insert( j++, s.charAt( k++ ) );  // process the First Name (all chars to the first blank)
             }
          }
       }

       return 0;
    } // SeparateName



    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AddressFormatToMultiLine
    //
    // can be used for display or labels
    //
    public int
    AddressFormatToMultiLine( String stringMultiLineAddress,
                              String stringLine1,
                              String stringLine2,
                              String stringLine3,
                              String stringCity,
                              String stringState,
                              String stringPostalCode )
    {
       String stringFirstPart = null;

       if ( stringLine1.isEmpty( ) == false )
          stringFirstPart = zsprintf( stringFirstPart, "%s\n", stringLine1 );

       if ( stringLine2.isEmpty( ) == false )
          stringFirstPart = zsprintf( stringFirstPart, "%s%s\n", stringFirstPart, stringLine2 );

       if ( stringLine3.isEmpty( ) == false )
          stringFirstPart = zsprintf( stringFirstPart, "%s%s\n", stringFirstPart, stringLine3 );

       stringMultiLineAddress = zsprintf( stringMultiLineAddress, "%s\n%s, %s %s", stringFirstPart,
                                          stringCity, stringState, stringPostalCode );
       return 0;
    } // AddressFormatToMultiLine

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: dAdressLabel
    //
    // multiline address (without name)
    //
    public String
    fnAdressLabelText( View  vAnyObject,  // BASED ON LOD "any object with entity that has address attributes"
                       String stringInternalEntityStructure,
                       String stringInternalAttribStructure,
                       String stringReturnText )
    {
       String entityName = null;
       String stringAttribName = null;
       String stringMultiLineAddress = null;
       StringBuilder sb = new StringBuilder( );
       String stringAttn = null;
       String stringCity = null;
       String stringState = null;
       String stringZipCode = null;
       String stringZipCodeFormatted = null;
       String stringCountry = null;
       StringBuilder stringSep = new StringBuilder();      // set to /r/n or "; "

       // NEED TO FIX THIS CAUSE I GET TOO MANY ERRORS MAINLY WITH IsValidAttribute
       //return "";

       entityName = zstrcpy( entityName, stringInternalEntityStructure );
       stringAttribName = zstrcpy( stringAttribName, stringInternalAttribStructure );
       if ( ZeidonStringCompare( stringAttribName, 1, 5, "dLine", 1, 5, 33 ) == 0 )
    	   zstrcpy( stringSep, "; " );
       else
    	   zstrcpy( stringSep, "&#xA;" );

       stringMultiLineAddress = "";
       stringAttn = "";
       //sb.setCharAt( 0, '\0' );

       if ( IsValidAttribute ( vAnyObject, "AttentionLine1", stringInternalEntityStructure ) == 0 )
          GetStringFromAttribute( sb, vAnyObject, entityName, "AttentionLine1" );

       if ( sb.length( ) != 0 )
       {
          stringAttn = zsprintf( stringAttn, "Attn:  %s%s", sb, stringSep );
          sb.setLength( 0 );
       }

       if ( IsValidAttribute ( vAnyObject, "AttentionLine2", stringInternalEntityStructure ) == 0 )
          GetStringFromAttribute( sb, vAnyObject, entityName, "AttentionLine2" );

       if ( sb.length( ) != 0 )
       {
         stringAttn = zsprintf( stringAttn, "%s         %s%s", stringAttn, sb, stringSep );
         sb.setLength( 0 );
       }

       if ( stringAttn.length( ) != 0 )
          ZeidonStringCopy( stringMultiLineAddress, 1, 0, stringAttn, 1, 0, 2000 );

       if ( IsValidAttribute ( vAnyObject, "Line1", stringInternalEntityStructure ) == 0 )
          GetStringFromAttribute( sb, vAnyObject, entityName, "Line1" );

       if ( sb.length( ) != 0 )
    	   stringMultiLineAddress = zsprintf( stringMultiLineAddress, "%s%s%s", stringMultiLineAddress, sb.toString(), stringSep );

       if ( IsValidAttribute ( vAnyObject, "Line2", stringInternalEntityStructure ) == 0 )
          GetStringFromAttribute( sb, vAnyObject, entityName, "Line2" );
       else
    	   sb.setLength( 0 );

       if ( sb.length( ) != 0 )
          stringMultiLineAddress = zsprintf( stringMultiLineAddress, "%s%s%s", stringMultiLineAddress, sb.toString(), stringSep );

       if ( IsValidAttribute ( vAnyObject, "Line3", stringInternalEntityStructure ) == 0 )
          GetStringFromAttribute( sb, vAnyObject, entityName, "Line3" );
       else
    	  sb.setLength( 0 );

       if ( sb.length( ) != 0 )
          stringMultiLineAddress = zsprintf( stringMultiLineAddress, "%s%s%s", stringMultiLineAddress, sb, stringSep );

       stringCity = GetStringFromAttribute( stringCity, vAnyObject, entityName, "City" );
       //GetStringFromAttribute( stringState, vAnyObject, entityName, "State" );
       stringState = GetVariableFromAttribute( stringState, 0, zTYPE_STRING, 120,
                                           vAnyObject, entityName,
                                           "StateProvince", "State", 0 );
       if ( stringState.length( ) == 0 )
       {
          if ( IsValidAttribute ( vAnyObject, "InternationalRegion", stringInternalEntityStructure ) == 0 )
            stringState = GetVariableFromAttribute( stringState, 0, zTYPE_STRING, 120,
                                                  vAnyObject, entityName,
                                                  "InternationalRegion", "", 0 );
       }

       // For ZipCodes larger than five characters, we want to format them with a
       // dash, if they don't already have a dash.
       stringZipCode = GetVariableFromAttribute( stringZipCode, 0, zTYPE_STRING, 11,
                                            vAnyObject, entityName, "PostalCode", "", 0 );
       if ( stringZipCode.length( ) > 5 && stringZipCode.charAt( 5 ) != '-' )
            stringZipCodeFormatted = stringZipCode.substring( 0, 4 ) + "-" + stringZipCode.substring( 5, -1 );
       else
         stringZipCodeFormatted = stringZipCode;

       stringCountry = "";
       if ( IsValidAttribute ( vAnyObject, "Country", stringInternalEntityStructure ) == 0 )
          GetStrFromAttrByContext( sb, 50, vAnyObject, entityName, "Country", "Country" );

       if ( sb.equals( "US" ) == true )
          stringCountry = "";
       else
          stringCountry = sb.toString( );

       if ( stringCity.length( ) != 0 )
          stringMultiLineAddress = zsprintf( stringMultiLineAddress, "%s%s, %s %s %s", stringMultiLineAddress,
                                             stringCity, stringState, stringZipCodeFormatted, stringCountry );
       else
          stringMultiLineAddress = zsprintf( stringMultiLineAddress, "%s%s %s %s", stringMultiLineAddress,
                                             stringState, stringZipCodeFormatted, stringCountry );

       stringReturnText = ZeidonStringCopy( stringReturnText, 1, 0, stringMultiLineAddress, 1, 0, 255 );

       return stringReturnText;

    } // fnAdressLabelText

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: dAdressLabel
    //
    // multiline address (without name)
    //
    public int /* DERIVED ATTRIBUTE */
    dAdressLabel( View  vAnyObject,  // BASED ON LOD "any object with entity that has address attributes"
                  String stringInternalEntityStructure,
                  String stringInternalAttribStructure,
                  int nGetOrSetFlag )
    {
       String stringMultiLineAddress = null;
       String entityName = null;

       entityName = zstrcpy( entityName, stringInternalEntityStructure );
       if ( CheckExistenceOfEntity( vAnyObject, entityName ) != 0)
       {
          return 0;
       }

       stringMultiLineAddress = fnAdressLabelText( vAnyObject, stringInternalEntityStructure,
                                                 stringInternalAttribStructure, stringMultiLineAddress );

       StoreStringInRecord( vAnyObject, stringInternalEntityStructure,
                            stringInternalAttribStructure, stringMultiLineAddress );

       return 0;

    } // dAdressLabel

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: dAdressLabel
    //
    // multiline address (with name)
    //
    public int /* DERIVED ATTRIBUTE */
    dAdressLabelFull( View  vAnyObject,  // BASED ON LOD "any object with entity that has address attributes"
                      String stringInternalEntityStructure,
                      String stringInternalAttribStructure,
                      int nGetOrSetFlag )
    {
       String entityName = null;
       String stringMultiLineAddress;
       String string = null;
       String stringCompanyName;

       entityName = zstrcpy( entityName, stringInternalEntityStructure );
       if ( CheckExistenceOfEntity( vAnyObject, entityName ) != 0 )
       {
          return 0;
       }

       stringMultiLineAddress = "";
       stringCompanyName = "";
       //if ( IsValidAttribute ( "CompanyName", stringInternalEntityStructure ) == 0 )
       //   stringCompanyName = GetStringFromAttribute( stringCompanyName, vAnyObject, entityName, "CompanyName" );

       if ( stringCompanyName.length( ) != 0 )
          stringMultiLineAddress = zsprintf( stringMultiLineAddress, "%s\r\n", stringCompanyName );

       string = fnAdressLabelText( vAnyObject, stringInternalEntityStructure, stringInternalAttribStructure, string );

       stringMultiLineAddress = ZeidonStringConcat( stringMultiLineAddress, 1, 0, string, 1, 0, 2000 );

       StoreStringInRecord( vAnyObject, stringInternalEntityStructure,
                            stringInternalAttribStructure, stringMultiLineAddress );

       return 0;
    } // dAdressLabelFull

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: PersonName_LastFirstMiddle
    //
    // Person's name formatted Last Name first
    //
    public int /* DERIVED ATTRIBUTE */
    PersonName_LastFirstMiddle( View  vAnyObject,  // BASED ON LOD "any object with entity that has "NAME" attributes"
                                String stringInternalEntityStructure,
                                String stringInternalAttribStructure,
                                int nGetOrSetFlag )
    {
       String stringLastFirstMiddle;
       String entityName = null;
       String string;

       entityName = zstrcpy( entityName, stringInternalEntityStructure );
       stringLastFirstMiddle = "";
       string = "";

       // Last Name
       if ( IsValidAttribute( "LastName", stringInternalEntityStructure ) == 0 )
          stringLastFirstMiddle = GetStringFromAttribute( stringLastFirstMiddle, vAnyObject, entityName, "LastName" );

       // First Name
       if ( IsValidAttribute( "FirstName", stringInternalEntityStructure ) == 0 )
          string = GetStringFromAttribute( string, vAnyObject, entityName, "FirstName" );

       if ( string.length( ) != 0 )
       {
          stringLastFirstMiddle = ZeidonStringConcat( stringLastFirstMiddle, 1, 0, ", ", 1, 0, 101 );
          stringLastFirstMiddle = ZeidonStringConcat( stringLastFirstMiddle, 1, 0, string, 1, 0, 101 );
          string = "";
       }

       // Middle Name
       if ( IsValidAttribute ( "MiddleName", stringInternalEntityStructure ) == 0 )
          string = GetStringFromAttribute( string, vAnyObject, entityName, "MiddleName" );

       if ( string.length( ) != 0 )
       {
          stringLastFirstMiddle = ZeidonStringConcat( stringLastFirstMiddle, 1, 0, " ", 1, 0, 101 );
          stringLastFirstMiddle = ZeidonStringConcat( stringLastFirstMiddle, 1, 0, string, 1, 0, 101 );
          if ( string.length( ) == 1 )
             stringLastFirstMiddle = ZeidonStringConcat( stringLastFirstMiddle, 1, 0, ".", 1, 0, 101 );

          string = "";
       }

       // Suffix
       if ( IsValidAttribute ( "Suffix", stringInternalEntityStructure ) == 0 )
          string = GetStringFromAttribute( string, vAnyObject, entityName, "Suffix" );

       if ( zstrlen( string ) != 0 )
       {
          stringLastFirstMiddle = ZeidonStringConcat( stringLastFirstMiddle, 1, 0, " ", 1, 0, 101 );
          stringLastFirstMiddle = ZeidonStringConcat( stringLastFirstMiddle, 1, 0, string, 1, 0, 101 );
          string = "";
       }

       StoreStringInRecord( vAnyObject, stringInternalEntityStructure,
                            stringInternalAttribStructure, stringLastFirstMiddle );

       return 0;
    } // dAdressLabel

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: PersonName_FirstMiddleLast
    //
    // Person's name formatted Last Name last
    //
    public int /* DERIVED ATTRIBUTE */
    PersonName_FirstMiddleLast( View  vAnyObject,  // BASED ON LOD "any object with entity that has "NAME" attributes"
                                String stringInternalEntityStructure,
                                String stringInternalAttribStructure,
                                int nGetOrSetFlag )
    {
       StringBuilder stringReturnName = new StringBuilder( );
       String entityName = null;
       StringBuilder string = new StringBuilder( );

       entityName = zstrcpy( entityName, stringInternalEntityStructure );
       stringReturnName.append("");
       string.append("");

       // Last Name
       if ( IsValidAttribute ( "FirstName", stringInternalEntityStructure ) == 0 )
          GetStringFromAttribute( stringReturnName, vAnyObject, entityName, "FirstName" );

       // Middle Name
       if ( IsValidAttribute ( "MiddleName", stringInternalEntityStructure ) == 0 )
          GetStringFromAttribute( string, vAnyObject, entityName, "MiddleName" );
       if ( zstrlen( string ) != 0 )
       {
          ZeidonStringConcat( stringReturnName, 1, 0, " ", 1, 0, 101 );
          ZeidonStringConcat( stringReturnName, 1, 0, string, 1, 0, 101 );
          if ( zstrlen( string ) == 1 )
             ZeidonStringConcat( stringReturnName, 1, 0, ".", 1, 0, 101 );

          string.append("");
       }

       // Last Name
       if ( IsValidAttribute ( "LastName", stringInternalEntityStructure ) == 0 )
          GetStringFromAttribute( string, vAnyObject, entityName, "LastName" );

       if ( zstrlen( string ) != 0 )
       {
          ZeidonStringConcat( stringReturnName, 1, 0, " ", 1, 0, 101 );
          ZeidonStringConcat( stringReturnName, 1, 0, string, 1, 0, 101 );
          string.append("");
       }

       // Suffix
       if ( IsValidAttribute ( "Suffix", stringInternalEntityStructure ) == 0 )
          GetStringFromAttribute( string, vAnyObject, entityName, "Suffix" );

       if ( zstrlen( string ) != 0 )
       {
          ZeidonStringConcat( stringReturnName, 1, 0, " ", 1, 0, 101 );
          ZeidonStringConcat( stringReturnName, 1, 0, string, 1, 0, 101 );
          string.append("");
       }

       StoreStringInRecord( vAnyObject, stringInternalEntityStructure,
                            stringInternalAttribStructure, stringReturnName.toString() );

       return 0;
    } // dAdressLabel

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: zTrim
    //
    // trim whitespace from front and back
    //
    // Remove whitespace at the beginning and end of a string.
    //
    public int
    zTrim( StringBuilder stringStringInOut )
    {
        String s = StringUtils.trim( stringStringInOut.toString() );
        stringStringInOut.replace( 0, stringStringInOut.length(), s );
        return 0;
    } // zTrim

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: strLeft
    //
    // return left number of characters of a string.
    //
    //
    public int
    strLeft( StringBuilder stringStringInOut, int retlen )
    {
        String s = stringStringInOut.toString();
	if ( retlen > s.length() )
		return -2;
        stringStringInOut.replace( 0, stringStringInOut.length(), s.substring(0, retlen) );
        return 0;
    } // strLeft

   ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: strLen
    //
    // return length of a string.
    //
    //
    public int
    strLen( String StringIn )
    {
 	return StringIn.length();
    } // strLen


   ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: strIsInteger
    //
    // return 1 if integer, 0 if not
    //
    //
    public int
    strIsInteger( String StringIn )
    {
	if (StringUtils.isNumeric(StringIn))
            return 1;
        else
            return 0;
    } // strIsInteger

   ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: strIsNumber
    //
    // return 1 if it is a number (float or integer, or hex, or scientific notation), 0 if not
    //
    //
    public int
    strIsNumber( String StringIn )
    {
 	//if (NumberUtils.isNumber(StringIn))
	if (StringIn.matches("^[-+]?\\d+(\\.\\d+)?$"))
            return 1;
        else
            return 0;

    } // strLen


   ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: strSubstringCompareIgnoreCase
    //
    // returns 1 if the substring exists, else 0
    //
    //
    public int
    strSubstringCompareIgnoreCase( String MainStringVal, String SubStringVal )
    {
	String MainStringNoCase;

	MainStringNoCase = MainStringVal.toLowerCase();
	if ( MainStringNoCase.contains(SubStringVal.toLowerCase()) )
		return 1;
        else
		return 0;
    } // strSubstringCompareIgnoreCase


   ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: strLower
    //
    // return string in lowercase
    //
    //
    public int
    strLower( StringBuilder stringStringInOut )
    {
        String s = StringUtils.trim( stringStringInOut.toString() );
        stringStringInOut.replace( 0, stringStringInOut.length(), s.toLowerCase() );
        return 0;
    } // strLower

   ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: strUpper
    //
    // return string in upper case
    //
    //
    public int
    strUpper( StringBuilder stringStringInOut )
    {
        String s = StringUtils.trim( stringStringInOut.toString() );
        stringStringInOut.replace( 0, stringStringInOut.length(), s.toUpperCase() );
        return 0;
    } // strUpper

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: strFirstWord
    //
    // Get the first characters up to a space in a string
    //
    //
    public int
    strFirstWord( StringBuilder stringStringInOut )
    {
        String s = StringUtils.trim( stringStringInOut.toString() );
	if (s.contains(" ") ) // if there is a space, return string chopped, otherwise return all of the string.
 		stringStringInOut.replace( 0, stringStringInOut.length(), s.substring(0, s.indexOf(" ")) );
        return 0;
    } // strFirstWord

    public String
    zTrim( String stringStringInOut )
    {
       return stringStringInOut.trim( );
    } // zTrim

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: SetDecimalPrecisionRounded
    //
    public Double
    SetDecimalPrecisionRounded( Double pdDecimalValue,
                                int ulNumberOfDecimals )
    {
       StringBuilder sb = new StringBuilder( ulNumberOfDecimals > 0 ? ulNumberOfDecimals + 5 : 25 );

       SysConvertDecimalToString( pdDecimalValue, sb, (int) ulNumberOfDecimals );
       MutableDouble d = new MutableDouble( pdDecimalValue );
       SysConvertStringToDecimal( sb.toString( ), d );
       return d.toDouble( );

    }  // SetDecimalPrecisionRounded

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: RemoveLeadingBlanksFromAttrib
    //
    public int
    RemoveLeadingBlanksFromAttrib( View   view,
                                   String stringEntity,
                                   String stringAttribute )
    {
       StringBuilder sb = new StringBuilder( 256 );
       MutableInt i = new MutableInt( 0 );
       int k;

       // Remove any leading blanks from the attribute.

       GetVariableFromAttribute( sb, i, zTYPE_STRING, 253,
                                 view, stringEntity, stringAttribute, "", 0 );
       if ( sb.charAt( 0 ) == ' ' )
       {
          k = 1;

          while ( sb.charAt( k ) == ' ' )
             k++;

          SetAttributeFromString( view, stringEntity, stringAttribute, sb.substring( k ) );
       }

       return 0;

    } // RemoveLeadingBlanksFromAttrib

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: RemoveLeadingZerosFromAttrib
    //
    public int
    RemoveLeadingZerosFromAttrib( View   view,
                                  String stringEntity,
                                  String stringAttribute )
    {
       StringBuilder sb = new StringBuilder( 256 );
       MutableInt i = new MutableInt( 0 );
       int k;

       // Remove any leading zeros from the attribute.

       GetVariableFromAttribute( sb, i, zTYPE_STRING, 253,
                                 view, stringEntity, stringAttribute, "", 0 );
       if ( sb.charAt( 0 ) == '0' )
       {
          k = 1;

          while ( sb.charAt( k ) == '0' )
             k++;

          SetAttributeFromString( view, stringEntity, stringAttribute, sb.substring( k ) );
       }

       return 0;

    } // RemoveLeadingZerosFromAttrib

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: FindStringInAttribute
    //
    //    Find a string within a string attribute. Not case sensitive.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    FindStringInAttribute( String stringSearchString,
                           View   view,
                           String entityName,
                           String attributeName )
    {
       String stringAttributeValue = null;
       String stringFoundValue;

       // Look for a match on the string stringSearchString within the attribute.
       // Return 0 if found.
       // Return -1 if not found.
       stringAttributeValue = GetStringFromAttribute( stringAttributeValue, view, entityName, attributeName );
       stringFoundValue = zstrstr( stringAttributeValue, stringSearchString );
       if ( stringFoundValue == null )
          return -1;  // the string was not found
       else
          return 0;   // the string was found

    } // FindStringInAttribute

    public int
    ConvertExternalValueOfAttribute( StringBuilder lpReturnedString,
                                     String srcString,
                                     View   lpView,
                                     String entityName,
                                     String attributeName )
    {
       // TODO - Convert code from "C"
       return( 0 );
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AddSpacesToString
    //
    //    Insert spaces within a Zeidon string name where capital letters exist.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public String
    AddSpacesToString( String stringZeidonName  )
    {
       StringBuilder sb = new StringBuilder( stringZeidonName );
       int k;

       for ( k = 1; k < sb.length( ); k++ )
       {
          if ( sb.charAt( k ) >= 'A' && sb.charAt( k ) <= 'Z' )
          {
             sb.insert( k, ' ' );
             k++;
          }
       }

       return sb.toString( );

    } // AddSpacesToString

     int
    ParseOutEntityAttribute( String entityDotAttribute,
                             StringBuilder entityName,
                             StringBuilder attributeName )
    {
       int k;
       int lSkipLth;

       // Initialize entityName and attributeName.
       entityName.replace( 0, -1, entityDotAttribute );
       attributeName.delete( 0, -1 );
             // entityDotAttribute is pointing to the first character of the entity name on entry to this routine.
       // Parse out Entity Name

       for ( k = 0; k < entityName.length( ); k++ )
       {
          char ch = entityName.charAt( k );
          if ( ch == '.' || ch == ']' || ch == '}' )
          {
             entityName.setCharAt( k, '\0' );
             if ( ch == '}' )
               return -2;

             if ( ch != ']' )  // there is an attribute, so keep going
             {
                int j = 0;
                k++;

                   // Parse out Attribute Name
                ch = entityDotAttribute.charAt( k );
                while ( ch != ']' && ch != '}' )
                {
                   if ( ch == '}' )
                      return -2;

                   attributeName.setCharAt( j, ch );
                   j++;
                   k++;
                   ch = entityDotAttribute.charAt( k );
                }

                attributeName.setCharAt( k, '\0' );
             }
          }
       }

       lSkipLth = k + 1;  // TODO not sure this translation to java is exactly right for SkipLth
       return lSkipLth;
    }

    int
    ConvertCharacterString( StringBuilder sbTarget,
                      StringBuilder sbSource,
                      StringBuilder sbOrigMemory,
                            int  nFileType )  // 1-Text   2-HTML
    {
       char   ch;
       int    lTabCount;
       int    i;  // index to sbTarget
       int    j;  // index to sbSource
       int    k;

       // This code checks for "carriage return/line feed" combinations in the
       // text and inserts the correct \par and \tab strings in the target text.
    // pchTarget = *sbTarget;

       // First, determine if the start of the text is preceded by tab characters and if so, count them.
       lTabCount = 0;

       // Copy the characters, inserting \par and \tab strings as necessary for new lines.
       for ( i = 0, j = 0; (ch = sbSource.charAt( j )) != '\0'; j++ )
       {
          // Search for carriage return/line feed and insert \par and \tab strings.
          if ( ch == 13 && sbSource.charAt( j + 1 ) == 10 )
          {
             // Copy carriage control and line feed characters.
            sbTarget.setCharAt( i++ , sbSource.charAt( j++ ) );
            sbTarget.setCharAt( i++ , sbSource.charAt( j++ ) );

             // Insert \par and \tab characters.
             if ( nFileType == 1 )
             {
                i = zstrcpy( sbTarget, i, "\\par " );
             }
             else
             {
                i = zstrcpy( sbTarget, i, "<br />" );
             }

             for ( k = 0; k < lTabCount; k++ )
             {
                i = zstrcpy( sbTarget, i, "\\tab " );
             }
          }
          else
          {
           sbTarget.setCharAt( i++ , sbSource.charAt( j++ ) );
          }
       }

       sbTarget.setCharAt( i++ , '\0' );

       return( 0 );
 }



    int
    ReadFileDataIntoMemory( View    vResultSet,
                            String  stringDocumentFile,
                            long    hDocumentMemory,
                            StringBuilder sbDocumentData ) throws IOException
    {
       int  hDocumentFile;
       int  lDocumentLth;

       hDocumentMemory = 0;
       sbDocumentData.setLength( 0 );
       lDocumentLth = 0;

       hDocumentFile = m_KZOEP1AA.SysOpenFile( vResultSet, stringDocumentFile, COREFILE_READ );
       if ( hDocumentFile < 0 )
       {
       // IssueError( vResultSet, 0, 0, "Can't open Document file." );
          return -1;
       }

       lDocumentLth = m_KZOEP1AA.SysGetFileSize( vResultSet, hDocumentFile );

       // Exit if the document file is empty.
       if ( lDocumentLth == 0 )
       {
    	   m_KZOEP1AA.SysCloseFile( vResultSet, hDocumentFile, 0 );
          return 0;
       }

    // hDocumentMemory = SysAllocMemory( sbDocumentData.toString( ), lDocumentLth, 0, zCOREMEM_ALLOC, 0 );  TODO  This is all wrong ... recode correctly in Java when needed
    // DrAllocTaskMemory( ppvDocumentData, lDocumentLth );
    // TraceLine( "ReadFileDataIntoMemory: 0x%x   Size: %d",
    //            (int) *ppvDocumentData, lDocumentLth );

    // **ppvDocumentData = 0;
       m_KZOEP1AA.SysReadFile( vResultSet, hDocumentFile, sbDocumentData, lDocumentLth );
       m_KZOEP1AA.SysCloseFile( vResultSet, hDocumentFile, 0 );

       if ( sbDocumentData == null )
       {
       // SysFreeMemory( hDocumentMemory  );
       // DrFreeTaskMemory( *ppvDocumentData );
       // phDocumentMemory = 0;
          sbDocumentData = null;
          lDocumentLth = 0;
          IssueError( vResultSet, 0, 0, "Read Error on Document file" );
          return -1;
       }

       return lDocumentLth;
    }

    public int
    ParseBooleanExpression( View zqFrame )
    {
 	   //zPCHAR pchValue;
 	   //zPCHAR pchNext;
 	   String  szBooleanExpression=null;
 	   StringBuilder sbBooleanExpression=null;
 	   String  szConditionValue=null;

 	   // Parse the Boolean Expression and create each component value as an entity Component.

 	   GetStringFromAttributeByContext( sbBooleanExpression,
 	                                    zqFrame, "BooleanExpression",
 	                                    "TextValue", "", 254 );

 	   return 0;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: ReadLine5000
    //
    //    Read a line into a 5000 character string
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    ReadLine5000( View   ViewToWindow,
                  StringBuilder sbLineBuffer,
                  int    FileHandle ) throws IOException
    {
       int nRC = 0;

       nRC = m_KZOEP1AA.SysReadLine( ViewToWindow, sbLineBuffer, FileHandle );
       if ( sbLineBuffer.length( ) == 0 )
          return 0;

       if ( sbLineBuffer.length( ) > 5000 )
       {
          TraceLineS( "////////////* > 5000", "//////////*" );
          sbLineBuffer.setCharAt( 5000, '\0' );
       }

       //return sbLineBuffer.toString( );
       return nRC;

    } // ReadLine5000

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: ValidateEmailAddress
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    ValidateEmailAddress (String emailEntered) 
    {
       boolean validemail = EmailValidator.getInstance().isValid(emailEntered);
       if (validemail) 
	  return 0;
       else
          return -1;
    } // ValidateEmailAddress


   

////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Method Name: getSalt()
//
// Creates a random salt to use with a password hash.
//
// Gotten from site: http://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public String getSalt() throws NoSuchAlgorithmException
{
    String saltStr;
    StringBuffer sb = new StringBuffer();
    SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");

    //Create array for salt
    byte[] salt = new byte[20];

    //Get a random salt
    sr.nextBytes(salt);

    // change to hex string
    for(int i=0; i< salt.length ;i++)
         {
            sb.append(Integer.toString((salt[i] & 0xff) + 0x100, 16).substring(1));
         }

    // convert to string
    saltStr = sb.toString();
    //return salt as hex string
    return saltStr;
}


////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Method Name: GetHexHash
//
// Creates a hash of a string in hex format
//
// Hash types allowed: MD5, SHA-1, SHA-256, SHA-384, SHA-512
// Currently salts are not supported
// Hash string is returned in HashString
//
////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    GetHexHash ( String InputString, StringBuilder HashString, String EncryptType) throws IOException
    {
 	StringBuffer sb = new StringBuffer();

	if ( !EncryptType.equals("MD5") && !EncryptType.equals("SHA-1") && !EncryptType.equals("SHA-256") && !EncryptType.equals("SHA-384") && !EncryptType.equals("SHA-512") ) {
                zstrcpy( HashString,""); // still null
		return -1;
           }   // not a supported encryption type


	if ( InputString == "" || InputString == null) {
		zstrcpy( HashString,""); // still null
		return -1;  // empty InputString not allowed
           }

        try {
            MessageDigest md = MessageDigest.getInstance(EncryptType);
            md.update(InputString.getBytes());
            byte[] bytes = md.digest();

            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
	    zstrcpy( HashString,"");
	    return -1;
        }

	zstrcpy( HashString,sb.toString());
        return 0;
    } // GetHexHash


////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Method Name: GetPasswordHash
//
// Requires: sHost to be a named view
//
// Returns a hashed password in hex in SHA-256 hashing format without salt.
//
// Defaults to SHA-256 without salt if no choice is defined in sHost.
//
////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    GetPasswordHash ( View ViewToWindow, String InputString, StringBuilder OutHashString, StringBuilder OutSalt) throws IOException
    {
	StringBuilder HashedString;
	int retVal = 0;
        int RESULT = 0;
	String encryptchoice = "SHA-256";
        String saltchoice = "N";
	String saltVal = "";

	HashedString = new StringBuilder();

	zVIEW sHostHash = new zVIEW();
 	RESULT = ActivateObjectInstance( sHostHash, "sHost", ViewToWindow, 0, zSINGLE );
	if (RESULT < 0) { // error occurred
		return -1;
	    }
 	encryptchoice = sHostHash.cursor("Host").getAttribute("HashMethod").getString().trim();
	saltchoice = sHostHash.cursor("Host").getAttribute("HashSalt").getString().trim();
        DropView( sHostHash);

	if ( InputString.equals("") || InputString.equals(null)) {
		zstrcpy( OutHashString,"");
		return 1;  // empty InputString not allowed
           }

	if ( !encryptchoice.equals("MD5") && !encryptchoice.equals("SHA-1") && !encryptchoice.equals("SHA-256") && !encryptchoice.equals("SHA-384") && !encryptchoice.equals("SHA-512") ) {
                zstrcpy( OutHashString,"");  // still null
		zstrcpy( OutSalt,"");
		return 2;
           }   // not a supported encryption type

	if ( encryptchoice.equals("") || encryptchoice.equals(null)) {
		encryptchoice = "SHA-256";
           }

	if (saltchoice.equals("") || saltchoice.equals(null)) {
		saltchoice = "N";
	   }

	if (saltchoice.equals("Y")) {
		try {
			saltVal = getSalt();
			InputString = saltVal+InputString;
		    }
		catch (NoSuchAlgorithmException e)
        	    {
            		e.printStackTrace();
	    		zstrcpy( OutHashString,"");
			zstrcpy( OutSalt,"");
	    		return -1;
        	     }
	    }

 	retVal = GetHexHash(InputString,HashedString,encryptchoice);
	if (retVal < 0 ) {
           zstrcpy( OutHashString,"");
	   return -1;  // error
           }
	zstrcpy( OutHashString,HashedString);
	zstrcpy( OutSalt, saltVal);
        return 0;
   } // GetPasswordHash

////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Method Name: CheckPasswordInternal
//
// If an error occurs, it returns -1, if the passwords don't match 0 is returned, if passwords do match, 1 is returned
//
////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    CheckPasswordInternal ( View ViewToWindow, String Username, String EnteredPass) throws IOException
    {
	StringBuilder HashedEnteredPass;
	int retVal = 0;
 	int RESULT = 0;
	String userSalt = "";
	String userHash = "";
	String testPass = "";
	String encryptchoice = "SHA-256";
	String saltchoice = "N";
        HashedEnteredPass = new StringBuilder();
   	zVIEW mUserChk = new zVIEW( );
	zVIEW vQualObject = new zVIEW();
	zVIEW sHostAuth = new zVIEW( );

	if (Username.equals("") || Username.equals(null) || EnteredPass.equals("") || EnteredPass.equals(null) ) {
		return -1;  // empty Input strings not allowed
           }

	// get encryption choice (defaults to SHA-256/no salt if non is defined in the host table
  	RESULT = ActivateObjectInstance( sHostAuth, "sHost", ViewToWindow, 0, zSINGLE );
	if (RESULT < 0) { // error occurred
		return -1;
	    }
 	encryptchoice = sHostAuth.cursor("Host").getAttribute("HashMethod").getString().trim();
	saltchoice = sHostAuth.cursor("Host").getAttribute("HashSalt").getString().trim();
	DropView( sHostAuth );

	if ( encryptchoice.equals("") || encryptchoice.equals(null)) {
		encryptchoice = "SHA-256";
           }

	if (saltchoice.equals("") || saltchoice.equals(null)) {
		saltchoice = "N";
	   }

	// Create a query object to find the user entered
   	RESULT = SfActivateSysEmptyOI( vQualObject, "KZDBHQUA", ViewToWindow, zMULTIPLE );
   	CreateEntity( vQualObject, "EntitySpec", zPOS_AFTER );
   	SetAttributeFromString( vQualObject, "EntitySpec", "EntityName", "User" );
   	CreateEntity( vQualObject, "QualAttrib", zPOS_AFTER );
   	SetAttributeFromString( vQualObject, "QualAttrib", "EntityName", "User" );
   	SetAttributeFromString( vQualObject, "QualAttrib", "AttributeName", "UserName" );
   	SetAttributeFromString( vQualObject, "QualAttrib", "Value", Username.trim());
   	SetAttributeFromString( vQualObject, "QualAttrib", "Oper", "=" );
  	RESULT = ActivateObjectInstance( mUserChk, "mUser", ViewToWindow, vQualObject, zSINGLE );
        DropView( vQualObject );

	if (RESULT < 0) {  // no user exists with that username
		DropView( mUserChk );
		return -1;
		}

	if (saltchoice.equals("Y") ) {
		userSalt = mUserChk.cursor("User").getAttribute("PasswordSt").getString();
		}
	userHash = mUserChk.cursor("User").getAttribute("JavaPassword").getString();
	DropView( mUserChk );
	testPass = userSalt+EnteredPass;
	retVal = GetHexHash(testPass,HashedEnteredPass,encryptchoice);

	if (retVal < 0 ) {
	   return -1;  // an error occured with the hash
           }

        if ( HashedEnteredPass.toString().equals(userHash) ){
	   return 1;
           }
	return 0;
    } // GetPasswordHash

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: ConvertLineToEntity
    //
    //    Convert data in a comma or tab delimited record to attribute values in an entity.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    ConvertLineToEntity( View   vTarget,
                         View   vXOD,
                         String stringRecord,
                         String stringDelimiterType,
                         int    lMaxRecordLth )
    {

       return 0;
    } // ConvertLineToEntity

    public int SetAttrFromStrByContext( View view, String entityName, String attributeName, String value, String context )
    {
       int      RESULT = 0;
       view.cursor( entityName ).getAttribute( attributeName ).setValue( value, context );
       RESULT = 0;
       return RESULT;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: GetCurrentApplicationName
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    GetCurrentApplicationName( StringBuilder stringReturnedString,
                               int    lMaxLength,
                               View   ViewToWindow )
    {
       // LPAPP  stringApp;

       return SfGetApplicationForSubtask( stringReturnedString, ViewToWindow );
    }

    // GetCurrentApplicationName

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: DBQualEntityByString
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    DBQualEntityByString( View   vQualObject,
                          String entityName,
                          String attributeName,
                          String operationName,
                          String value,
                          int  bExists )
    {
      if ( entityName.length() == 0 )
         entityName = null;

      if ( attributeName.length() == 0 )
         attributeName = null;

      if ( operationName.length() == 0 )
         operationName = null;

      if ( value.length() == 0 )
         value = null;

       // add qualification
       CreateEntity( vQualObject, "QualAttrib", zPOS_AFTER );
       SetAttributeFromString( vQualObject, "QualAttrib", "EntityName", entityName );
       if ( bExists == TRUE )
       {
          SetAttributeFromString( vQualObject, "QualAttrib", "Oper", "EXISTS" );
          CreateEntity( vQualObject, "SubQualAttrib", zPOS_AFTER );
          SetAttributeFromString( vQualObject, "SubQualAttrib", "EntityName", entityName );
          SetAttributeFromString( vQualObject, "SubQualAttrib", "AttributeName", attributeName );
          SetAttributeFromString( vQualObject, "SubQualAttrib", "Value", value );
          SetAttributeFromString( vQualObject, "SubQualAttrib", "Oper", operationName );
       }
       else
       {
          SetAttributeFromString( vQualObject, "QualAttrib", "AttributeName", attributeName );
          SetAttributeFromString( vQualObject, "QualAttrib", "Value", value );
          SetAttributeFromString( vQualObject, "QualAttrib", "Oper", operationName );
       }

       return 0;
    } // DBQualEntityByString

    public String
    GetRTFPath( View vSubtask, int lFlag,  String stringTarget )
    {
       String stringReturn;
       String stringCLSID = null;
       @SuppressWarnings("unused") int nRC = FALSE;

       stringReturn = "";
       if ( lFlag == 2 ) // open for print
       {
          stringCLSID = GetRegistryCLSID( stringCLSID, "rtffile" );
          stringReturn = GetRegistryPrintValue( "", "rtffile", stringCLSID, REG_SZ, stringReturn, 0 );

          TraceLineS( "RTF-Print-Flag 3 stringCLSID !", stringCLSID ) ;
          TraceLineS( "RTF-Print-Flag 3 Return !", stringReturn ) ;
          if ( stringReturn == null )
          {
            stringReturn = GetRegistryPrintValue( "", "rtffile", stringCLSID, REG_SZ, stringReturn, 0 );
             TraceLineS( "RTF-Print-Flag 3 stringCLSID [win98]!", stringCLSID ) ;
             TraceLineS( "RTF-Print-Flag 3 Return [win98]!", stringReturn ) ;
          }
       }

       if ( lFlag == 3 ) // open for view
       {
          GetRegistryCLSID( stringCLSID, "rtffile" );
          stringReturn = GetRegistryGeneralValue( "", "rtffile", stringCLSID, REG_SZ, stringReturn, 0 );

          TraceLineS( "RTF-Flag 3 stringCLSID !", stringCLSID ) ;
          TraceLineS( "RTF-Flag 3 Return !", stringReturn ) ;
          if ( stringReturn == null )
          {
             // for win98 in case we are not in win2K
           stringReturn = GetRegistryGeneralValue( "", "rtffile", stringCLSID,
                                                     REG_EXPAND_SZ, stringReturn, 0 );
             TraceLineS( "RTF-Flag 3C stringCLSID [win98]!", stringCLSID ) ;
             TraceLineS( "RTF-Flag 3C Return [win98]!", stringReturn ) ;
          }
       }

       stringTarget = zstrcpy( stringTarget, stringReturn );
       return stringTarget;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: IsEmailAddressValid
    //
    //    Validates an email address
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    boolean
    IsEmailAddressValid( String stringEmailAddress )
    {
    // TODO return ValidateEmailAddressFormat( stringEmailAddress ) ? true : false;
        return true;


    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: SendEmailForFiles
    //
    //    Start Email Client passing in file names for body and attachment
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    SendEmailForFiles( View   ViewToWindow,
                       View   ResultSet,
                       String stringSmtpServer,
                       String stringRecipientEMailAddress,
                       String stringSenderEMailAddress,
                       String stringEMailUserName,
                       String stringEMailPassword,
                       String stringSubjectLine,
                       String stringBodyFileName,
                       String stringAltTextFileName,
                       String stringEmbeddedImages,
                       String stringAttachmentFileName,
                       int    nMimeType,     // 1-Text, 2-HTML
                       int    lConnection )
    {
    // String stringBodyMemoryStart;
       CharBuffer  cbAtBodyFileName = CharBuffer.allocate( 256 );
       CharBuffer  cbAtAltTextFileName = CharBuffer.allocate( 256 );
    // int  selBodyMemory;
    // int  lFileLth;
       zVIEW  zqMDocOLST = null;
       zVIEW  wXferO = null;
       int    nRC;

       // First make sure the email address is valid. If not exit with return code of 2.
       if ( IsEmailAddressValid( stringRecipientEMailAddress ) == false )
          return 2;

       GetViewByName( zqMDocOLST, "zqMDocOLST", ResultSet, zLEVEL_TASK );
       GetViewByName( wXferO, "wXferO", ViewToWindow, zLEVEL_TASK );

       if ( stringBodyFileName != null )
       {
          if ( stringBodyFileName.isEmpty( ) == false && stringBodyFileName.charAt( 0 ) != '@' )
          {
             cbAtBodyFileName.put( 0, '@' );
             zstrcpy( cbAtBodyFileName, 1, stringBodyFileName );
          }
          else
             zstrcpy( cbAtBodyFileName, 0, stringBodyFileName );
       }
       else
          cbAtBodyFileName.put( 0, '\0' );

       if ( stringAltTextFileName != null )
       {
          if ( stringAltTextFileName.isEmpty( ) == false && stringAltTextFileName.charAt( 0 ) != '@' )
          {
             cbAtAltTextFileName.put( 0, '@' );
             zstrcpy( cbAtAltTextFileName, 1, stringAltTextFileName );
          }
          else
             zstrcpy( cbAtAltTextFileName, 0, stringAltTextFileName );
       }
       else
          cbAtAltTextFileName.put( 0, '\0' );


       if ( stringSubjectLine == null || stringSubjectLine.isEmpty( ) )
          stringSubjectLine = " ";

      if ( stringAttachmentFileName.isEmpty( ) == false )
       {
          nRC = m_ZDRVROPR.CreateSeeMessage( lConnection,
                                  stringSmtpServer,
                                  stringSenderEMailAddress,
                                  stringRecipientEMailAddress,
                                  "", "",
                                  stringSubjectLine,
                                  nMimeType,
                                  cbAtBodyFileName.toString( ),
                                  cbAtAltTextFileName.toString( ),
                                  stringEmbeddedImages,
                                  1,    // has attachment
                                  stringAttachmentFileName,
                                  stringEMailUserName,
                                  stringEMailPassword );
       }
       else
       {
          nRC = m_ZDRVROPR.CreateSeeMessage( lConnection,
                                  stringSmtpServer,
                                  stringSenderEMailAddress,
                                  stringRecipientEMailAddress,
                                  "", "",
                                  stringSubjectLine,
                                  nMimeType,
                                  cbAtBodyFileName.toString( ),
                                  cbAtAltTextFileName.toString( ),
                                  stringEmbeddedImages,
                                  0,    // no attachment
                                  "",   // blank attachment file name
                                  stringEMailUserName,
                                  stringEMailPassword );
       }


       return nRC;

    } // StartEmailClientWithFiles

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: SendEmailForFilesWithCC
    //
    //    Same function as SendEmailForFiles, except it supports CC and BCC copies.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    SendEmailForFilesWithCC( View   ViewToWindow,
                             View   ResultSet,
                             String stringSmtpServer,
                             String stringRecipientEMailAddress,
                             String stringSenderEMailAddress,
                             String stringCC_EMailAddresses,
                             String stringBCC_EMailAddresses,
                             String stringEMailUserName,
                             String stringEMailPassword,
                             String stringSubjectLine,
                             String stringBodyFileName,
                             String stringAltTextFileName,
                             String stringEmbeddedImages,
                             String stringAttachmentFileName,
                             int    nMimeType,     // 1-Text, 2-HTML
                             int    lConnection )
    {
    // String stringBodyMemoryStart;
       CharBuffer   cbAtBodyFileName = CharBuffer.allocate( 256 );
       CharBuffer   cbAtAltTextFileName = CharBuffer.allocate( 256 );
    // int  selBodyMemory;
    // int  lFileLth;
       zVIEW  zqMDocOLST = null;
       zVIEW  wXferO = null;
       int nRC;

       // First make sure the email address is valid. If not exit with return code of 2.
       if ( IsEmailAddressValid( stringRecipientEMailAddress ) == false )
          return 2;

       GetViewByName( zqMDocOLST, "zqMDocOLST", ResultSet, zLEVEL_TASK );
       GetViewByName( wXferO, "wXferO", ViewToWindow, zLEVEL_TASK );

       if ( stringBodyFileName != null )
       {
          if ( stringBodyFileName.isEmpty( ) == false && stringBodyFileName.charAt( 0 ) != '@' )
          {
             cbAtBodyFileName.put( 0, '@' );
             zstrcpy( cbAtBodyFileName, 1, stringBodyFileName );
          }
          else
             zstrcpy( cbAtBodyFileName, 0, stringBodyFileName );
       }
       else
          cbAtBodyFileName.put( 0, '\0' );

       if ( stringAltTextFileName != null )
       {
          if ( stringAltTextFileName.isEmpty( ) == false && stringAltTextFileName.charAt( 0 ) != '@' )
          {
             cbAtAltTextFileName.put( 0, '@' );
             zstrcpy( cbAtAltTextFileName, 1, stringAltTextFileName );
          }
          else
             zstrcpy( cbAtAltTextFileName, 0, stringAltTextFileName );
       }
       else
          cbAtAltTextFileName.put( 0, '\0' );


       if ( stringSubjectLine == null || stringSubjectLine.isEmpty( ) )
          stringSubjectLine = " ";

       if ( stringAttachmentFileName != null && stringAttachmentFileName.isEmpty( ) == false )
       {
          nRC = m_ZDRVROPR.CreateSeeMessage( lConnection,
                                  stringSmtpServer,
                                  stringSenderEMailAddress,
                                  stringRecipientEMailAddress,
                                  stringCC_EMailAddresses,
                                  stringBCC_EMailAddresses,
                                  stringSubjectLine,
                                  nMimeType,
                                  cbAtBodyFileName.toString( ),
                                  cbAtAltTextFileName.toString( ),
                                  stringEmbeddedImages,
                                  1,    // has attachment
                                  stringAttachmentFileName,
                                  stringEMailUserName,
                                  stringEMailPassword );
       }
       else
       {
          nRC = m_ZDRVROPR.CreateSeeMessage( lConnection,
                                  stringSmtpServer,
                                  stringSenderEMailAddress,
                                  stringRecipientEMailAddress,
                                  stringCC_EMailAddresses,
                                  stringBCC_EMailAddresses,
                                  stringSubjectLine,
                                  nMimeType,
                                  cbAtBodyFileName.toString( ),
                                  cbAtAltTextFileName.toString( ),
                                  stringEmbeddedImages,
                                  0,    // no attachment
                                  "",   // blank attachment file name
                                  stringEMailUserName,
                                  stringEMailPassword );
       }

    // SysFreeMemory( selBodyMemory );
    // DrFreeTaskMemory( stringBodyMemoryStart );

       return nRC;

    } // StartEmailClientWithFiles

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: ReturnSuffixOfFileName
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    ReturnSuffixOfFileName( StringBuilder stringReturnedSuffix,
                            String stringFileName )
    {
       int nPosition;

       nPosition = stringFileName.lastIndexOf('.');
       stringReturnedSuffix.setLength( 0 );
       if ( nPosition >= 0 )  // if we found the last period ...
       {
          stringReturnedSuffix.append( stringFileName.substring( nPosition + 1 ).toLowerCase());  // ... we have our ext!
       }
       else
          stringReturnedSuffix.append("");  // initialize to empty extension

       return 0;

    } // ReturnSuffixOfFileName

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: ReturnFileNameFromPath
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    ReturnFileNameFromPath( StringBuilder stringReturnedFileName,
                            String stringFileName )
    {
       String fNameFound;
       fNameFound=FilenameUtils.getName(stringFileName);
       stringReturnedFileName.setLength( 0 );
       stringReturnedFileName.append( fNameFound);  
       return 0;

    } // ReturnFileNameFromPath


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: WL_QC
    //
    //  PURPOSE:    This routine Converts an instance of a special character in
    //              a buffer and then writes out the buffer. The character to
    //              be translated is stringTransChar and any instance of it is
    //              converted to a double quote.
    //
    //  PARAMETERS: lFile - File handle
    //              stringBuffer - the string to be converted.
    //              stringTransChar - The character to be converted to a quote.
    //              nAddBlankLineCnt - Number of blank lines to append.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    WL_QC( int    lFile,
           String stringInput,
           String stringTransChar,
           int    nBlankLineCnt ) throws IOException
    {
       View   taskView = null; // TODO ??? = GetDefaultViewForActiveTask( );

       stringInput = stringInput.replaceAll( stringTransChar, "\"" );
       m_KZOEP1AA.SysWriteLine( taskView, lFile, stringInput );
       while ( nBlankLineCnt-- > 0 )
    	   m_KZOEP1AA.SysWriteLine( taskView, lFile, "" );

       return 0;
    }

    int
    AddAttributeToCSV( CharBuffer cb, int nLth, View  lLibPers,
                       String entityName, String attributeName, boolean bNumeric )
    {
        String s = null;

       cb.put( 0, '"' );  // opening quote

          s = GetStringFromAttribute( s, lLibPers, entityName, attributeName );
          nLth = zstrcpy( cb, 1, s );


       s = cb.toString( );
       if ( s.indexOf( '"', 1 ) > 0 )
       {
          s = s.replace( "\"", "\"\" " );  // double any quotes ...
          s = s.substring( 1 );            // except the first one
       }

       s += "\",";   // terminating quote plus comma
       nLth = zstrcpy( cb, 0, s );
       return nLth;
    }

    int
    WriteCSV_RecordFromEntity( View  lLibPers, String entityName, int lFile ) throws IOException
    {
       CharBuffer charBuffer = CharBuffer.allocate( 32000 );
       int nLth;

       charBuffer.put( 0, '"' );
       charBuffer.put( 1, entityName.charAt( 0 ) );  // S E P (Student Employee Prospect)
       charBuffer.put( 2, '"' );
       charBuffer.put( 3, ',' );
       nLth = 4;

       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, entityName,
                                  "Status", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "CampusID", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "ID", true );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "LastName", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "FirstName", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "MiddleName", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "Suffix", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "PreferedFirstName", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "Gender", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "MaritalStatus", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "HomePhone", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "WorkPhone", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "Extension", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "eMailAddress", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Person",
                                  "DateOfBirth", false );
       if ( CheckExistenceOfEntity( lLibPers, "Address" ) == 0 )
       {
          nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Address",
                                     "Line1", false );
          nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Address",
                                     "City", false );
          nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Address",
                                     "StateProvince", false );
          nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Address",
                                     "PostalCode", false );
          nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "Address",
                                     "Country", false );
       }
       else
       {
         charBuffer.put(  nLth++, ',' );
         charBuffer.put(  nLth++, ',' );
         charBuffer.put(  nLth++, ',' );
         charBuffer.put(  nLth++, ',' );
         charBuffer.put(  nLth++, ',' );
       }

       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, entityName,
                                  "ID", false );
       nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, entityName,
                                  "eMailAddress", false );
       if ( entityName.charAt( 0 ) == 'S' )
       {
          nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, entityName,
                                     "CurrentLevel", false );
          nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, "AdministrativeDivision",
                                     "Name", false );
          nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, entityName,
                                     "ClearingHouseGradDate", false );
       }
       else
       if ( entityName.charAt( 0 ) == 'P' )
       {
          nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, entityName,
                                     "ExpectedEntryTerm", false );
          nLth += AddAttributeToCSV( charBuffer, nLth, lLibPers, entityName,
                                     "ExpectedEntryYear", false );
       }

       if ( nLth > 0 && charBuffer.get( nLth - 1 ) == ',' )
         charBuffer.put(  nLth - 1, '\0' );  // drop terminating ',' and null terminate
       else
         charBuffer.put(  nLth++, '\0' );    // ensure null termination

       m_KZOEP1AA.SysWriteLine( lLibPers, lFile, charBuffer.toString( ) );
       return nLth;
    }



    //////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //Method Name: ConvertISIR_NumberToAttribute
    //
    //////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    ConvertISIR_NumberToAttribute( View   tgtView,
                                   String tgtEntityName,
                                   String tgtAttributeName,
                                   String stringISIR_Value )
    {
       String stringValue;
       String stringMsg;
       char   charSign;
       char   charLastCharacter = 0;
       char   charLastDigit = 0;
       int    lValue;
       int    nLth;
       @SuppressWarnings("unused") int    nRC;

       // Convert stringISIR_Value from a signed string to the attribute passed into the operation.
       if ( stringISIR_Value == null || stringISIR_Value.isEmpty( ) )
          SetAttributeFromString( tgtView, tgtEntityName, tgtAttributeName, "" );
       else
       {
          nLth = stringISIR_Value.length( );
          stringValue = stringISIR_Value;
          if ( stringValue.compareTo( "N/A" ) == 0 )
             stringValue = null;         // A value of N/A is converted to null.
          else
             charLastCharacter = stringISIR_Value.charAt( nLth - 1 );

          if ( stringValue == null )
          {
             // The value is null, so set result to null.
             SetAttributeFromString( tgtView, tgtEntityName, tgtAttributeName, "" );
          }
          else
          {
             if ( charLastCharacter >= '0' && charLastCharacter <= '9' )
                charSign = '\0';
             else
             {
                charSign = charLastCharacter;

                // Convert last character to digit.
                switch ( charLastCharacter )
                {
                   case '}':
                   case '{':
                      charLastDigit = '0';
                      break;

                   case 'A':
                   case 'J':
                      charLastDigit = '1';
                      break;

                   case 'B':
                   case 'K':
                      charLastDigit = '2';
                      break;

                   case 'C':
                   case 'L':
                      charLastDigit = '3';
                      break;

                   case 'D':
                   case 'M':
                      charLastDigit = '4';
                      break;

                   case 'E':
                   case 'N':
                      charLastDigit = '5';
                      break;

                   case 'F':
                   case 'O':
                      charLastDigit = '6';
                      break;

                   case 'G':
                   case 'P':
                      charLastDigit = '7';
                      break;

                   case 'H':
                   case 'Q':
                      charLastDigit = '8';
                      break;

                   case 'I':
                   case 'R':
                      charLastDigit = '9';
                      break;

                   default:
                      stringMsg = "Unexpected Sign for the following data and attribute:   Entity Name: " + tgtEntityName + zNEW_LINE +
                                  "   Attribute Name: " + tgtAttributeName + zNEW_LINE +"   Data Value: " + stringISIR_Value;
                      IssueError( tgtView, 0, 0, stringMsg );
                }

                stringValue = stringValue.substring( 0, nLth - 2 ) + charLastDigit;
             }

             lValue = StrToInt( stringValue );

             if ( charSign == '}' || ( charSign >= 'J' && charSign <= 'Z' ))
                lValue = -lValue;

             nRC = SetAttributeFromInteger( tgtView, tgtEntityName, tgtAttributeName, lValue );
          }
       }

       return 0;
    }

    // ConvertISIR_NumberToAttribute

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: SetEntityCursorByInteger
    //    Does a SetEntityCursor for an Integer, since the regular SetEntityCursor doesn't work for
    //    an integeri in VML.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    SetEntityCursorByInteger( View   view,
                              String entityName,
                              String attributeName,
                              int    cursorPosition,
                              int    lIntegerSearchValue,
                              String stringScopingEntityName )
    {
       int nRC;

       nRC = SetEntityCursor( view, entityName, attributeName, cursorPosition, lIntegerSearchValue,
                              "", "", 0, stringScopingEntityName, "" );
       return nRC;
    } // SetEntityCursorByInteger

    public int
    PositionOnEntityByZID( View   vLDD,
                           String pchZID )
    {
       String pchDot;
       int    nDot1;
       int    nDot2;
       int    nRC;

       if ( pchZID == null || pchZID.isEmpty( ) )
          return 0;

       nDot1 = zstrchr( pchZID, '.' );
       if ( nDot1 >= 0 )
          pchDot = pchZID.substring( 0, nDot1 - 1 );
       else
          pchDot = pchZID;

       nRC = SetCursorFirstEntityByString( vLDD, "MasterLabelContent", "ID", pchDot, "" );
       if ( nRC == zCURSOR_SET )
       {
          if ( nDot1 < 0 )
             return 1;  // found MasterLabelContent

          nDot1++;
          nDot2 = zstrchr( pchZID, nDot1, '.' );
          if ( nDot2 >= 0 )
             pchDot = pchZID.substring( nDot1, nDot2 - 1 );
          else
             pchDot = pchZID.substring( nDot1 );

          nRC = SetCursorFirstEntityByString( vLDD, "MasterLabelSection", "ID", pchDot, "" );
          if ( nRC == zCURSOR_SET )
          {
             if ( nDot2 < 0 )
                return 2;  // found MasterLabelSection

             pchDot = pchZID.substring( nDot2 + 1 );
             nRC = SetCursorFirstEntityByString( vLDD, "MasterLabelParagraph", "ID", pchDot, "" );
             if ( nRC == zCURSOR_SET )
                return 3;  // found MasterLabelParagraph
          }
       }

       return -1;  // did not find proper entity
    }

 
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: CheckForTableAttribute
    //    Check if an attribute has a table domain
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    CheckForTableAttribute( View  lpView,
                            String entityName,
                            String attributeName,
                            String stringObjectName )
    {
           // Check if the attribute passed has a table domain.
       // A 0 indicates it does.
       // A 1 indicates it does not.

       EntityDef entityDef = lpView.getLodDef( ).getEntityDef( entityName );
       if ( entityDef == null )
          return 1;
       AttributeDef attributeDef = entityDef.getAttribute(attributeName);
       Domain domain = attributeDef.getDomain();
       DomainType domainType = domain.getDomainType();

       if ( domain.getDomainType() == DomainType.TABLE )
    	   return 0;
       else
    	   return 1;
    } // CheckForTableAttribute

    public int
    AD_TestAdmin( )
    {
			String ldapurl = "ldap://198.136.234.202"; // or 198.136.234.196
			String stringADUserName = "";
			String szAD_Password = "";
			// This is using fastbind.
	   	    return m_ActiveDirectory.ActiveDirectoryLoginAuthentication( ldapurl, "sAMAccountName\\portalrest", "Exo47egm2j83whv" );
    }

    public int
    AD_TestAdminNotFast( )
    {
		String ldapurl = "ldap://198.136.234.202"; // or 198.136.234.196
		String stringADUserName = "";
		String szAD_Password = "";
		// Try binding w/o fastbind.
   	    return m_ActiveDirectory.ActiveDirectoryLoginAuthenticationNF( ldapurl, "sAMAccountName\\portalrest", "Exo47egm2j83whv" );
    	//IsAuthenticated = ctx.Authenticate("sAMAccountName\\portalrestxx","Exo47egm2j83whvssss");
   }

    public int
    AD_TestUserNotFast( )
    {
		String ldapurl = "ldap://198.136.234.202"; // or 198.136.234.196
		String stringADUserName = "";
		String szAD_Password = "";
		// Try binding w/o fastbind.
   	    return m_ActiveDirectory.ActiveDirectoryLoginAuthenticationNF( ldapurl, stringADUserName, szAD_Password );
    }

    public int
    AD_TestUser( )
    {
		String ldapurl = "ldap://198.136.234.202"; // or 198.136.234.196
		String stringADUserName = "";
		String szAD_Password = "";
		// This is using fastbind.
   	    return m_ActiveDirectory.ActiveDirectoryLoginAuthentication( ldapurl, stringADUserName, szAD_Password );
    }

    public int
    AD_TestChangePassword( )
    {
		String ldapurl = "ldap://198.136.234.202"; // or 198.136.234.196
		String stringADAdminUserName = "sAMAccountName\\portalrest";
		String stringADAdminPassword = "Exo47egm2j83whv";
		String stringADUserName = "";
		String stringADOldPassword = "";
		String stringADNewPassword = "";
    	int nRC;

    	nRC = m_ActiveDirectory.ActiveDirectoryChangePassword(ldapurl, stringADAdminUserName,
    			stringADAdminPassword, stringADUserName, stringADOldPassword, stringADNewPassword);
    	return 0;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AD_AuthenticateUserPassword
    //    Authenticate User Name and Password against Active Directory.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    AD_AuthenticateUserPassword( String szAD_Pathname,
                                 String szAD_UserName,
                                 String szAD_Password )
    {
    	int nRC = 0;

    	// KJS 10/17/14 - Not sure why but if the password is empty, the authentication is successful. ???
    	if ( szAD_Password == null || szAD_Password.isEmpty())
    		return -1;

    	// In the "c" world this is "LDAP://DC=AD,DC=SWAU,DC=EDU"
    	// But I couldn't get a connection using that in java, so I am using the
    	// ldap server id.
    	// szAD_Pathname = "ldap://198.136.234.196"; // or 198.136.234.196

   	    //nRC = m_ActiveDirectory.ActiveDirectoryLoginAuthentication( "ldap://198.136.234.196", "SWAU\\portalrest", "Exo47egm2j83whv" ); // works!
   	    //nRC = m_ActiveDirectory.ActiveDirectoryLoginAuthentication( "ldap://198.136.234.196", "SWAU\\testerpl", "mizpah123" ); // works!
   	    //nRC = m_ActiveDirectory.ActiveDirectoryLoginAuthentication( "ldap://198.136.234.196", "sAMAccountName\\portalrest", "Exo47egm2j83whv" );
   	    //nRC = m_ActiveDirectory.ActiveDirectoryLoginAuthentication( "ldap://198.136.234.196", "sAMAccountName\\testerpl", "mizpah" );
    	return m_ActiveDirectory.ActiveDirectoryLoginAuthentication( szAD_Pathname, szAD_UserName, szAD_Password );
/*
 *
			String ldapurl = "ldap://10.150.0.10";
			String stringADUserName = "";
			String szAD_Password = "";
			// This is using fastbind.
	   	    return m_ActiveDirectory.ActiveDirectoryLoginAuthentication( ldapurl, "enc-ad\\zmail", "F82b7mk,9j" );
 */
    } // AD_AuthenticateUserPassword

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AD_AddUserPassword
    //    Add Active Directory User and Password
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    AD_AddUserPassword( String stringServerName,
                        String stringServerPort,
                        String stringOrganization,
                        String stringUserName,
                        String stringUserPassword )
    {
       return m_ActiveDirectory.ActiveDirectoryAddUser( stringServerName, stringServerPort, stringOrganization, stringUserName, stringUserPassword );

    } // AD_AddUserPassword

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AD_RemoveUserPassword
    //    Remove Active Directory User with Password
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    AD_RemoveUserPassword( String stringServerName,
                           String stringServerPort,
                           String stringOrganization,
                           String stringUserName )
    {
       return m_ActiveDirectory.ActiveDirectoryRemoveUser( stringServerName, stringServerPort, stringOrganization, stringUserName );

    } // AD_RemoveUserPassword

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AD_ChangeUserPassword
    //    Change the user password through Active Directory
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    AD_ChangePassword( String stringAD_Pathname,
                           String stringAD_LoginUserName,
                           String stringAD_LoginPassword,
                           String stringAD_UserName,
                           String stringAD_OldPassword,
                           String stringAD_NewPassword )
    {
    	// In the "c" world this is "LDAP://DC=ENC-AD,DC=ENC,DC=EDU"
    	// But I couldn't get a connection using that in java, so I am using the
    	// ldap server id.
    	stringAD_Pathname = "ldap://198.136.234.196"; //or 198.136.234.202
    	// Also, in "c" we store password on the database but I need to do some
    	// work with that because we are using different encyrption right now for java and
    	// I can't decrypt a password.
		stringAD_LoginUserName = "sAMAccountName\\portalrest"; //portalrest
		stringAD_LoginPassword = "Exo47egm2j83whv";
    	return m_ActiveDirectory.ActiveDirectoryChangePassword( stringAD_Pathname, stringAD_LoginUserName, stringAD_LoginPassword, stringAD_UserName, stringAD_OldPassword, stringAD_NewPassword );
    } // AD_ChangeUserPassword

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AD_SetPassword
    //    Set password in  Active Directory
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    AD_SetPassword( String stringAD_Pathname,
                    String stringAD_LoginUserName,
                    String stringAD_LoginPassword,
                    String stringAD_UserName,
                    String stringAD_Password )
    {
       return m_ActiveDirectory.ActiveDirectorySetPassword( stringAD_Pathname, stringAD_LoginUserName, stringAD_LoginPassword, stringAD_UserName, stringAD_Password );
    }

    // AD_SetPassword

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AD_AddNewUser
    //    Add a new user to Active Directory
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    AD_AddNewUser( String stringAD_Pathname,
                   String stringAD_LoginUserName,
                   String stringAD_LoginPassword,
                   String stringAD_NewUserName,
                   String stringAD_NewUserPassword )
    {
       return m_ActiveDirectory.ActiveDirectoryAddUser( stringAD_Pathname, stringAD_LoginUserName, stringAD_LoginPassword, stringAD_NewUserName, stringAD_NewUserPassword );

    }  // AD_AddNewUser

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AD_GetUserProperty
    //    Get the value of an Active Directory property for the user.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    AD_GetUserProperty( String stringAD_Pathname,
                        String stringAD_UserName,
                        String stringAD_Password,
                        String stringAD_Property,
                        StringBuilder stringReturnProperty )
    {
       return m_ActiveDirectory.ActiveDirectoryGetProperty( stringAD_Pathname, stringAD_UserName, stringAD_Password, stringAD_Property, stringReturnProperty );

    } // AD_GetUserProperty

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: ValidateAndSetState
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    ValidateAndSetState( View   view,
                         String entityName,
                         String attributeName,
                         String stringStateString )
    {
       StringBuilder  sbTableValue = new StringBuilder( );
       MutableInt Pointer = null;
       int  lFoundFlag = 0;
       int  nRC;

       nRC = GetFirstTableEntryForAttribute( sbTableValue, view, entityName, attributeName, "", Pointer );
       while ( lFoundFlag == 0 && nRC >= 0 )
       {
          TraceLineS( "//* Domain Value: ", sbTableValue.toString( ) );
          if ( zstrcmp( stringStateString, sbTableValue.toString( ) ) == 0 )
             lFoundFlag = 1;

          nRC = GetNextTableEntryForAttribute( sbTableValue, view, entityName, attributeName, "", Pointer );
       }

       if ( lFoundFlag == 0 )
          return -1;  // String was NOT found.
       else
       {
          // String WAS found.
          SetAttributeFromString( view, entityName, attributeName, stringStateString );
          return 0;
       }

    } // ValidateAndSetState

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: SetStringUpperLowerCase
    //    Set characters in a string to a combination of upper and lower case, with the 1st character
    //    of each "word" in the string to be in upper case and the remainder in lower case.  Eliminate
    //    leading and trailing whitespace and multiple consecutive whitespace characters.  Also check
    //    for Roman Numeral suffix and upper case as necessary.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    SetStringUpperLowerCase( StringBuilder sbName )
    {
       String   string;
       boolean  bSuffix = false;
       int nBlankFound = 0;
       @SuppressWarnings("unused") int nLth;
       int k;
       int j;

       // Eliminate leading and trailing blanks.
       string = sbName.toString( );
       string = string.trim( );

       // Force first character to be upper case
       StringBuffer sb = new StringBuffer( string.toLowerCase( ) );  // force string to lower case
       sb.setCharAt( 0, Character.toUpperCase( sb.charAt( 0 ) ) );

       for ( k = 1; k < sb.length( ); k++ )
       {
          // Eliminate multiple consecutive blanks.
          if ( sb.charAt( k ) == ' ' )
          {
             j = k;
             while ( sb.charAt( j + 1 ) == ' ' )
                j++;

             if ( j > k )
              sb.delete( k + 1, j );
          }
          else
       // if ( sb.charAt( k ) != ' ' )
          {
             if ( sb.charAt( k - 1 ) == ' ' )
             {
                nBlankFound++;
                char ch = Character.toUpperCase( sb.charAt( k ) );
                sb.setCharAt( k, ch );

                if ( ch == 'I' || ch == 'V' )
                   bSuffix = true;
                else
                   bSuffix = false;
             }
             else
             {
                if ( nBlankFound > 1 && bSuffix )  // checking for II or III or IV or V or VI or VII or VIII
                {
                   if ( (sb.charAt( k ) == 'i' || sb.charAt( k ) == 'v') &&
                        (sb.charAt( k + 1 ) == '\0' || sb.charAt( k + 1 ) == 'i' || sb.charAt( k + 1 ) == 'v') )
                   {
                      sb.setCharAt( k, Character.toUpperCase( sb.charAt( k ) ) );
                   }
                   else
                      bSuffix = false;
                }
                else
                {
                   bSuffix = false;  // can't start with suffix
                }
             }
          }
       }

       zstrcpy( sbName, sb.toString( ) );
       return sbName.length( );

    } // SetStringUpperLowerCase


    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: SetAttributeFromUC_String
    //    Set Attribute from String, converting string to upper case.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    SetAttributeFromUC_String( View   tgtView,
                               String tgtEntityName,
                               String tgtAttributeName,
                               String srcString )
    {

       // Convert srcString to upper case and store it in the attribute.
       SetAttributeFromString( tgtView, tgtEntityName, tgtAttributeName, srcString.toUpperCase( ) );

       return 0;
    } // SetAttributeFromUC_String

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: SetAttributeFromUC_Attribute
    //    Set Attribute from Attribute, converting the source string to upper case in the process.
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    SetAttributeFromUC_Attribute( View   tgtView,
                                  String tgtEntityName,
                                  String tgtAttributeName,
                                  View   srcView,
                                  String srcEntityName,
                                  String srcAttributeName )
    {
       String  srcString = null;

       // Convert source attribute value to upper case and store it in the target attribute.
       // zToUpper prototype is in TZVMLIP.H
       srcString = GetStringFromAttribute( srcString, srcView, srcEntityName, srcAttributeName );
       SetAttributeFromString( tgtView, tgtEntityName, tgtAttributeName, srcString.toUpperCase( ) );

       return 0;
    } // SetAttributeFromUC_Attribute

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Method Name: AD_SetUserProperty
    //    Set an AD property for a user
    //
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public int
    AD_SetUserProperty( String stringAD_Pathname,
                        String stringAD_AdminName,
                        String stringAD_AdminPassword,
                        String stringAD_UserName,
                        String stringAD_PropertyName,
                        String stringAD_PropertyValue )
    {
       int nRC;

       nRC = m_ActiveDirectory.ActiveDirectorySetProperty( stringAD_Pathname, stringAD_AdminName, stringAD_AdminPassword,
                                                    stringAD_UserName, stringAD_PropertyName, stringAD_PropertyValue );
       return nRC;

    } // AD_SetUserProperty

    /////////////////////////////////////////////////////////////////////////////
    //
    //OPERATION: InsertUsageWordsIntoString
    //
    /////////////////////////////////////////////////////////////////////////////
    public int
    InsertUsageWordsIntoString( View   view,
                                StringBuilder sbString, // original data and return data
                                int    lMaxLth,
                                String szUsageType,
                                String szUsageKeyword,
                                String szUsageEntityName,
                                String szSeparatorCharacters )
    {


       return 0;

    } // InsertUsageWordsIntoString

    /////////////////////////////////////////////////////////////////////////////
    //
    // OPERATION: SeparateNumberedStatement
    //
    // Separate a numbered statement into the number and the rest of the
    // statement. A return code of -1 means the text didn't start with a number.
    /////////////////////////////////////////////////////////////////////////////
    public int
    SeparateNumberedStatement( String pchOriginalStatement,
                               int    lMaxLth,
                               String pchNumberedText )
    {
        String pchRemainingText;
        int    lMemHandle;
        int    nCount;


        return( 0 );

    } // SeparateNumberedStatement

    public int WinShellExecute(View viewToWindow, String szTempString_0,
          String string, String string2) {
       // TODO Auto-generated method stub
       return 0;
    }

    public String GetImagingPath( View viewToWindow, int i, String szPathName )
    {
       // TODO Auto-generated method stub
       return null;
    }

    public int FTPSendFile(View viewToSubtask, String szURL, String szLoginName,
          String szPassword, String szFullFileName, String szTargetFileName,
          int i) {
       // TODO Auto-generated method stub
       return 0;
    }



/* Function Name: CallJasperReport */
public JasperPrint CallJasperReport (zVIEW ViewToWindow, String reportName)
    {
	String fileName;
	StringBuilder jDataDriver = new StringBuilder();
	StringBuilder jDriverManager = new StringBuilder();
	StringBuilder reportPath = new StringBuilder();
	StringBuilder jDBUsername = new StringBuilder();
	StringBuilder jDBPassword = new StringBuilder();
	StringBuilder jDBSourceURL = new StringBuilder();
	int len;
        HashMap hm = new HashMap();
        try {
	  	m_KZOEP1AA.SysReadZeidonIni( -1, "[nazsis]", "JasperReportDir", reportPath );
	  	len=reportPath.toString().trim().length();
          	fileName=reportPath.toString().trim().substring(1,len-1)+reportName;
	  	m_KZOEP1AA.SysReadZeidonIni( -1, "[nazsis]", "JasperDataDriver", jDataDriver );
	  	m_KZOEP1AA.SysReadZeidonIni( -1, "[nazsis]", "JasperDriverManager", jDriverManager );
	  	m_KZOEP1AA.SysReadZeidonIni( -1, "[nazsis]", "JasperDBUsername", jDBUsername );
  	  	m_KZOEP1AA.SysReadZeidonIni( -1, "[nazsis]", "JasperDBPassword", jDBPassword );
  		m_KZOEP1AA.SysReadZeidonIni( -1, "[nazsis]", "oiSourceUrl", jDBSourceURL );
           TraceLineS("***SRCURL: ", jDBSourceURL.toString());
	  	Class.forName(jDataDriver.toString()); // open data driver
	  	Connection conn = DriverManager .getConnection(jDriverManager.toString(), jDBUsername.toString(), jDBPassword.toString());
       	  	JasperPrint print = JasperFillManager.fillReport(fileName, hm, conn);  // fill report with data
		return print; // go to report
        } catch (Exception e) {
            	e.printStackTrace();
            System.exit(1);
	    return null;
        }
    }

   

public String
    PRINT_ExcelReport_Jasper(View ViewToWindow)
    		//, String reportPath)
    {
return "";
    }



    private int
            o_fnLocalBuildQual_8(View vSubtask,
                    zVIEW vQualObject,
                    int lTempInteger_0) {
        int RESULT = 0;

        RESULT = SfActivateSysEmptyOI(vQualObject, "KZDBHQUA", vSubtask, zMULTIPLE);
        CreateEntity(vQualObject, "EntitySpec", zPOS_AFTER);
        SetAttributeFromString(vQualObject, "EntitySpec", "EntityName", "DegreeTrack");
        CreateEntity(vQualObject, "QualAttrib", zPOS_AFTER);
        SetAttributeFromString(vQualObject, "QualAttrib", "EntityName", "DegreeTrack");
        SetAttributeFromString(vQualObject, "QualAttrib", "AttributeName", "ID");
        SetAttributeFromInteger(vQualObject, "QualAttrib", "Value", lTempInteger_0);
        SetAttributeFromString(vQualObject, "QualAttrib", "Oper", "=");
        return (0);
    }

   
		private int
            o_fnLocalBuildQual_1(View vSubtask,
                    zVIEW vQualObject,
                    int lTempInteger_0) {
        int RESULT = 0;

        RESULT = SfActivateSysEmptyOI(vQualObject, "KZDBHQUA", vSubtask, zMULTIPLE);
        CreateEntity(vQualObject, "EntitySpec", zPOS_AFTER);
        SetAttributeFromString(vQualObject, "EntitySpec", "EntityName", "Class");
        CreateEntity(vQualObject, "QualAttrib", zPOS_AFTER);
        SetAttributeFromString(vQualObject, "QualAttrib", "EntityName", "Class");
        SetAttributeFromString(vQualObject, "QualAttrib", "AttributeName", "ID");
        SetAttributeFromInteger(vQualObject, "QualAttrib", "Value", lTempInteger_0);
        SetAttributeFromString(vQualObject, "QualAttrib", "Oper", "=");
        return (0);
    }



 public int CheckPassword(String password){
        int length;
        boolean containsUpper=false;
        boolean containsLower=false;
        boolean containsNumber=false;

        length = password.length();
            if (length < 8){
            return 2;
            }
        for (int i = 0; i < password.length();i++){

        if (Character.isUpperCase(password.charAt(i))) {
           containsUpper=true;
        } else if (Character.isLowerCase(password.charAt(i))) {
           containsLower=true;
        } else if (Character.isDigit(password.charAt(i))) {
           containsNumber=true;
        }
      }
    if (!containsUpper || !containsLower || !containsNumber) {
         return 2;
    }
  return 0;
}


 public void DELETE_File(String fileName){
      File f = null;
      boolean bool = false;
      
      try {
      
         // create new file
         f = new File(fileName);
         
         // tries to delete a non-existing file
         bool = f.delete();
    } catch(Exception e) {
      
         // if any error occurs
         e.printStackTrace();
      }
}

 public int SendEmail( View sHost,
         String szUserEmailAddress,
	 String szRecipientEmailAddress,
         String szSubjectText,
         String szMessageBody,
         String szAttachmentFileName )

{

   if (!sHost.cursor("Host").getAttribute("UsesServerEmail").getString().equals("Y")) {
	task.log().error( "*** SendEmail: Server Email Disabled ****  " );
     return -3;
   }
	InternetAddress fromAddress = null;
	MimeBodyPart attachPart;
	String host = sHost.cursor("Host").getAttribute("SMTPServer").getString();
	String port = sHost.cursor("Host").getAttribute("SMTPPort").getString();
	final String username = sHost.cursor("Host").getAttribute("SMTPUser").getString();
	final String pswd = sHost.cursor("Host").getAttribute("SMTPPassword").getString();
	String enableTLS = sHost.cursor("Host").getAttribute("SMTPEnableTLS").getString();
	String enableSSL = sHost.cursor("Host").getAttribute("SMTPEnableSSL").getString();
	String from = szUserEmailAddress;

	String to[] = szRecipientEmailAddress.split("[\\s,;]+");

	InternetAddress[] toAddress = new InternetAddress[to.length];


	// Set properties
	Properties props = new Properties();
	if (enableTLS.equals("Y"))
	   props.put("mail.smtp.starttls.enable", "true");
	else
	   props.put("mail.smtp.starttls.enable", "false");

	if (enableSSL.equals("Y"))
		props.put("mail.smtp.ssl.enable", "true");
	else
	props.put("mail.smtp.ssl.enable", "false");

	props.put("mail.transport.protocol", "smtp");

	props.put("mail.smtp.host", host);
	props.put("mail.smtp.ssl.trust", host);
	props.put("mail.smtp.port", port);
	props.put("mail.smtp.auth", "true");
	props.put("mail.debug", "true");

	// Get session
	Session session = Session.getDefaultInstance(props,
	new javax.mail.Authenticator() {
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username, pswd);
	}
	});

	Transport transport = null;
	try {
		transport = session.getTransport();
	} catch (NoSuchProviderException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}


	try {
	// Instantiate a message
	Message msg = new MimeMessage(session);
	// FOR ATTACHMENT
	Multipart multipart = new MimeMultipart();
	// creates body part for the message
	MimeBodyPart messageBodyPart = new MimeBodyPart();
	try
	{
		if ( from != null && !from.isEmpty() ) {
			fromAddress = new InternetAddress(from);
			}
		if ( szRecipientEmailAddress != null && !szRecipientEmailAddress.isEmpty() )
		{
			for(int iCnt =0; iCnt< to.length; iCnt++)
			{
				toAddress[iCnt] = new InternetAddress(to[iCnt]);
			}
		}
	} catch (AddressException e) {
		task.log().error( "*** SendEmail: setting addresses **** " );
		task.log().error( e );
		return -1;
	}
	// Set the FROM message
	msg.setFrom(fromAddress);


	if ( szRecipientEmailAddress != null && !szRecipientEmailAddress.isEmpty() )
		msg.setRecipients(Message.RecipientType.TO, toAddress);

	// Set the message subject and date we sent it.
	msg.setSubject(szSubjectText);
	msg.setSentDate(new Date());

	// Set message content
	//msg.setText(szMessageBody);
	messageBodyPart.setContent(szMessageBody, "text/html");

	// code to add attachment
	if ( !szAttachmentFileName.equals("") )
	{
		String attachFile = szAttachmentFileName;
		attachPart = new MimeBodyPart();
		attachPart.attachFile(attachFile);
		multipart.addBodyPart(attachPart);
	}

	// adds parts to the multipart
	multipart.addBodyPart(messageBodyPart);

	// sets the multipart as message's content
	msg.setContent(multipart);

	// Send the message
	transport.send(msg);
	}
	catch(Exception mex)
	{
		task.log().error( "*** SendEmail: Transport.send error ****  " );
		task.log().error( mex );
		// Email was bad?
		if (mex instanceof SendFailedException)
		return -1;

		// SMTP connection bad?
		return -2;
	}

	return 0;
   }

   // this is the action from the Create Excel button: Action=PRINT_DisplayReport_JasperXLS
   public JasperPrint PRINT_DisplayReport_JasperXLS(zVIEW ViewToWindow)
   {
   JasperPrint a=null;
     return a;
   }
   protected int ConvertDecimalToString( Object dDecimalValue, StringBuilder sbReturn, int ulNumberOfDecimals )
   {
      sbReturn.setLength( 0 ); // Use sb.setLength( 0 ); to clear a string buffer.
      String formatString="%."+Integer.toString(ulNumberOfDecimals) +"f";
      String s = String.format(formatString, dDecimalValue);
      sbReturn.append( s );
      return 0;
   }

   public JasperPrint PRINT_DisplayReport_Jasper(zVIEW ViewToWindow)
   {
   JasperPrint a=null;
     return a;
   }

   
   
}
