package com.xworkz.allprojects.app;

public class Hospital {
public String name="ESI";
	
	public Doctor doctor=new Doctor();
	public Nurse nurse=new Nurse();
	public Patient patient=new Patient();
	
	public void provideTreatment() {
		
	System.out.println("Invoking provideTreatment in Hospital ");
	
	
	if(this.doctor!=null) {
		this.doctor.counselPatient();
		this.doctor.giveTreatment();
	}
	else {
		System.out.println("not Doctor");
	}
	
	if(this.nurse!=null) {
		this.nurse.patientCare();
		this.nurse.maintainPatientRecord();
	}
	else {
		System.out.println("not Nurse");

	}
	System.out.println("*********************************");

	if(this.patient!=null) {
		this.patient.consultDoctor();
		this.patient.paidFees();
		
	}
	else {
		System.out.println("not Patient");

	}
	}

}
