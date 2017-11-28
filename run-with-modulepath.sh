#!/bin/bash

CP=`java -jar lib/spring-boot-thin-wrapper-1.0.7.RELEASE.jar --thin.archive=. --thin.classpath`

java -p target/spring-boot-java9-0.0.1-SNAPSHOT.jar:$CP:$JAVA_HOME/jmods/ \
    --add-modules java.xml.bind \
    --add-modules java.sql \
    --add-modules java.instrument \
    --patch-module java.sql=$M2_REPO/javax/transaction/javax.transaction-api/1.2/javax.transaction-api-1.2.jar \
    --add-exports java.sql/javax.transaction=spring.tx,hibernate.core \
    --add-opens java.base/java.lang=javassist \
    -m spring.boot.java9/com.jdriven.springbootjava9.SpringBootJava9Application
