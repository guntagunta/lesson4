package com.lesson4;
/*
SimpleCalculator -- define an instantiable class to perform arithmetic operations
This example shows how to declare an instantiable class, and in particular:
-- how to declare instance variables/ fields
-- how to declare setter and getter methods corresponding to the instance variables
-- how to declare a method to return a value
*/
//declare instance class
public class SimpleCalculator {
	//declare instance variables
	private double firstNumber = 10;
	private double secondNumber =5;
	private double result;
	
	//declare behaviour or action of our processing method
	public void multiply(){
		result = firstNumber * secondNumber;
						
	}
	
	public void divide(){
		result = firstNumber / secondNumber;
		
	}
	
	public void display(){
		System.out.println("our first number: "+ firstNumber);
		System.out.println("our second number: "+ secondNumber);
		System.out.println();
	}
	//declare setter method-to receive a value from the user
public void setFirstNumber(double number){
	//stores number in the firstNumber of a instance variable
	firstNumber = number;
	
}
public void setSecondNumber(double number){
	//stores number in the secondNumber of a instance variable
	secondNumber = number;
}
//getter method for instance variable result which should retrieve/get the result of computing
public double getResult(){
	return result;
	
}

}
