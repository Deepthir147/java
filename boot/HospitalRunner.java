package com.xworkz.allprojects.boot;

import com.xworkz.allprojects.app.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Running main in HospitalRunner");
		
		Hospital hospital=new Hospital();
		
		hospital.provideTreatment();

	}

}
