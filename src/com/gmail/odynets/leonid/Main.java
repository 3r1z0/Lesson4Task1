package com.gmail.odynets.leonid;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= number; j++) {
				if (j % 2 != 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}

	}

}
