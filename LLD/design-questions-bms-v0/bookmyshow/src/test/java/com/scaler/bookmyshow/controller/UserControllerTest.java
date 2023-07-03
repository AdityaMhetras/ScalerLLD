package com.scaler.bookmyshow.controller;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserControllerTest {

    @Test
    public void testController() {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        UserController l = ctx.getBean(UserController.class);
        System.out.println("In main() the ctx is " + ctx);
    }
}
