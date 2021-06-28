import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(30);
		System.out.print("n = " + n + "\n");
		int[] mas1 = new int[n];

		System.out.print("Все значения последовательности: ");
		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = rand.nextInt(1000);
			System.out.printf(mas1[i] + " ");
		}
		System.out.println();
		if (mas1.length == 0)
			return;
		int min = mas1[0];
		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] < min) {
				min = mas1[i];
			}
		}
		System.out.println("Наименьшее значение последовательности: " + min);
		if (mas1.length == 0)
			return;
		int max = mas1[0];
		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] > max) {
				max = mas1[i];
				}
		}
		System.out.print("Наибольшее значение последовательности: " + max);
		int segmentLength = max - min;
		System.out.println();
		System.out.println("Длинна оси: " + segmentLength);
	}
}