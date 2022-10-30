package com.Labtwo.binarytodecimal;

import java.util.Scanner;

public class BinaryToDecimal {
	public static final String message = "Enter a binary value:";
	public int getDecimal(String value) {
		int binary = Integer.parseInt(value);
		int decimal = 0;
		int n = 0;
		while(true) {
			if(binary==0) {
				break;
			}else {
				int temp = binary%10;
				decimal += temp*Math.pow(2,n);
				binary = binary/10;
				n++;
				
			}
	}
	return decimal;
	}
	public static void main(String[] args) throws java.lang.IllegalAccessException {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		String value = sc.nextLine();
		if(value.matches("^[01]+$")) {
			System.out.println(new BinaryToDecimal().getDecimal(value));
			
		}else {
			throw new IllegalAccessException("Illegal-input"+123);
			
		}
	}

}
