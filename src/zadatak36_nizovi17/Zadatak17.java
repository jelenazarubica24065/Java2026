package zadatak36_nizovi17;

import java.util.Scanner;

public class Zadatak17 {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);

		System.out.print("Unesi duzinu niza: ");
		int n = u.nextInt();
		int[] niz = new int[n];
		for (int i = 0; i < n; i++) {
			niz[i] = u.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (niz[j] > niz[j + 1]) {
					int pom = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = pom;
				}
			}
		}
		System.out.print("Sortiran niz: ");
		for (int i = 0; i < n; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();

		System.out.print("Unesi broj za trazenje: ");
		int trazeni = u.nextInt();
		boolean postoji = false;
		for (int i = 0; i < n; i++) {
			if (niz[i] == trazeni) {
				postoji = true;
			}
		}
		if (postoji) {
			System.out.println("Broj " + trazeni + " postoji u nizu.");
		} else {
			System.out.println("Broj " + trazeni + " ne postoji u nizu.");
		}
		u.close();
	}

}
