package com.xworkz.allprojects.app.inheritance.methodoverloading.app;

public class plier {
	public void pluck()
	{
		System.out.println("invoking in the pluck no args");
		pluck('m',"tata");
	}
	public void pluck(String item)
	{
		System.out.println("invoking in the pluck");
	}
	public void pluck(int price)
	{
		System.out.println("price" +price);
	}
	public void pluck(char size,String brand)
	{
		System.out.println("double,string");
		pluck();
		pluck(brand);
	}
	

}
