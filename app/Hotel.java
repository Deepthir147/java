package com.xworkz.allprojects.app;

public class Hotel {
public void provideFood() {
		
		System.out.println("Invoking provideFood in Hotel");
		
		if(this.cook!=null) {
			this.Cook.prepareFood();
		}
		else {
			System.out.println("Cannot access Cook(NullPointerException)");
		}
		if(this.Cook!=null) {
			this.Cook.cleanKitchen();
		}
		else {
			System.out.println("Cannot access Cook(NullPointerException)");
		}
		
	}

}
