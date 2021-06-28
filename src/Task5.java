import java.util.Random;
import java.util.Arrays;

public class Task5 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(30);
		System.out.print("Количество значений в последовательности = " + n + "\n");
		int[] mas1 = new int[n];

		System.out.print("Все значения последовательности: ");
		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = (rand.nextInt(1000) - 555);
			System.out.printf(mas1[i] + " ");
		}
		Arrays.sort(mas1);
		System.out.printf("\nФорматированные значения последовательности: ");
		for (int i = 0; i < mas1.length; i++) {
			System.out.printf(mas1[i] + " ");
		}
	}
}