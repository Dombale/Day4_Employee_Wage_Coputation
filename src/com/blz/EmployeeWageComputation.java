package com.blz;

public class EmployeeWageComputation {

	static int wagePerHour = 20;
	static int empHrs = 0;
	static int empHrsf = 8;
	static int empHrsP = 4;

	public static void main(String[] args) {
		System.out.println("Welcome in Employee Wage Computation..!!");

		checkEmpSalary();
	}

	public static void checkEmpSalary() {
		int randomNum = (int) (Math.random() * 3); // create random number using math function
		switch (randomNum) {
		case 0:
			System.out.println(" Employee is Absent ");
			int salary = wagePerHour * empHrs; // Employee full Salary/Day
			System.out.println("Employee salary is :" + salary);
			break;
		case 1:
			System.out.println(" Employee is Present full time ");
			int salaryf = wagePerHour * empHrsf; // Employee full Salary/Day
			System.out.println("Employee salary is :" + salaryf);
			break;
		case 2:
			System.out.println(" Employee is Present part time ");
			int salaryp = wagePerHour * empHrsP; // Employee full Salary/Day
			System.out.println("Employee salary is :" + salaryp);
			break;
		}

	}
}
