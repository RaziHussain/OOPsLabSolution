package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.bean.Employee;

public class CredentialService {

	public String generateEmailAddress(Employee emp) {
		return emp.getFirstName().toLowerCase() + "" + emp.getLastName().toLowerCase() + "@"
				+ emp.getDepartmentName().toLowerCase() + ".greatlearning" + ".com";

	}

	public static String generatePassword() {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		char[] password = new char[8];
		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			int n = random.nextInt(combinedChars.length());
			password[i] = combinedChars.charAt(n);
		}
		return String.valueOf(password);

	}
}
