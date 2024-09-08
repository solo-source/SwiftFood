package com.infy;

public class Customer {
	// Attributes(Characteristics) of the class(module) are the element or variable
	// which hold the value or state of a particular entity.

	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;

	public void displayCustomerDetails() {
		System.out.println("Displaying Customer details \n ***************");
		System.out.println("Customer Name : " + customerName);
		System.out.println("Customer Id: " + customerId);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
}
