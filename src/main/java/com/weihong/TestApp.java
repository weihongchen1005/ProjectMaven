package com.weihong;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice i1 = new Invoice();
		i1.setDescription("D1");
		i1.setNumber("Number");
		i1.setQuantity(8);
		i1.setPrice(4.0);

		double amount = i1.getInvoiceAmount();

		System.out.print("and the invoice amount is " + amount);
	}

}
