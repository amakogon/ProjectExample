package day2;

import helper.ArrayHelper;

public class ForEx {

	public static void main(String[] args) {
		int[] mas = new int[5];
		mas[0] = 5;
		for (int i = 0; i < mas.length; i = i + 1) {
			System.out.print(mas[i] + " ");
		}
		
		System.out.println();
		int[] arr = { 1, 2, 3, 4 };
		ArrayHelper.printArray(arr);
	}

}
