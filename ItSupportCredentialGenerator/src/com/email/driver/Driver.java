package com.email.driver;

import java.util.Scanner;

import com.email.model.Employee;

import com.email.services.GenerateCredentials;

public class Driver {
	
	public static void main(String[] args) {
		
		 System.out.println("you are in main class");
		 System.out.print("Please choose your department :"+ " \n"
		 		+" 1. Technical " + " \n"
		 		+" 2. Admin " + " \n"
		 		+" 3. Human Resource " + " \n"
		 		+" 4. Legal " + " \n"
		 		); 
		 
		 	Scanner sc= new Scanner(System.in);
		 	int str= sc.nextInt();  
		 	sc.close();
		 	Employee emp = new Employee("Arpan","Kumar");
		 	GenerateCredentials credential = new GenerateCredentials();
		 
		 switch(str){    
		 case 1: 
			 System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows");
			 System.out.println("Email  ---> "+credential.generateEmail(emp.getFirstName(), emp.getLastName(), "tech"));
			 System.out.println("Password ---> "+ String.valueOf(credential.generatePassword()));
		  break; 
		 case 2: 
			 System.out.println("Dear " + emp.getFirstName() +" your generated credentials are as follows");
			 System.out.println("Email  ---> "+credential.generateEmail(emp.getFirstName(), emp.getLastName(), "admin"));
			 System.out.println("Password ---> "+ String.valueOf(credential.generatePassword()));
		  break;
		 case 3: 
			 System.out.println("Dear " + emp.getFirstName() +" your generated credentials are as follows");
			 System.out.println("Email  ---> "+credential.generateEmail(emp.getFirstName(), emp.getLastName(), "hr"));
			 System.out.println("Password ---> "+ String.valueOf(credential.generatePassword()));
		  break;
		 case 4: 
			 System.out.println("Dear " + emp.getFirstName() +" your generated credentials are as follows");
			 System.out.println("Email  ---> "+credential.generateEmail(emp.getFirstName(), emp.getLastName(), "legal"));
			 System.out.println("Password ---> "+ String.valueOf(credential.generatePassword()));
		  break;
		   
		 }    
	}
}
