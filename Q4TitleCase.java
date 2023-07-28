package com.gurukul.assignment11;

import java.util.Scanner;

public class Q4TitleCase {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	String str = sc.nextLine();
	String s[] = str.split(" ");
	String rs = "";
	String ans = TitleCase(s, s.length - 1, rs);
	System.out.println(ans);
    }

    private static String TitleCase(String[] s, int length, String ans) {
	// TODO Auto-generated method stub
	if (length < 0)
	    return ans;
	else {
	    ans = Character.toUpperCase(s[length].charAt(0)) + s[length].substring(1) + " " + ans;
	    ans = TitleCase(s, length - 1, ans);
	    return ans;
	}
    }

}
