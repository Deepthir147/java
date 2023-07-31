package com.xworkz.allprojects.Runner;

import com.xworkz.allprojects.paste.Company;
import com.xworkz.allprojects.paste.Ingredent;
import com.xworkz.allprojects.paste.ToothPaste;

public class ToothpasteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				System.out.println("Running main ToothpasteRunner.....");

				String name = "Dabur Red";
				String brand = "Dabur";

				Company company = new Company("Dabur", "Mohit Malhotra", "India");

				Ingredent ingredentsn = new Ingredent("tulsi",5,12.6f);

				Ingredent ingredents1 = new Ingredent("Neem", 6, 36f);

				Ingredent ingredents2 = new Ingredent("Salt", 5, 8f);

				Ingredent ingredents3 = new Ingredent("Ginger", 8, 18f);

				Ingredent ingredents4 = new Ingredent("Maricha", 1, 56f);

				Ingredent[] ingredents = { ingredentsn, ingredents1, ingredents2, ingredents3, ingredents4 };

				ToothPaste toothpaste = new ToothPaste(name,brand, company, ingredents);
				toothpaste.printInfo();

			}

	


	}


