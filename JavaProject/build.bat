rmdir /S/Q "%CATALINA_HOME%\webapps\base"
del "%CATALINA_HOME%\webapps\base.war"
del C:\lplr\base\JavaProject\target\base.war
del C:\lplr\base\JavaProject\zeidontrace.log

rem //copy c:\lplr\base\bin\*.x*  C:\lplr\base\JavaProject\src\main\resources\basebin
call mvn clean install -DskipTests=true

copy C:\lplr\base\JavaProject\target\base.war "%CATALINA_HOME%\webapps"
"%CATALINA_HOME%\bin\startup.bat"