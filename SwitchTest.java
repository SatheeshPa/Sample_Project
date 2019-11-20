package com.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SwitchTest {
	
	public static String checkSwitch(String str) {
		String str1 = null;
		switch(str) {
		case "1":
		case "2":
			str1 = "kjsjhdf";
			break;
			default:
				if(str.isEmpty()) {
					str1 = "Please enter the values";
					break;
				}else {
					str1 = "Not available";
					break;
				}
				
		}
		
		return str1;
		
	}

	public static void main(String[] args) {
		String str = "";
		System.out.println(checkSwitch(str));
		
		
	}

}
