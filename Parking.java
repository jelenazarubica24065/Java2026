package vjezbe2_dodatni;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int N = u.nextInt();
		int zarada = 0;
		for (int i = 0; i < N; i++) {
			int sati = u.nextInt();
			if (sati <= 5) {
				zarada += sati * 2;
			} else {
				zarada += 5 * 2 + (sati - 5) * 1;
			}
		}
		System.out.println("Ukupna zarada: " + zarada + " EUR");
		u.close();
	}

}
