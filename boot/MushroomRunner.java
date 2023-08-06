package com.xworkz.allprojects.app.inheritance.overload.boot;
import com.xworkz.allprojects.app.inheritance.overload.Poison;

public class MushroomRunner {

	public static void main(String[] args) {
		Poison poison=new Poison();
		System.out.println(poison.location);
		System.out.println(poison.weather );
		System.out.println(poison.price);
		System.out.println(poison.quantity);

	}

}
