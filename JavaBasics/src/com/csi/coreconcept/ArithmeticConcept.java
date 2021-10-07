/**
 * 
 */
package com.csi.coreconcept;

/**
 * @author Kiran khot
 *
 */
public class ArithmeticConcept {
	public static void main(String[] args) {

		ArithmeticConcept ac = new ArithmeticConcept();
		System.out.println("Addition Value is: " + ac.add(20, 10));
		System.out.println("Substraction Value is: " + ac.sub(40, 25));
		System.out.println("Multiplication Value is: " + ac.mul(45, 75));
		System.out.println("Division Value is: " + ac.div(56, 5));

		// Adding method for Addition Logic //Single Line Comment

		/*
		 * this logic we are going to reuse whenever we require logic in
		 * different forms of data
		 */
		// Multiline Comment

	}

	int add(int n1, int n2) {
		return n1 + n2;
	}

	static double sub(int n1, int n2) {
		return n1 - n2;
	}

	float mul(float n1, float n2) {
		return n1 * n2;
	}

	double div(double n1, double n2) {
		return n1 / n2;
	}

}
