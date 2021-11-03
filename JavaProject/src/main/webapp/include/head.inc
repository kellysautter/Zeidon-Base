<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- REQUIRED FOR RESPONSIVE MENU -->
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>Mission Manager</title>

<link href="./css/zeidon_allrelative.css" rel="stylesheet" type="text/css">
<link href="./css/zeidon.css" rel="stylesheet" type="text/css">

<!-- JQuery for Validations-->
<script src="./js/jquery.js" type="text/javascript"></script>
<script src="./js/utility.js" type="text/javascript"></script>

<!-- TinyMCE -->
<script language="JavaScript" type="text/javascript" src="./js/tinymce/jscripts/tiny_mce/tiny_mce.js"></script>
<script language="JavaScript" type="text/javascript" src="./js/TinyMCE.js"></script>
<script language="JavaScript" type="text/javascript" src="./js/msgLangLst.js" charset="UTF-8"></script>
<script language="JavaScript" type="text/javascript" src="./js/msgLang.js" charset="UTF-8"></script>

<!-- /TinyMCE -->
<script language="JavaScript" type="text/javascript">

function GLOBAL_GOTO_LogOut( )   
{

   // This is for indicating whether the user hit the window close box.
   isWindowClosing = false;

   if ( _IsDocDisabled( ) == false )
   {
      _DisableFormElements( true );

      document.forms[ 0 ].zAction.value = "_OnUnload";
      document.forms[ 0 ].submit( );
   }
}


</script>
