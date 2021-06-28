import java.util.Random;

public class Task10 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(5) + 1;
		System.out.print("Размер квадратной матрицы = " + n + "*" + n + "\n");
		int[][] mas1 = new int[n][n];
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas1[i][j] = 0;
				mas1[i][0] = 1;
				mas1[0][j] = 1;
				mas1[mas1.length - 1][j] = 1;
				mas1[i][mas1[i].length - 1] = 1;
			}
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.printf("[%4d]", mas1[i][j]);
			}
			System.out.println();
		}

	}
}
