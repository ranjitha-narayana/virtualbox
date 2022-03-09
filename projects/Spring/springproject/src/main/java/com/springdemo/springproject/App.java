package com.springdemo.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
        Student stu=context.getBean("student",Student.class);
        stu.college();
        stu.name();
    }
}
