import java.util.Random;

public class Task8 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(7) + 1, k = rand.nextInt(7) + 1, p = rand.nextInt(7) + 1;
		System.out.print("������ ���������� ������� = " + n + "*" + n + "\n" + "k = " + k + " p = " + p + "\n");
		int[][] mas1 = new int[n][n];
		
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas1[i][j] = (rand.nextInt(10) - 5);
			}
		}
		
		for (int i = 0; i < mas1.length; i++) {
			System.out.print("������ �" + (i + 1));
			for (int j = 0; j < mas1[i].length; j++) {

				System.out.printf("[%4d]", mas1[i][j]);
			}
			System.out.println();
		}
		
		if (k >= n + 1) {
			System.out
					.print("-------------------------------------------------------\n������ �" + k + " ��� � �������");
		} else {
			System.out.print("-------------------------------------------------------\n������ �" + k);
			k--;
			for (int i = 0; i < mas1.length; i++) {
				for (int j = 0; j < mas1[k].length; j++) {

					System.out.printf("[%4d]", mas1[k][j]);

				}
				break;
			}
		}
		
		if (p >= n + 1) {
			System.out.print(
					"\n-------------------------------------------------------\n������� �" + p + " ��� � �������");
		} else {
			System.out.print("\n-------------------------------------------------------\nC������ �" + p);
			p--;
			for (int i = 0; i < mas1.length; i++) {
				for (int j = 0; j < mas1[i].length; j++) {
					System.out.printf("[%4d]", mas1[j][p]);
				}
				break;
			}
		}

	}
}
