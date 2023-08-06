package com.xworkz.allprojects.app.inheritance.overload;

public class Mushroom {
	public String location;
	public String weather;
	public int price;
	public int quantity;
	public Mushroom(String location,String weather,int price,int quantity)
	{
		System.out.println("Invoking Mushroom");
		this.location=location;
		this.price=price;
		this.weather=weather;
		this.quantity=quantity;
		
		
	}
	

}
