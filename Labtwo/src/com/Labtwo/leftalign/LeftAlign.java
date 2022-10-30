package com.Labtwo.leftalign;

import java.util.Scanner;



public class LeftAlign {
	public static final String message = "Enter a number";
	public static void StarLeftAlign(String k) {
		int n = Integer.parseInt(k);
		int a, b;
		for(a = 0; a<n; a++) {
			for(b = 0; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws IllegalAccessException {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		if(k.matches("^[0-9]+")) {
			new LeftAlign().StarLeftAlign(k);
		}else {
			throw new IllegalAccessException("Invalid input");
		}
		

	}

}
