module spring.boot.java9 {
    requires java.xml.bind;
    requires java.sql;
    requires java.instrument;
    requires hibernate.jpa;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.tx;
    requires spring.beans;
    requires spring.data.jpa;
    requires spring.web;
    requires java.annotation;

    exports com.jdriven.springbootjava9;
    opens com.jdriven.springbootjava9;

    exports com.jdriven.springbootjava9.config;
    opens com.jdriven.springbootjava9.config;

    opens com.jdriven.springbootjava9.domain;

    exports com.jdriven.springbootjava9.service;
    opens com.jdriven.springbootjava9.service;

    exports com.jdriven.springbootjava9.controller;
    opens com.jdriven.springbootjava9.controller;
}
