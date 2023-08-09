package com.xworkz.allprojects.app.inheritance.assocaitionandoverloading.app;

public class CookiesBakery extends Bakery{
	@Override
	public void taste()
	{
		System.out.println("Invoking in tha CookiesBakery");
	}
	@Override
	public void taste(String sweetName)
	{
		System.out.println("Invokin in the sweetName inthe bakery");
	}
	@Override
	public void taste(String sweetName,int price)
	{
		System.out.println("Invoking sweetNsme");
	}
	

}
