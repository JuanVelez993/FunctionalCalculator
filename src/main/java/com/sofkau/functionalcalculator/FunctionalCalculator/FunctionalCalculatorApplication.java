package com.sofkau.functionalcalculator.FunctionalCalculator;

import com.sofkau.functionalcalculator.FunctionalCalculator.interfaces.MultiplicationInterface;
import com.sofkau.functionalcalculator.FunctionalCalculator.interfaces.SubtractionInterface;
import com.sofkau.functionalcalculator.FunctionalCalculator.interfaces.SumInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;


public class FunctionalCalculatorApplication {

	static SumInterface isum = (n1, n2) -> n1 + n2;

	static SubtractionInterface isubstract = (n1, n2) -> n1 - n2;
	static MultiplicationInterface imultiplication=(n1, n2) -> IntStream.range(0,n2+1).reduce((acum,ite)->isum.sum(acum,n1)).getAsInt();

	public static void main(String[] args) {
		//sum
		System.out.println("Sum of two numbers: "+isum.sum(3,5));

		//substraction
		System.out.println("Substraction of two numbers: "+isubstract.subtraction(10,5));

		//multiplication
		System.out.println("Multiplication of two numbers: "+imultiplication.multiplication(3,4));

		//division
	}

}
