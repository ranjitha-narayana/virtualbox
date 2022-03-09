package com.springdemo.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
       Employee emp=(Employee)context.getBean("employee");
       emp.details();
    }
}
