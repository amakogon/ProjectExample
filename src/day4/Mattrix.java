package day4;

public class Mattrix {
	public static void main(String[] args) {
		int test = 6;
		int[][] mat = new int[3][3];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = (int) (Math.random() * 10);
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
