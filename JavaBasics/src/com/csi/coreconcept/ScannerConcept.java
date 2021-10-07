package com.csi.coreconcept;

import java.util.Scanner;

public class ScannerConcept {
	public static void main(String[] args) {

		System.out.println("\n Please Enter 2 number to perform Addition: ");

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = n1 + n2;
		System.out.println("\n Addition Result: " + result);

	}
}
