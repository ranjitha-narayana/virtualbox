package com.beanprocess.main;

import com.beanprocess.beans.TestConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context  = new ClassPathXmlApplicationContext("postprocessor.xml");
        TestConnection networkMng = (TestConnection) context.getBean("connectionmanager");
        networkMng.readData();
        context.close();
    }
}
