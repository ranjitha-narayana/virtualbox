package com.example.CarDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BMW extends Car{
	@Autowired
	Car car;
    public void color() {
	
	System.out.println("color of  the BMW is Greyyyyyyyy!!!!!!!!....");
}
public void getDetails() {
	car.setName("BMW");
	System.out.println("Car Name is...."+car.getName());
}

}
