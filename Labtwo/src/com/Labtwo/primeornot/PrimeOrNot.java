package com.Labtwo.primeornot;

import java.util.Scanner;



public class PrimeOrNot {
	public static final String message = "Enter a number";
	public void primeOrNot(String k) {
		int num = Integer.parseInt(k);
		int  i, count=0;
		for(i = 2 ; i< num; i++) {
			if(num%i ==0) {
				count ++;
				break;
			}
	}
		if(count == 0) {
			System.out.println(num + " is prime number");
		}else {
			System.out.println(num + " is not prime number");
		}
	}
	public static void main(String[] args) throws IllegalAccessException {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		if(value.matches("^[0-9]+")) {
			new PrimeOrNot().primeOrNot(value);
		}else {
			throw new IllegalAccessException("Invalid input");
		}
		

	}

}
