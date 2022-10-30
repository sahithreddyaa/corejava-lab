package com.Labtwo.decimaltobinary;

import java.util.Scanner;



public class DecimalToBinary {
	public static final String message = "Enter a number";
	public void decToBinary(String k) {
		int n = Integer.parseInt(k);
		int[] binaryNum = new int[1000];
		int i = 0;
		while(n>0) {
			binaryNum[i] = n%2;
			n = n/2;
			i++;
		}
		for(int j = i-1 ; j >=0; j--) {
			System.out.print(binaryNum[j]);
		}
	}

	public static void main(String[] args) throws IllegalAccessException {
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		if(k.matches("^[0-9]+")) {
			new DecimalToBinary().decToBinary(k);
		}else {
			throw new IllegalAccessException("Invalid input");
		}

	}

}
