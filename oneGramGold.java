package com.xworkz.allprojects.app.inheritance.overload;

public class oneGramGold extends Gold {
	public oneGramGold()
	{
		super("Dubai",65.2,true,"Joyalukas");	
	}
	public oneGramGold(String exportedLocation,double price,boolean original,String shopName)
	{
		super(exportedLocation,price,original,shopName);	
	}

}
