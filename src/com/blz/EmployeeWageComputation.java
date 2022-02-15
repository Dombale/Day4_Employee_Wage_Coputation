package com.blz;

public class EmployeeWageComputation {

	static int wagePerHour = 20;
	static int fullDayHour = 8;
	static int partTimeHour = 4;
	static int workingDaysInMonth = 20;
	static int wagePerDay;
	static int totalWage = 0;
	static int totalWorkingHour = 0;
	static int totalWorkingDay = 0;

	public static void main(String[] args) {
		System.out.println("Welcome in Employee Wage Computation..!!");

		checkEmpSalary();
	}

	public static void checkEmpSalary() {

		for (int i = 1; i <= workingDaysInMonth; i++) {
			if (totalWorkingHour <= 100 && totalWorkingDay <= 20) {
				int empCheck = (int) Math.floor((Math.random() * 10) % 3);

				if (empCheck == 2) {
					wagePerDay = (wagePerHour * fullDayHour);
					totalWage = totalWage + wagePerDay;
					totalWorkingHour = totalWorkingHour + fullDayHour;
					totalWorkingDay++;
				}

				else if (empCheck == 1) {

					wagePerDay = (wagePerHour * partTimeHour);
					totalWage = totalWage + wagePerDay;
					totalWorkingHour = totalWorkingHour + partTimeHour;
					totalWorkingDay++;
				} else {
					wagePerDay = 0;
					totalWage = totalWage + wagePerDay;
				}

			} else
				break;
		}

		System.out.println("Total working hour = " + totalWorkingHour);
		System.out.println("Toatl working day = " + totalWorkingDay);
		System.out.println("Total wage of the month = " + totalWage);
	}

}
