package com.greatlearning.driver;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTrans, target;

		// User Inputs
		System.out.println("Enter the number of transactions in an array:");
		noOfTrans = sc.nextInt();

		int[] transArray = new int[noOfTrans];

		System.out.println("Enter the transactions:");
		for (int i = 0; i < noOfTrans; i++) {
			transArray[i] = sc.nextInt();
		}

		System.out.println("What is the target needed to be achieved?");
		target = sc.nextInt();

		// Core logic to check target
		int checkVar = 0;
		int idx = 1;
		boolean checkCond = false;

		for (int i = 0; i < noOfTrans; i++) {
			checkVar += transArray[i];
			idx += i;
			if (checkVar >= target) {
				checkCond = true;
				System.out.println("Target is achieved after " + idx + " transactions");
				break;
			}

		}

		if (checkCond == false)
			System.out.println("Target is not achieved");

	}

}
