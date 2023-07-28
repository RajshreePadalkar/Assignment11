package com.gurukul.assignment11;

import java.util.Scanner;

public class Quest3Permut {

    public static void permutations(char ar[], int t) {
	if (t == ar.length - 1) {

	    System.out.println(ar);
	    return;
	}

	for (int i = t; i < ar.length; i++) {
	    swap(ar, i, t);
	    permutations(ar, t + 1);
	    swap(ar, i, t);
	}
    }

    private static void swap(char[] ar, int i, int t) {
	char temp = ar[i];
	ar[i] = ar[t];
	ar[t] = temp;
    }

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence:");
	String s = sc.nextLine();
	char ch[] = s.toCharArray();
	permutations(ch, 0);
    }
}
