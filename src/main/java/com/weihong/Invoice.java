package com.weihong;
//import lombok.AllArgsConstructor;

//import lombok.Data;
//import lombok.NoArgsConstructor;
//
////POJO => Plain Old Java Object
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
////POJO => Plain Old Java Object

public class Invoice {
	String number;
	String description;
	int quantity;
	double price;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getInvoiceAmount() {
		double amount;
		if (quantity < 0) {
			this.quantity = 0;
		}
		if (price < 0) {
			this.price = 0.0;
		}
		amount = price * quantity;

		return amount;
	}

}
