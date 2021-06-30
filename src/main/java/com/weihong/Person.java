package com.weihong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//POJO => Plain Old Java Object
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	private String name;
	private int age;
	private double shoeSize;

	private void walking() {
		System.out.println("Person [name=" + name + ", age=" + age + ", shoeSize=" + shoeSize + "]");
	}

	public void startWalking() {
		walking();
	}
}
