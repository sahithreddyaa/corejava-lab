package com.Labtwo.stringreverse;

import java.util.Scanner;

public class StringReverse {
	public static final String message = "Enter a string";
	public void stringReverse(String s) {
		for(int i = s.length(); i>0; i--) {
			System.out.print(s.charAt(i-1));
			
		}
		
	}
	public static void main(String[] args) throws IllegalAccessException {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		String s = sc.nextLine();
		if(s.matches("^[a-zA-Z]+")) {
			new StringReverse().stringReverse(s);
			sc.close();
		}else {
			throw new IllegalAccessException("Invalid input");
		}

	}

}
