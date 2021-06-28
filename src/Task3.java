import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(30);
		System.out.print("n = " + n + "\n");
		int[] mas1 = new int[n];

		System.out.print("Все значения последовательности: ");
		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = (rand.nextInt(1000)-555);
			System.out.printf(mas1[i] + " ");
		}
		System.out.println();
		int negativeNumber = 0, positiveNumber = 0, nullNumber = 0;
		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] > 0) {
				positiveNumber++;
			}
			if (mas1[i] < 0) {
				negativeNumber++;
				}
			if (mas1[i] == 0) {
				nullNumber++;
				}
			}
		System.out.printf("Количество положительных элементов: " + positiveNumber + "\nКоличество негативных элементов: " + negativeNumber + "\nКоличество нулевых элементов: " + nullNumber);
		}
}