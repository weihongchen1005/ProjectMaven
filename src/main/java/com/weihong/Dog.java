package com.weihong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//POJO => Plain Old Java Object
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
	String name;
	int age;
	double weight;

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	public void showExcitement() {
		System.out.println(this.name + " is wagging its tail!!!");
	}

	public void showExcitement(int levelOfExcitement) {
		String displayExcitement = this.name + " is wagging its tail";
		while (levelOfExcitement > 0) {
			displayExcitement += '!';
			levelOfExcitement--;
		}
		System.out.println(displayExcitement);
	}

	public void eating() {
		System.out.println("Eating");
	}

	public void eating(String food) {
		System.out.println("Eating " + food);
	}
}
