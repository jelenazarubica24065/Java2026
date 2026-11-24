package vjezbe2_dodatni;

import java.util.Scanner;

public class Dron {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		double x = u.nextDouble(), y = u.nextDouble();
		int N = u.nextInt();
		double ukupno = 0;
		for (int i = 0; i < N; i++) {
			double xi = u.nextDouble(), yi = u.nextDouble();
			if (xi > 0 && yi > 0) {
				ukupno += Math.sqrt((xi - x) * (xi - x) + (yi - y) * (yi - y));
			}
		}
		System.out.printf("Ukupna udaljenost: %.2f%n", ukupno);
		u.close();
	}

}
