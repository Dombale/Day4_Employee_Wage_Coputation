package com.blz;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome in Employee Wage Computation..!!");
		checkEmplPresence();
	}

	public static void checkEmplPresence() {

		int randomNum = (int) (Math.random() * 2); // create random number using math function

		if (randomNum == 1) // Check Employee presence
		{
			System.out.println(" Employee is Present " + randomNum);
		} else
			System.out.println(" Employee is Absent " + randomNum);
	}
}
