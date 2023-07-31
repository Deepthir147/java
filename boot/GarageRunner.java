package com.xworkz.allprojects.boot;

import com.xworkz.allprojects.app.Garage;

public class GarageRunner {

	public static void main(String[] args) {
		System.out.println("Running main in GarageRunner");
		
		Garage garage =new Garage();
		
		garage.vehicleService();


	}

}
