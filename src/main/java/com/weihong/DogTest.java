package com.weihong;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.setName("Puggy");
		dog.setAge(5);
		dog.setWeight(12.0);

		System.out.println(dog);
		dog.showExcitement();
		dog.showExcitement(5);
	}

}
