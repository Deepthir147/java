package com.xworkz.allprojects.app.inheritance.assocaitionandoverloading.app;

public class Bakery {
	public void taste()
	{
		System.out.println("Invoking no arg in taste");
	}
	public void taste(String sweetName)
	{
		System.out.println("Invokin sweetName in taste");
	}
	public void taste(String sweetName,int price)
	{
		System.out.println("Invokin sweetName and price in taste");
	}

}
