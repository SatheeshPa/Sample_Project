package com.test;

public class Balindrome {
	public static boolean checkPalindrome(String str) {		
		int i = 0;
		int j = str.length()-1;
		boolean check = true;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				check = false;
			}
			i++;
			j--;
		}
		return check;
	}

	public static void main(String[] args) {
		
		String str = "testtest";
		System.out.println("Test");
		System.out.println(checkPalindrome(str)?"This is polindrome": "This is not a polindrome");
		System.out.println("Test");
		

	}

}
