package com.xworkz.allprojects.app.inheritance.overload;

public class Poison extends Mushroom{
	public Poison() {
		super("Attiguppe","Winter",20,500);
	}
	public Poison(String location,String weather,int price,int quantity)
	{
		super(location,weather,price,quantity);
	}
}
