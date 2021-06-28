import java.util.Random;

public class Task1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(30);
		System.out.print("n = " + n + "\n");
		int[] mas1 = new int[n];
		int j = 0;
		System.out.print("Все значения последовательности: ");
		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = rand.nextInt(1000);
			System.out.printf(mas1[i] + " ");
		}
		System.out.printf("\nЧетные значения последовательности: ");
		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] % 2 == 0) {
				System.out.printf(mas1[i] + " ");
				j++;
			}
		}
		if (j == 0) {
			System.out.println("В последовательности нет четных чисел");
		}

	}
}