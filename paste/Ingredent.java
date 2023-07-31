package com.xworkz.allprojects.paste;

public class Ingredent {
	
	public String name;
	public int quantity;
	public float cost;
	
	public Ingredent(String name,int qunatity,float cost) {
		this.name=name;
		this.quantity=qunatity;
		this.cost=cost;
		
		
	}
	public void printInfo()
	{
		System.out.println(name);
		System.out.println(quantity);
		System.out.println(cost);
	}
}
