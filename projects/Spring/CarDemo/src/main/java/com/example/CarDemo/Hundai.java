package com.example.CarDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Hundai extends Car{
	@Autowired
	Car car;
	
	public void color() {
		
		System.out.println("color of the hundai is Black!!!!!......");
	}
	public void getDetails() {
		car.setName("HUNDAI");
	    System.out.println("Car name is......"+car.getName());
}}
