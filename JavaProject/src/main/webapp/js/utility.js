function GetSpanCount()
{ 
   var all = document.getElementsByTagName("*");

   for (var i=0, max=all.length; i < max; i++) {
   }
}

function replaceSpansWithLabels()
{

   var spanCount = document.getElementsByTagName("*").length + 1;
   var cont = new Array();
   
   for (i = 1; i < spanCount; i++)
   {
      cont[i] = "Text" + i;
   }
   for (i = 1; i < spanCount; i++)  
   {
      var setClass = document.getElementById(cont[i]).className;
      var replaceWith = document.getElementById(cont[i]).innerHTML;
      document.getElementById(cont[i]).outerHTML = '<label id="'+cont[i]+'" class="'+ setClass+'"/>'+replaceWith;
   }	
} 

function CommentLimiter()
{
   var count = 2000 - document.getElementById('MLEPriorComment').value.length;
   var len = document.getElementById('CurrentComment').value.length;
   document.getElementById('nCharsLeft').value = count-len;
   document.getElementById('nCharsLeft').innerHTML = count-len;
   
}

