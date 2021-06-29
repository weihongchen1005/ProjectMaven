package com.weihong;

import java.util.Scanner;

public class Primitives {

	public static void main(String[] args) {

		// exercise 3
		String car = "Car 1";
		String house = "House 1";
		String shoe = "Shoe 1";

		System.out.println("Car Name: " + car + " House Name: " + house + " Shoe Name: " + shoe);

		// exercise 4
		int x, y, z;
		x = 2;
		y = 5;
		z = 0;

		if (x == 2) {
			System.out.println("x: " + x);
		}
		if (x != 5) {
			System.out.println("x: " + x);
		}
		if (x != 5 && y >= 5) {
			System.out.println("x: " + x + " y: " + y);
		}
		if (z != 0 || x == 2) {
			System.out.println("x: " + x + " z: " + z);
		}
		if (!(y < 10)) {
			System.out.println("y: " + y);
		} else {
			System.out.println("none of these condition matched");
		}

		// exercise 5 & 6

		int count = 10;
		int sum = 0;
		for (int i = 1; i <= count; i++) {
			sum += i;
			System.out.println(i);
			System.out.println("sum is " + sum);
		}

		int age = 10;
		while (age <= 21) {
			if (age == 16) {
				System.out.println("Get your driver's license");
			} else {
				System.out.println("Another Year.");
			}
			age++;
		}

		// exercise 8
		char alphabet = 'b';
		switch (alphabet) {
		case 'a':
			System.out.println("This is character 'a' ");
			break;
		case 'b':
			System.out.println("This is character 'b' ");
			break;
		case 'c':
			System.out.println("This is character 'c' ");
			break;
		// Default case statement
		default:
			System.out.println("None of the alphabet is a, b, or c ");
		}
		
		Scanner sc = new Scanner(System.in);        
		System.out.println("Enter a Number!");
		int question = sc.nextInt(); 
		System.out.println("Your number is " + question);
		int total = question;
		while (question != -1) {
		    System.out.println("Enter a Number or enter -1 to stop");
		    question = sc.nextInt(); 
		    System.out.println("Your number is " + question);
		    if(question != -1) {
		    	total += question;
		    }
		}
		System.out.println("Total is " + total);
	}
}
