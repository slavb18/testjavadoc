# testjavadoc
Example Rest JPA application

## Project structure
* testjavadoc-api contains WADL and xsd schemas shared between client and server
* testjavadoc-web contains web application with JAX-RS services and JPA model.
* testjavadoc-archetype contains archetype to create new project based on this.
* archetype contains scripts to create/update testjavadoc-archetype

##Example project creation based on this archetype in command line

mvn -DarchetypeGroupId=ru.ilb.testjavadoc -DarchetypeArtifactId=testjavadoc-archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=ru.ilb.sampleapplication -DartifactId=sampleapplication -Dversion=1.0-SNAPSHOT -Dpackage=ru.ilb.sampleapplication -Ddomain_packageName=documents -Ddomain_objectName=Document -Darchetype.interactive=false --batch-mode --update-snapshots archetype:generate


##Example project creation based on this archetype in Netbeans

1. File -> New Project, choose Maven -> Project from archetype, click Next
2. Start typing jparesresource in Search field and choose testjavadoc-archetype, click Next
3. Enter Project name (sampleapplication), Group Id and Package must *equals*, enter in both fields ru.ilb.sampleapplication. You may also configure object_urn and object_class properties. Click Next.

Project will be created. Before first run database should be created and access to web application granted (see schema.sql);

## Environment configuration
Place in ${catalina.base}/lib following jars:
* eclipselink-2.6.3.jar
* javax.json-1.0.4.jar
* javax.persistence-2.1.0.jar
* mysql-connector-java-5.1.31.jar

###Note about Tomcat before 8.0+
TomcatInstrumentableClassLoader is not intended to work on Tomcat 8.0+, but required in older versions.
In case of exception javax.persistence.TransactionRequiredException: No EntityManager with actual transaction available for current thread 
uncomment this line with org.springframework.instrument.classloading.tomcat.TomcatInstrumentableClassLoader in context.xml
and place spring-instrument-tomcat-4.3.2.RELEASE.jar in ${catalina.base}/lib
