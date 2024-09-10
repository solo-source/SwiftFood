package com.infy;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object creation
		Customer objCustomer = new Customer();
		Food objFood = new Food();
		
		//assigning values to the instance variables 
		objCustomer.customerId = "C5617";
		objCustomer.customerName = "Jhon Smith";
		objCustomer.contactNumber = 7656764321L;
		objCustomer.address = "D089, St. Louise Street, Springfield, 62729";
		
		objFood.foodName = "Ramen";
		objFood.cuisine = "Asian";
		objFood.foodType = "NonVeg";
		objFood.quantityAvailable = 10;
		objFood.unitPrice = 495.00;
		
		objCustomer.displayCustomerDetails();
		objFood.displayFoodDetails();
	}

}
