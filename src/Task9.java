import java.util.Random;

public class Task9 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		if (n % 2 != 0) {
			System.out.println("Рандом выдал нечетное число. Повторите запуск.");
			return;
		}
		System.out.print("Размер квадратной матрицы = " + n + "*" + n + "\n");
		int[][] mas1 = new int[n][n];
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas1[i][j] = 0;
			}
		}

		int temp = mas1.length - 1;
		for (int i = 0; i < mas1.length; i++) {

			mas1[temp][i] = n;
			temp--;
			n--;
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.printf("[%4d]", mas1[i][j]);
			}
			System.out.println();
		}
	}
}
