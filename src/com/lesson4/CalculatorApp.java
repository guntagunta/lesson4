package com.lesson4;

public class CalculatorApp {

	
	public static void main(String[] args) {
		//create an object of type SimpleCalculator
		SimpleCalculator calc = new SimpleCalculator();
		// calc.diplay();
		
//declare local variables
		double n1 = 2;
		double n2 = 10;
		//store the input of values into the instance variable of objectCalc
		// we are going to use setter methid called set FirstNumber to set/assign the value  of variable n
		
		calc.setFirstNumber(n1);
		calc.setSecondNumber(n2);
		
		calc.display();
		calc.multiply();
		calc.divide();
		calc.display();
		
		double r = calc.getResult();
		System.out.println("long version: " + r);
		System.out.println("short verion: " + calc.getResult());
		
		//System.out.println(calc.result);
	}

}
