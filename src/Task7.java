import java.util.Random;

public class Task7 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(9) + 1;
		System.out.print("Размер квадратной матрицы = " + n +"*" + n + "\n");
		int[][] mas1 = new int[n][n];
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
		System.out.print("Диагональ матрицы: ");
		int temp = 0;
		for (int i = 0; i < mas1.length; i++) {
			System.out.printf("[%4d]", mas1[i][temp]);
			temp++;	
			
		}
	}
}