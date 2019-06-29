package com.louis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class App {
public double calculateProductResult(double[] myNumericInput) {
	if (myNumericInput.length<3) {
		System.out.println("Please enter an array with at least three numbers");
		break;
	}
	Arrays.sort(myNumericInput);
	List<Double> doubleList = Arrays.stream(myNumericInput).collect(Collectors.toList());
	Arrays.asList(myNumericInput);
	DoubleStream doubleStream = Arrays.stream(myNumericInput);
	
	return doubleStream.sorted().range(myNumericInput.length-3,myNumericInput.length)
	
}
public static void main (String[] args) {
	int[] a = {1, 2, 3};
	double t = calculateProductResult(a);
}
}
