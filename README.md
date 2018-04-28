# SimpleJavaWebApp
Simple Java Web App with one servlet and one JSP page

## Deploy instruction (IDEA Ultimate)
1. In IDEA's settings add Tomcat plugin;
1. Connect to the project support for Maven framework;
1. In the pom.xml file, add the following lines:
    `<build><finalName>[war-name]</finalName></build>`
    `<packaging>war</packaging>`
1. Create a new Run configuration based on the local Tomcat server;
1. Add as an artifact exploded war.

## Hot deploy (IDEA Ultimate)
1. Select exploded WAR;
1. Update classes and resources;
    1. On ‘Update’ action -> Update classes and resources;
    1. On frame deactivation -> Update classes and resources;
1. Run in Debug Mode.