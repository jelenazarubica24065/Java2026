package zadatak20_nizovi1;

import java.util.Scanner;

public class Zadatak1 {

	static int brojPozitivnih(int[] niz) {
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > 0) {
				brojac++;
			}
		}
		return brojac;
	}

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);

		System.out.print("Unesi duzinu niza: ");
		int n = u.nextInt();

		int[] niz = new int[n];
		System.out.println("Unesi elemente:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = u.nextInt();
		}

		int brojac = brojPozitivnih(niz);
		System.out.println("Pozitivnih brojeva ima: " + brojac);
		u.close();
	}

}
