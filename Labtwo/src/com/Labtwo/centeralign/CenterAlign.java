package com.Labtwo.centeralign;

import java.util.Scanner;

public class CenterAlign {
	public static final String message = "Enter a number";
	public  void CenterAlign(String k) {
		int n = Integer.parseInt(k);
		int a, b,c,f;
		for(a = 0; a < n; a++) {
			for(f = 0; f <(n-a); f++) {
				System.out.print(" ");
			}
			for( b=0; b <=a; b++) {
				System.out.print("* ");
			}for(c = 0; c <(n-a); c++) {
				System.out.print("_");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) throws IllegalAccessException {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		if(k.matches("^[0-9]+")) {
			new CenterAlign().CenterAlign(k);
		}else {
			throw new IllegalAccessException("Invalid input");
		}

	}

}
