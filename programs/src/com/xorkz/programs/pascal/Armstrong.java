package com.xorkz.programs.pascal;

import java.util.Scanner;

//Armstrong number = number that is equals to sum of cubes of digits
public class Armstrong {//153,370,371,407
	public static void main(String[] args) {
		int sum = 0, a, temp,number=153;
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the number: ");
//		int number = sc.nextInt();
		temp = number;

		while (number > 0) {
			a = number % 10;// remainder
			sum = sum + (a * a * a);
			number = number / 10;//quotient
		}

		if (temp == sum) {
			System.out.println("The given number is armstrong");
		} else {
			System.out.println("The given number is not armstrong");
		}

	}

}
