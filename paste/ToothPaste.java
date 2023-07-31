package com.xworkz.allprojects.paste;

public class ToothPaste {
	public String name;
	public String brand;
	public String company;
	public Ingredent[] ingredents;
	
	public void ToothPaste(String name,String brand,String company,Ingredent[] ingredents) {
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingredents=ingredents;
		
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(brand);
		System.out.println(company);
		for(int index=0;index<this.ingredents.length;index++) {
			System.out.println(ingredents);
			Ingredent ref=this.ingredents[index];
			ref.printInfo();
		}
	}
	
	

}
