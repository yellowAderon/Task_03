import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(30);
		System.out.print("Количество значений в последовательности = " + n + "\n");
		int[] mas1 = new int[n];

		System.out.print("Все значения последовательности: ");
		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = (rand.nextInt(1000)-555);
			System.out.printf(mas1[i] + " ");
		}
		int max,temp;
		for (int i = 0; i < mas1.length - 1; i++) {
			max = i;
			for (int j = i + 1; j < mas1.length; j++) {
				if (mas1[j] > mas1[max]) {
					max = j;
				}
			}
		temp = mas1[i];
		mas1[i] = mas1[max];
		mas1[max] = temp;
		}
		System.out.printf("\nЗначения последовательности по убыванию: ");
		for (int i = 0; i< mas1.length; i++) {
		System.out.print(" " + mas1[i]);
		}
	}
}
