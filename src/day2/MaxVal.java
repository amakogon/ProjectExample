package day2;

public class MaxVal {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 1;
		int max = 0;
		if (a >= b && a >= c) {
			max = a;
		} else if (b >= a && b >= c) {
			max = b;
		} else {
			max = c;
		}
		System.out.println("Max = " + max);

	}
}
