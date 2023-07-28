package com.gurukul.assignment11;

import java.util.Scanner;

public class Que1RecursionSumElement {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter the values :");
	for (int i = 0; i < n; i++)
	    arr[i] = sc.nextInt();
	int sum = SumOfElement(arr, n);
	System.out.println("Sum of ELements :" + sum);
    }

    private static int SumOfElement(int[] arr, int n) {
	// TODO Auto-generated method stub
	if (n <= 0)
	    return 0;
	else {
	    int sum = arr[n - 1] + SumOfElement(arr, n - 1);
	    return sum;
	}
    }

}
