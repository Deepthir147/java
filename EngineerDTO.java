package com.xworkz.engineer.app.dto;

import java.io.Serializable;

public class EngineerDTO implements Serializable{
	private int id;
	private String name;
	private String collegeName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof EngineerDTO) {
				 System.out.println("object is EngineerDTO");
			}
			EngineerDTO casted=(EngineerDTO)obj;
			if(casted.name.equals(obj)&&casted.collegeName.equals(obj)&&casted.id==this.id)
			{
				System.out.println("Instance is  Same");
			}
			else
			{
				System.out.println("Instance is not same");
			}
			
			
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "EngineerDTO [id=" + id + ", name=" + name + ", collegeName=" + collegeName + "]";
	}
	

	

}
