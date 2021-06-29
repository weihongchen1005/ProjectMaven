package com.weihong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//POJO => Plain Old Java Object
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

		private String fName;
		private String LName;
		private double salary;
		
		public void setSalary(double salary) {
			if(salary >= 0) {
				this.salary = salary;
			}
		}
}
