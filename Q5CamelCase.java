package com.gurukul.assignment11;

import java.util.Scanner;

public class Q5CamelCase {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String str = sc.nextLine();
	int ans = CamelCase(str, str.length() - 1);
	System.out.println("occurance :" + ans);
    }

    private static int CamelCase(String str, int l) {
	// TODO Auto-generated method stub
	if (l == 0)
	    return 1;
	else {
	    if ((Character.isUpperCase(str.charAt(l))))
		return 1 + CamelCase(str, l - 1);
	}
	return CamelCase(str, l - 1);
    }

}
