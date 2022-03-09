package com.example.CarDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manufacturer {
 
@Autowired
Car car;
public void buildcar() {
	
	car.color();
	car.getDetails();
}
}
