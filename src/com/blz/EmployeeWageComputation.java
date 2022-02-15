package com.blz;

public class EmployeeWageComputation {

	static int wagePerHour = 20;
	static int empHrs = 0;
	static int empHrsf = 8;
	static int empHrsP = 4;
	static int workingDay = 20;

	public static void main(String[] args) {
		System.out.println("Welcome in Employee Wage Computation..!!");

		checkEmpSalary();
	}

	public static void checkEmpSalary() {
		int randomNum = (int) (Math.random() * 3); // create random number using math function
		switch (randomNum) {
		case 0:
			System.out.println(" Employee is Absent ");
			int salary = wagePerHour * empHrs; // Employee No Salary/Day
			System.out.println("Employee salary is :" + salary);
			break;
		case 1:
			System.out.println(" Employee is Present full time ");
			int salary1 = wagePerHour * empHrsf * workingDay; // Employee full Salary/Month
			System.out.println("Employee salary of Full time of Full Month is :" + salary1);
			break;
		case 2:
			System.out.println(" Employee is Present part time ");
			int salary11 = wagePerHour * empHrsP * workingDay; // Employee Part time Salary/Month
			System.out.println("Employee salary of part time of full month is :" + salary11);
			break;
		}

	}
}
