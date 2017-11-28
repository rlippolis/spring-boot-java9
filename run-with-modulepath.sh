#!/bin/bash

CP=`java -jar lib/spring-boot-thin-wrapper-1.0.7.RELEASE.jar --thin.archive=. --thin.classpath`

java -p target/spring-boot-java9-0.0.1-SNAPSHOT.jar:$CP:$JAVA_HOME/jmods/ \
    -m spring.boot.java9/com.jdriven.springbootjava9.SpringBootJava9Application
