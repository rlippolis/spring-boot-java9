#!/bin/bash

CP=`java -jar lib/spring-boot-thin-wrapper-1.0.7.RELEASE.jar --thin.archive=. --thin.classpath`

java -cp target/spring-boot-java9-0.0.1-SNAPSHOT.jar:$CP:$JAVA_HOME/jmods/ \
    --add-modules java.xml.bind \
    com.jdriven.springbootjava9.SpringBootJava9Application
