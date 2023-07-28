package com.gurukul.assignment11;

import java.util.Scanner;

public class Q2CountNumberDigit {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n = sc.nextInt();
	int ans = CountDigit(n);
	System.out.println("Number of digit :" + ans);
    }

    private static int CountDigit(int n) {
	// TODO Auto-generated method stub
	if (n % 10 == 0)
	    return 0;
	else {
	    return 1 + CountDigit(n / 10);

	}

    }
}