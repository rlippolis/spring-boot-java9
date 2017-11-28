# Convert a Spring Boot application to Java 9

**Initial commit, still a Java 8 application**

`mvn spring-boot:run` as Java 8 -> OK \
`mvn spring-boot:run` as Java 9 -> ClassNotFoundException javax.xml.bind.JAXBException \
`mvn clean package` -> ClassNotFoundException: javax.transaction.SystemException

**Making it build and run on Java 9 (but still a Java 8 application)**

Added `java.xml.bind` module to Spring Boot Maven plugin and Surefire plugin

**Convert to Java 9 application (everything still works the same)**

No changes needed

**Create separate fat and thin jar, to demonstrate running from command line**

Execute `./run-with-classpath.sh`

**Try to run the application with a module path instead of a classpath (Java 9 style)**

Execute `./run-with-modulepath.sh` (won't work)

**Fix the run script for running the application with a module path**

Added parameters to `./run-with-modulepath.sh`

**Make the application a Java 9 module**

Added `src/main/java/module-info.java` \
No longer needed to explicitly add modules on command line
