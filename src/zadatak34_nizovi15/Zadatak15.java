package zadatak34_nizovi15;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);

		System.out.print("Unesi duzinu niza: ");
		int n = u.nextInt();
		double[] bodovi = new double[n];
		for (int i = 0; i < n; i++) {
			bodovi[i] = u.nextDouble();
		}

		double zbir = 0;
		double min = bodovi[0];
		int indeksMin = 0;
		for (int i = 0; i < n; i++) {
			zbir += bodovi[i];
			if (bodovi[i] < min) {
				min = bodovi[i];
				indeksMin = i;
			}
		}

		System.out.println("Prosjecan broj bodova: " + zbir / n);
		System.out.println("Najmanji: " + min + " na indeksu " + indeksMin);
		u.close();
	}

}
