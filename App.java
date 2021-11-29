package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.bean.Employee;
import com.greatlearning.service.CredentialService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name: ");
		String firstName = sc.next();
		System.out.println("Enter the Last Name: ");
		String lastName = sc.next();
		System.out.println("Please Enter the department from thr following options:  ");
		System.out.println("1: Technical");
		System.out.println("2: Admin");
		System.out.println("3: HR");
		System.out.println("4: Legal");

		int ch = sc.nextInt();
		Employee emp;
		switch (ch) {
		case 1:
			emp = new Employee(firstName, lastName, "Technical");
			break;
		case 2:
			emp = new Employee(firstName, lastName, "Admin");
			break;
		case 3:
			emp = new Employee(firstName, lastName, "HR");
			break;
		case 4:
			emp = new Employee(firstName, lastName, "Legal");
			break;
		default:
			System.out.println("Invalid Option");
			return;
		}

		System.out.println("Dear " + firstName + " your generated credentials are as follows ");
		CredentialService cs = new CredentialService();
		String emailID = cs.generateEmailAddress(emp);
		System.out.println("Email Id  ---> " + emailID);
		String password = cs.generatePassword();
		System.out.println("Password ---> " + password);

	}

}
