package com.sofkau.functionalcalculator.FunctionalCalculator;

import com.sofkau.functionalcalculator.FunctionalCalculator.interfaces.MultiplicationInterface;
import com.sofkau.functionalcalculator.FunctionalCalculator.interfaces.SubtractionInterface;
import com.sofkau.functionalcalculator.FunctionalCalculator.interfaces.SumInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class FunctionalCalculatorApplication {

	static SumInterface isum = (n1, n2) -> n1 + n2;

	static SubtractionInterface isubstract = (n1, n2) -> n1 - n2;
	static MultiplicationInterface imultiplication=(n1, n2) -> n1 - n2;

	public static void main(String[] args) {
		//sum
		System.out.println("Sum of two numbers: "+isum.sum(3,5));

		//substraction
		System.out.println("Substraction of two numbers: "+isubstract.subtraction(10,5));

		//multiplication

		//division
	}

}
