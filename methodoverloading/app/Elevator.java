package com.xworkz.allprojects.app.inheritance.methodoverloading.app;

public class Elevator {
	public void lift()
	{
		System.out.println("invoking in the lift no args");
		lift(635,"tata");
	}
	public void lift(String nameofthemanufacturer)
	{
		System.out.println("invoking in the lift no args");
	}
	public void lift(int price)
	{
		System.out.println("price" +price);
	}
	public void lift(int weight,String brand)
	{
		System.out.println("double,string");
		lift(weight);
		lift(brand);
	}
	

}
