package com.test.Beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        ClassObject obj = context.getBean("classobject",ClassObject.class);
        System.out.println("Name= " + obj.getName());
        // Closing the context object.
        context.close();
    }
}
