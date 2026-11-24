package vjezbe2_dodatni;

import java.util.Scanner;

public class Potrosnja {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int N = u.nextInt();
		double ukupno = 0, preko500 = 0;
		for (int i = 0; i < N; i++) {
			double kwh = u.nextDouble();
			ukupno += kwh;
			if (kwh > 500) preko500 += kwh;
		}
		System.out.printf("Ukupno: %.1f kWh, od toga preko 500: %.1f kWh%n", ukupno, preko500);
		u.close();
	}

}
