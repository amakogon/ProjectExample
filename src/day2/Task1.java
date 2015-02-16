package day2;

import helper.ArrayHelper;

public class Task1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		
		ArrayHelper.printArray(arr);
	}
}
