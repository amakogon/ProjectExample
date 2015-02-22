package day4;

import helper.ArrayHelper;

public class TestString {
	public static void main(String[] args) {
		String s = "somes";
		System.out.println(s);
		System.out.println(s.charAt(2));

		int[] arr = { 1, 2, 1, 2, 1 };

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				counter++;
			}
		}
		System.out.println(counter);
		
		
		arr[0] = 3;
		System.out.println("Count of 1 = " + counter);
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != 's'){
				s1 = s1 + s.charAt(i);
			}
		}
		System.out.println(s1);
		
		
	}
}
