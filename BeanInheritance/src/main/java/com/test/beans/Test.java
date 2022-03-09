package com.test.beans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String a[]){

        ConfigurableApplicationContext context
            = new ClassPathXmlApplicationContext("beaninheritance.xml");
            Book mybook = (Book) context.getBean("myBookBean");
        System.out.println(mybook.toString());
}
}
