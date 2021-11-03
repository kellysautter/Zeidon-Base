<!DOCTYPE HTML>

<%-- wStartUpLogin --%>

<%@ page import="java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="org.apache.commons.lang3.*" %>
<%@ page import="com.quinsoft.zeidon.*" %>
<%@ page import="com.quinsoft.zeidon.standardoe.*" %>
<%@ page import="com.quinsoft.zeidon.utils.*" %>
<%@ page import="com.quinsoft.zeidon.vml.*" %>
<%@ page import="com.quinsoft.zeidon.domains.*" %>
<%@ page import="org.nazarene.base.*" %>

<%! 

ObjectEngine objectEngine = JavaObjectEngine.getInstance();

public String ReplaceXSSValues( String szFieldValue )
{
   String szOutput;
   szOutput = szFieldValue.replace( "<","&lt;" );
   szOutput = szOutput.replace( ">", "&gt;" );
   szOutput = szOutput.replace( "\"", "&quot;" );
   szOutput = szOutput.replace( "\'", "&apos;" );
   return( szOutput );
}

public int DoInputMapping( HttpServletRequest request,
                           HttpSession session,
                           ServletContext application,
                           boolean webMapping )
{
   String taskId = (String) session.getAttribute( "ZeidonTaskId" );
   Task task = objectEngine.getTaskById( taskId );

   View wXferO = null;
   View vGridTmp = null; // temp view to grid view
   View vRepeatingGrp = null; // temp view to repeating group view
   String strDateFormat = "";
   String strMapValue = "";
   int    iView = 0;
   long   lEntityKey = 0;
   String strEntityKey = "";
   long   lEntityKeyRG = 0;
   String strEntityKeyRG = "";
   String strTag = "";
   String strTemp = "";
   int    iTableRowCnt = 0;
   String strSuffix = "";
   int    nRelPos = 0;
   int    nRC = 0;
   CursorResult csrRC = null;
   int    nMapError = 1;

   if ( webMapping == false )
      session.setAttribute( "ZeidonError", null );

   wXferO = task.getViewByName( "wXferO" );
   if ( VmlOperation.isValid( wXferO ) )
   {
      // EditBox: EBUserName
      nRC = wXferO.cursor( "Root" ).checkExistenceOfEntity( ).toInt();
      if ( nRC >= 0 ) // CursorResult.SET
      {
         strMapValue = request.getParameter( "EBUserName" );
         strMapValue = ReplaceXSSValues( strMapValue );
         try
         {
            if ( webMapping )
               VmlOperation.CreateMessage( task, "EBUserName", "", strMapValue );
            else
               wXferO.cursor( "Root" ).getAttribute( "wAttemptedUserName" ).setValue( strMapValue, "" );
         }
         catch ( InvalidAttributeValueException e )
         {
            nMapError = -16;
            VmlOperation.CreateMessage( task, "EBUserName", e.getReason( ), strMapValue );
         }
      }

      // EditBox: EditBox3
      nRC = wXferO.cursor( "Root" ).checkExistenceOfEntity( ).toInt();
      if ( nRC >= 0 ) // CursorResult.SET
      {
         strMapValue = request.getParameter( "EditBox3" );
         strMapValue = ReplaceXSSValues( strMapValue );
         try
         {
            if ( webMapping )
               VmlOperation.CreateMessage( task, "EditBox3", "", strMapValue );
            else
               wXferO.cursor( "Root" ).getAttribute( "wCreatePassword" ).setValue( strMapValue, "" );
         }
         catch ( InvalidAttributeValueException e )
         {
            nMapError = -16;
            VmlOperation.CreateMessage( task, "EditBox3", e.getReason( ), strMapValue );
         }
      }

   }

   if ( webMapping == true )
      return 2;

   if ( nMapError < 0 )
      session.setAttribute( "ZeidonError", "Y" );

   return nMapError;
}

%>

<%

session = request.getSession( );
Task task = null;
KZMSGQOO_Object mMsgQ = null; // view to Message Queue
View vKZXMLPGO = null;
String strLastPage = "";
short  nRepos = 0;
boolean bDone = false;
int nOptRC = 0;
int nRC = 0;
CursorResult csrRC = null;
CursorResult csrRCk = null;

int nRCk = 0;  // temp fix for SetCursorEntityKey

long lEKey = 0; // temp fix for SetCursorEntityKey

String strKey = "";
String strActionToProcess = "";
String strURL = "";
String strError = "";
String strErrorFlag = "";
String strErrorTitle = "";
String strErrorMsg = "";
String strFocusCtrl = "";
String strBannerName = "";
String strVMLError = "";
String strOpenFile = "";
String strOpenPopupWindow = "";
String strPopupWindowSZX = "";
String strPopupWindowSZY = "";
String strDateFormat = "";
String strDialogName = "";
String strWindowName = "";
String strLastWindow;
String strLastAction;
String strFunctionCall = "";
String strNextJSP_Name = "";
String strInputFileName = "";

strActionToProcess = (String) request.getParameter( "zAction" );

strLastWindow = (String) session.getAttribute( "ZeidonWindow" );
if ( StringUtils.isBlank( strLastWindow ) ) 
   strLastWindow = "NoLastWindow";

strLastAction = (String) session.getAttribute( "ZeidonAction" );

// Check to see if the Zeidon subtask view already exists.  If not, create
// it and copy it into the application object.
String taskId = (String) session.getAttribute( "ZeidonTaskId" );
if ( StringUtils.isBlank( taskId ) )
{
   task = objectEngine.createTask( "Base", session.getId() );
   session.setAttribute( "ZeidonTaskId", task.getTaskId() );
}
else
{
   task = objectEngine.getTaskById( taskId );
}

if ( task == null )
{
   session.setAttribute( "ZeidonTaskId", null );
   strURL = response.encodeRedirectURL( "logout.jsp" );
   response.sendRedirect( strURL );
   return; // something really bad has happened!!!
}

vKZXMLPGO = JspWebUtils.createWebSession( null, task, "" );
mMsgQ = new KZMSGQOO_Object( vKZXMLPGO );
mMsgQ.setView( VmlOperation.getMessageObject( task ) );
wStartUp_Dialog wStartUp = new wStartUp_Dialog( vKZXMLPGO );

strURL = "";
bDone = false;
nRC = 0;

task.log().info("*** wStartUpLogin strActionToProcess *** " + strActionToProcess );
task.log().info("*** wStartUpLogin LastWindow *** " + strLastWindow );
task.log().info("*** wStartUpLogin LastAction *** " + strLastAction );

if ( strActionToProcess != null )
{
   if ( task != null )
   {
      // Delete the message object if error on last interation.
      View vMsgQ = task.getViewByName( "__MSGQ" );
      if ( VmlOperation.isValid( vMsgQ ) )
      {
         mMsgQ.setView( null );
         vMsgQ.drop( );
      }

   }

   while ( bDone == false && StringUtils.equals( strActionToProcess, "GOTO_EmployeeStudentWindow" ) )
   {
      bDone = true;
      VmlOperation.SetZeidonSessionAttribute( session, task, "wStartUpLogin", strActionToProcess );

      // Prebuild/Postbuild Operations.
      // These are called because we Unregister Zeidon when this page is finished loading, so
      // these operations need to be called before any action code (for recreating objects etc).
      nOptRC = wStartUp.PrebuildLoginWindow( new zVIEW( vKZXMLPGO ) );
      // Input Mapping
      nRC = DoInputMapping( request, session, application, false );
      if ( nRC < 0 )
         break;

      // Next Window
      strURL = response.encodeRedirectURL( "wStartUpSecurityValidations.jsp" );
      nRC = 1;  // do the redirection
      break;
   }

   while ( bDone == false && StringUtils.equals( strActionToProcess, "ProcessPortalLogin" ) )
   {
      bDone = true;
      VmlOperation.SetZeidonSessionAttribute( session, task, "wStartUpLogin", strActionToProcess );

      // Prebuild/Postbuild Operations.
      // These are called because we Unregister Zeidon when this page is finished loading, so
      // these operations need to be called before any action code (for recreating objects etc).
      nOptRC = wStartUp.PrebuildLoginWindow( new zVIEW( vKZXMLPGO ) );
      // Input Mapping
      nRC = DoInputMapping( request, session, application, false );
      if ( nRC < 0 )
         break;

      // Action Operation
      nRC = 0;
      VmlOperation.SetZeidonSessionAttribute( null, task, "wStartUpLogin", "wStartUp.ProcessPortalLogin" );
      nOptRC = wStartUp.ProcessPortalLogin( new zVIEW( vKZXMLPGO ) );
      if ( nOptRC == 2 )
      {
         nRC = 2;  // do the "error" redirection
         session.setAttribute( "ZeidonError", "Y" );
         break;
      }

      // Dynamic Next Window
      nRC = vKZXMLPGO.cursor( "NextDialogWindow" ).checkExistenceOfEntity( ).toInt();
      if ( nRC >= 0 )
      {
         strDialogName = vKZXMLPGO.cursor( "NextDialogWindow" ).getAttribute( "DialogName" ).getString( "" );
         strWindowName = vKZXMLPGO.cursor( "NextDialogWindow" ).getAttribute( "WindowName" ).getString( "" );
         strNextJSP_Name = strDialogName + strWindowName + ".jsp";
         vKZXMLPGO.cursor( "NextDialogWindow" ).deleteEntity( CursorPosition.NEXT );
         strURL = response.encodeRedirectURL( strNextJSP_Name );
         nRC = vKZXMLPGO.cursor( "NextDialogWindow" ).checkExistenceOfEntity( ).toInt();
         if ( nRC >= 0 )
            strFunctionCall = vKZXMLPGO.cursor( "NextDialogWindow" ).getAttribute( "FunctionCall" ).getString( "" );
         else
            strFunctionCall = "";

         if ( strFunctionCall != null && StringUtils.equals( strFunctionCall, "StartSubwindow" ) )
         {
            vKZXMLPGO.cursor( "PagePath" ).createEntity( CursorPosition.NEXT );
            vKZXMLPGO.cursor( "PagePath" ).getAttribute( "LastPageName" ).setValue( "wStartUpLogin", "" );
         }

         nRC = 1;  // do the redirection
         break;
      }

      // Next Window
      strURL = response.encodeRedirectURL( "nMenuDashboard.jsp" );
      nRC = 1;  // do the redirection
      break;
   }

   while ( bDone == false && strActionToProcess.equals( "ZEIDON_ComboBoxSubmit" ) )
   {
      bDone = true;

      // Input Mapping
      nRC = DoInputMapping( request, session, application, false );
      if ( nRC < 0 )
         break;

      // No redirection, we are staying on this page.
      nRC = 0;
      break;
   }

   while ( bDone == false && StringUtils.equals( strActionToProcess, "mNew_BlankTag" ) )
   {
      bDone = true;
      VmlOperation.SetZeidonSessionAttribute( session, task, "wStartUpLogin", strActionToProcess );

      // Prebuild/Postbuild Operations.
      // These are called because we Unregister Zeidon when this page is finished loading, so
      // these operations need to be called before any action code (for recreating objects etc).
      nOptRC = wStartUp.PrebuildLoginWindow( new zVIEW( vKZXMLPGO ) );
      // Input Mapping
      nRC = DoInputMapping( request, session, application, false );
      if ( nRC < 0 )
         break;

      break;
   }

   while ( bDone == false && strActionToProcess.equals( "_OnUnload" ) )
   {
      bDone = true;
      if ( task != null )
      {
         task.log().info( "OnUnload UnregisterZeidonApplication: ----->>> " + "wStartUpLogin" );
         task.dropTask();
         task = null;
         session.setAttribute( "ZeidonTaskId", task );
      }

      // Next Window is HTML termination
      strURL = response.encodeRedirectURL( "logout.jsp" );
      response.sendRedirect( strURL );
      return;
   }

   while ( bDone == false && strActionToProcess.equals( "_OnTimeout" ) )
   {
      bDone = true;
      if ( task != null )
      {
         task.log().info( "OnUnload UnregisterZeidonApplication: ------->>> " + "wStartUpLogin" );
         task.dropTask();
         task = null;
         session.setAttribute( "ZeidonTaskId", task );
      }

      // Next Window is HTML termination
      strURL = response.encodeRedirectURL( "TimeOut.html" );
      response.sendRedirect( strURL );
      return;
   }

   while ( bDone == false && strActionToProcess.equals( "_OnResubmitPage" ) )
   {
      bDone = true;
      VmlOperation.SetZeidonSessionAttribute( session, task, "wStartUpLogin", strActionToProcess );

      // Input Mapping
      nRC = DoInputMapping( request, session, application, false );
      if ( nRC < 0 )
         break;

      strURL = response.encodeRedirectURL( "wStartUpLogin.jsp" );
      nRC = 1;  //do the redirection
      break;
   }

   if ( nRC != 0 )
   {
      if ( nRC > 0 )
      {
         if ( nRC > 1 )
         {
            strURL = response.encodeRedirectURL( "wStartUpLogin.jsp" );
            task.log().info( "Action Error Redirect to: " + strURL );
         }

         if ( ! strURL.equals("wStartUpLogin.jsp") ) 
         {
            response.sendRedirect( strURL );
            // If we are redirecting to a new page, then we need this return so that the rest of this page doesn't get built.
            return;
         }
      }
      else
      {
         if ( nRC > -128 )
         {
            strURL = response.encodeRedirectURL( "wStartUpLogin.jsp" );
            task.log().info( "Mapping Error Redirect to: " + strURL );
         }
         else
         {
            task.log().info( "InputMapping Reentry Prevented" );
         }
      }
   }

}

if ( session.getAttribute( "ZeidonError" ) == "Y" )
   session.setAttribute( "ZeidonError", null );
else
{

   VmlOperation.SetZeidonSessionAttribute( null, task, "wStartUpLogin", "wStartUp.PrebuildLoginWindow" );
   nOptRC = wStartUp.PrebuildLoginWindow( new zVIEW( vKZXMLPGO ) );
   if ( nOptRC == 2 )
   {
      View vView;
      String strMessage;
      String strURLParameters;

      vView = task.getViewByName( "wXferO" );
      strMessage = vView.cursor( "Root" ).getAttribute( "WebReturnMessage" ).getString( "" );
      strURLParameters = "?CallingPage=wStartUpLogin.jsp" +
                         "&Message=" + strMessage +
                         "&DialogName=" + "wStartUp" +
                         "&OperationName=" + "PrebuildLoginWindow";
      strURL = response.encodeRedirectURL( "MessageDisplay.jsp" + strURLParameters );
      response.sendRedirect( strURL );
      task.log().info( "Pre/Post Redirect to: " + strURL );
      return;
   }
}

%>

<html>
<head>

<title>Login Page</title>

<%@ include file="./include/head.inc" %>
<!-- Timeout.inc has a value for nTimeout which is used to determine when to -->
<!-- log a user out.  Timeout.inc is not used if the dialog or window has a timeout value set. -->
<%@ include file="./include/timeout.inc" %>
<script language="JavaScript" type="text/javascript" src="./js/common.js?v=20170830154522222"></script>
<script language="JavaScript" type="text/javascript" src="./js/scw.js?v=20170830154522222"></script>
<script language="JavaScript" type="text/javascript" src="./js/animatedcollapse.js?v=20170830154522222"></script>
<script language="JavaScript" type="text/javascript" src="./js/jquery.blockUI.js?v=20170830154522222"></script>
<script language="JavaScript" type="text/javascript" src="./genjs/wStartUpLogin.js?v=20170830154522222"></script>

</head>

<body onLoad="_AfterPageLoaded( )" onSubmit="_DisableFormElements( true )" onBeforeUnload="_BeforePageUnload( )">

<%@ include file="./include/pagebackground.inc" %>  <!-- just temporary until we get the painter dialog updates from Kelly ... 2011.10.08 dks -->

<div id="wrapper">

<%@ include file="./include/banner.inc" %>

<!-- Main Navigation *********************** -->
<div id="mainnavigation" class="topnavigation" >
   <ul id="Blank Menu" name="Blank Menu" >
       <li id="lmNew_BlankTag" name="lmNew_BlankTag" ><a href="#" onclick="mNew_BlankTag()">   </a></li>
   </ul>
</div>  <!-- end Navigation Bar -->

<%@include file="./include/topmenuend.inc" %>
<div id="maincontent">
<div id="layoutgrid">
<!--System Maintenance-->

<%@ include file="./include/systemmaintenance.inc" %>

<!-- END System Maintenance-->


<form name="wStartUpLogin" id="wStartUpLogin" method="post">
   <input name="zAction" id="zAction" type="hidden" value="NOVALUE">
   <input name="zTableRowSelect" id="zTableRowSelect" type="hidden" value="NOVALUE">
   <input name="zDisable" id="zDisable" type="hidden" value="NOVALUE">

<%
   View sHost = null;
   View mPerson = null;
   View mUser = null;
   View wXferO = null;
   String strRadioGroupValue = "";
   String strComboCurrentValue = "";
   String strAutoComboBoxExternalValue = "";
   String strComboSelectedValue = "0";
   String strErrorColor = "";
   String strErrorMapValue = "";
   String strTextDisplayValue = "";
   String strTextURL_Value = "";
   String strSolicitSave = "";
   String strTblOutput = "";
   int    ComboCount = 0;
   int    iTableRowCnt = 0;
   CursorResult csrRC2 = null;
   nRC = 0;

   // FindErrorFields Processing
   mMsgQ = new KZMSGQOO_Object( vKZXMLPGO );
   mMsgQ.setView( VmlOperation.getMessageObject( task ) );
   strError = mMsgQ.FindErrorFields( );

   // strError is of the form: "Y\tChemicalName\tMax length exceeded\t\nMapping value in error\t\nY\tPercent\tInvalid numeric\t\n6.84%\t\n ..."
   // We want to find the first "Y" error flag if it exists.
   int nLth = strError.length( );
   int nPos = strError.indexOf( "\t" );
   while ( nPos > 0 && nPos < nLth )
   {
      strErrorFlag = strError.substring( nPos - 1, nPos );
      if ( StringUtils.equals( strErrorFlag, "Y" ) )
      {
         int nPos2 = strError.indexOf( "\t\n" );
         if ( nPos2 >= 0 )
         {
            strErrorMapValue = strError.substring( nPos + 1, nPos2 );
            nPos = strErrorMapValue.indexOf( "\t" );
            if ( nPos >= 0 )
            {
               strErrorTitle = strErrorMapValue.substring( 0, nPos );
               strErrorMsg = strErrorMapValue.substring( nPos + 1 );
            }
         }

         break;
      }
      else
      {
         nPos = strError.indexOf( "\t\n", nPos + 1 );
         if ( nPos > 0 )
         {
            strErrorTitle = strError.substring( nPos + 2 ); // debugging
            int nPos2 = strError.indexOf( "\t\n", nPos + 2 );
            if ( nPos2 >= 0 )
            {
               nPos = nPos2 + 2;
               strErrorTitle = strError.substring( nPos ); // debugging
               task.log().info( "Error: " + strErrorTitle ); // debugging
               nPos = strError.indexOf( "\t", nPos );
            }
            else
               nPos = -1;
         }
      }
      // Setting strActionToProcess = null because this is an "Unregister App" page, if an error occurs on the page, we still unregister.
      strActionToProcess = null;
   }

   strSolicitSave = vKZXMLPGO.cursor( "Session" ).getAttribute( "SolicitSaveFlag" ).getString( "" );

   strFocusCtrl = VmlOperation.GetFocusCtrl( task, "wStartUp", "Login" );
   strOpenFile = VmlOperation.FindOpenFile( task );
   strDateFormat = "DD.MM.YYYY";

%>

   <input name="zFocusCtrl" id="zFocusCtrl" type="hidden" value="<%=strFocusCtrl%>">
   <input name="zOpenFile" id="zOpenFile" type="hidden" value="<%=strOpenFile%>">
   <input name="zDateFormat" id="zDateFormat" type="hidden" value="<%=strDateFormat%>">
   <input name="zDateSequence" id="zDateSequence" type="hidden" value="DMY">
   <input name="zLanguage" id="zLanguage" type="hidden" value="">
   <input name="zOpenPopupWindow" id="zOpenPopupWindow" type="hidden" value="<%=strOpenPopupWindow%>">
   <input name="zPopupWindowSZX" id="zPopupWindowSZX" type="hidden" value="<%=strPopupWindowSZX%>">
   <input name="zPopupWindowSZY" id="zPopupWindowSZY" type="hidden" value="<%=strPopupWindowSZY%>">
   <input name="zErrorFlag" id="zErrorFlag" type="hidden" value="<%=strErrorFlag%>">
   <input name="zTimeout" id="zTimeout" type="hidden" value="<%=nTimeout%>">
   <input name="zSolicitSave" id="zSolicitSave" type="hidden" value="<%=strSolicitSave%>">

   <div name="ShowVMLError" id="ShowVMLError" class="ShowVMLError">
      <%=strVMLError%>
   </div>

<% /* GroupBox7:GroupBox */ %>

<div id="GroupBox7" name="GroupBox7" class="align-center adminpage" >  <!-- GroupBox7 --> 

<% /* Text1:Text */ %>

<span class="align-center"  id="Text1" name="Text1" >Text1</span>

<% /* GroupBox2:GroupBox */ %>
<div id="GroupBox2" name="GroupBox2"   class=" centerloginbox">

<table cols=2 class="grouptable">

<tr>
<td  class="text14bold" >
<% /* Text7:Text */ %>

<span class="text14bold"  id="Text7" name="Text7" >User Name</span>

</td>
<td >
<% /* EBUserName:EditBox */ %>
<%
   strErrorMapValue = VmlOperation.CheckError( "EBUserName", strError );
   if ( !StringUtils.isBlank( strErrorMapValue ) )
   {
      if ( StringUtils.equals( strErrorFlag, "Y" ) )
         strErrorColor = "color:red;";
   }
   else
   {
      strErrorColor = "";
      wXferO = task.getViewByName( "wXferO" );
      if ( VmlOperation.isValid( wXferO ) == false )
         task.log( ).debug( "Invalid View: " + "EBUserName" );
      else
      {
         nRC = wXferO.cursor( "Root" ).checkExistenceOfEntity( ).toInt();
         if ( nRC >= 0 )
         {
            try
            {
               strErrorMapValue = wXferO.cursor( "Root" ).getAttribute( "wAttemptedUserName" ).getString( "" );
            }
            catch (Exception e)
            {
               out.println("There is an error on EBUserName: " + e.getMessage());
               task.log().error( "*** Error on ctrl EBUserName", e );
            }
            if ( strErrorMapValue == null )
               strErrorMapValue = "";

            task.log( ).debug( "Root.wAttemptedUserName: " + strErrorMapValue );
         }
         else
            task.log( ).debug( "Entity does not exist for EBUserName: " + "wXferO.Root" );
      }
   }
%>

<input name="EBUserName" id="EBUserName" style="<%=strErrorColor%>" type="text"  value="<%=strErrorMapValue%>" onkeypress="return _OnEnter( event )" >

</td>
</tr>
<tr>
<td  class="text14bold" >
<% /* Text8:Text */ %>

<span class="text14bold"  id="Text8" name="Text8" >Password</span>

</td>
<td >
<% /* EditBox3:EditBox */ %>
<input name="EditBox3" id="EditBox3" style="<%=strErrorColor%>" type="password" value="" onkeypress="return _OnEnter( event )" >

</td>
</tr>
</table>

</div>  <!-- GroupBox2 --> 

<% /* GroupBox3:GroupBox */ %>

<div id="GroupBox3" name="GroupBox3" class="align-center" >  <!-- GroupBox3 --> 

<% /* PBLogin:PushBtn */ %>
<button type="button" class="button" name="PBLogin" id="PBLogin" value="" onclick="ProcessPortalLogin( )" >Login</button>


</div>  <!--  GroupBox3 --> 

</div>  <!--  GroupBox7 --> 

<%
   if ( StringUtils.equals( strErrorFlag, "X" ) )
   {
      nPos = strError.indexOf( "\t", 2 );
      if ( nPos >= 0 )
      {
         strErrorTitle = strError.substring( 2, nPos );
         int nPos2 = strError.indexOf( "\t\n" );
         strErrorMsg = strError.substring( nPos + 1, nPos2 );
      }
   }

%>

   <input name="zError" id="zError" type="hidden" value="<%=strErrorMsg%>">

</form>
</div>   <!-- This is the end tag for the div 'layoutgrid' -->

</div>   <!-- This is the end tag for the div 'maincontent' -->

<%@ include file="./include/footer.inc" %>

</div>  <!-- This is the end tag for wrapper -->

</body>
<script type="text/javascript">animatedcollapse.init();</script>
</html>
<%
   session.setAttribute( "ZeidonWindow", "wStartUpLogin" );
   session.setAttribute( "ZeidonAction", null );

   if ( task != null && strActionToProcess == null  )
   {
      task.log().info( "After building the page UnregisterZeidonApplication: ------>>> " + "wStartUpLogin" );
      task.dropTask();
      task = null;
      session.setAttribute( "ZeidonTaskId", task );
   }

   strActionToProcess = "";

%>
