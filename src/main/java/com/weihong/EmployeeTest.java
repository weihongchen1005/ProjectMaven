package com.weihong;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setFName("weihong");
		e1.setLName("chen");
		e1.setSalary(2000.0);

		Employee e2 = new Employee();
		e2.setFName("weibin");
		e2.setLName("chen");
		e2.setSalary(-2);

		System.out.println(e1 + "\n" + e2);

		e1.setSalary(e1.getSalary() * 1.1 * 12);
		e2.setSalary(e2.getSalary() * 1.1 * 12);
		System.out.println("Yearly Salary:" + e1 + "\n" + e2);
	}
}
