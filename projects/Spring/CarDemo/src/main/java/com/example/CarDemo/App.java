package com.example.CarDemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;


public class App 
{
    public static void main(String[] args)
    {
    
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CarConfig.class);
        Manufacturer mnf=context.getBean("manufacturer",Manufacturer.class);
       mnf.buildcar();
    }
}
