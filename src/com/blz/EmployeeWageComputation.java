package com.blz;

public class EmployeeWageComputation {

	static int wagePerHour = 20;
	static int empHrs = 0;
	static int empHrsf = 8;

	public static void main(String[] args) {
		System.out.println("Welcome in Employee Wage Computation..!!");

		checkEmpSalary();
	}

	public static void checkEmpSalary() {
		int randomNum = (int) (Math.random() * 2); // create random number using math function

		if (randomNum == 1) // Check Employee presence
		{
			System.out.println(" Employee is Present ");
			int salary = wagePerHour * empHrsf; // Employee Full timeSalary/Day
			System.out.println("Employee salary of Full time is :" + salary);
		} else {
			System.out.println(" Employee is Absent ");
			int salary = wagePerHour * empHrs; // Employee Full timeSalary/Day
			System.out.println("Employee salary is :" + salary);
		}
	}
}
