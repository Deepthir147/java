package com.xworkz.allprojects.app.inheritance.assocaitionandoverloading.boot;

import com.xworkz.allprojects.app.inheritance.assocaitionandoverloading.app.Bakery;
import com.xworkz.allprojects.app.inheritance.assocaitionandoverloading.app.CookiesBakery;

public class BakeryRunner {

	public static void main(String[] args) {
		Bakery bakery=new CookiesBakery();
		bakery.taste();
		bakery.taste("Asha");
		bakery.taste("Indian Sweet HOuse",200);
		
		

	}

}
