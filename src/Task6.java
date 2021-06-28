import java.util.Random;

public class Task6 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(9) + 1, m = rand.nextInt(9) + 1;
		System.out.print("Количество строк в массиве = " + n + "\n");
		System.out.println("Количество столбцов в массиве = " + m + "\n");
		int[][] mas1 = new int[n][m];
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas1[i][j] = rand.nextInt(10);
			}
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.printf("[%4d]", mas1[i][j]);
			}
			System.out.println();
		}
		int counte = 0;
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				if (mas1[i][j] == 7) {
					counte++;
				}
			}
		}
		System.out.println("Количество семерок в массиве: " + counte);
	}
}
