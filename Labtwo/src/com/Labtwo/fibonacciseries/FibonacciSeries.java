package com.Labtwo.fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries {
	public static final String message = "Enter a number";
	public void getFibonacci(String k) {
		int n = Integer.parseInt(k);
		int a = 0, b = 1, c = 0;
		System.out.print(a +" , "+b);
		for(int i = 2; i<n; i++) {
			c = a + b;
			System.out.print(" , " + c);
			a = b;
			b =c;
		}
	}
	public static void main(String[] args) throws IllegalAccessException {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		String k = sc.nextLine();
		if(k.matches("^[0-9]+")) {
			new FibonacciSeries().getFibonacci(k);
			sc.close();
		}else {
			throw new IllegalAccessException("Invalid input");
		}

	}

}
