package com.weihong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//POJO => Plain Old Java Object
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Date {
	int month;
	int day;
	int year;

	public String toString() {
		return (month + "/" + day + "/" + year);
	}
}
