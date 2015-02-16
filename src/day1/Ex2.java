package day1;

public class Ex2 {

	public static void main(String[] args) {
		int a = 4+5;
		int b = a / 2;
		System.out.println(a);
		System.out.println(b);
		boolean bool1 = a > b;
		System.out.println("abracadabra ? " + bool1);
		
		int c = (int) 7.2;
		System.out.println(c);
		
		boolean b2 = false;
		boolean b3 = bool1 && b2;
		System.out.println(b3);
		int x = 7;
		boolean qwe = 10 > x && 5 < x;
		System.out.println(qwe);
		int y = 16;
		boolean qwe1 = 10 > y || y % 2 == 0;
		System.out.println(qwe1);
		
		
	}

}
