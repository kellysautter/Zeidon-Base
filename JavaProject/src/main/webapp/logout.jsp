<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<meta http-equiv="Refresh" content="3;url=wStartUpLogin.jsp">

<%-- wStudntDHomePage --%>

<%@ page import="java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="org.apache.commons.lang3.*" %>
<%@ page import="com.quinsoft.zeidon.*" %>
<%@ page import="com.quinsoft.zeidon.standardoe.*" %>
<%@ page import="com.quinsoft.zeidon.utils.*" %>
<%@ page import="com.quinsoft.zeidon.vml.*" %>
<%@ page import="com.quinsoft.zeidon.domains.*" %>
<%

ObjectEngine objectEngine = JavaObjectEngine.getInstance();

session = request.getSession( );
Task task = null;
String taskId = (String) session.getAttribute( "ZeidonTaskId" );
if ( !StringUtils.isBlank( taskId ) )
{
   task = objectEngine.getTaskById( taskId );
   if ( task != null )
   {
        task.log().info( "On logout window UnregisterZeidonApplication: -------->>> "  );

         task.dropTask();
         task = null;
   }
         session.setAttribute( "ZeidonTaskId", null );
}

%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
Redirecting...Please wait

</body>

</html>
