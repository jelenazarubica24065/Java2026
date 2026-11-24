package zadatak1_kompleksni;

import java.util.Scanner;

public class KompleksniBrojTest {

	public static void main(String[] args) {
		float a, b;
		Scanner u = new Scanner(System.in);

		System.out.println("Unesi realni i imaginarni dio prvog kompleksnog broja: ");
		a = u.nextFloat();
		b = u.nextFloat();

		KompleksniBroj prviBroj = new KompleksniBroj(a, b);
		KompleksniBroj drugiBroj = new KompleksniBroj();

		System.out.println("Unesi realni i imaginarni dio drugog kompleksnog broja: ");
		drugiBroj.postaviRealniDio(u.nextFloat());
		drugiBroj.postaviImaginarniDio(u.nextFloat());

		KompleksniBroj rezultat;

		rezultat = prviBroj.saberi(drugiBroj);
		System.out.println("Rezultat sabiranja: " + rezultat.dajBroj());

		rezultat = prviBroj.oduzmi(drugiBroj);
		System.out.println("Rezultat oduzimanja: " + rezultat.dajBroj());

		rezultat = prviBroj.pomnozi(drugiBroj);
		System.out.println("Rezultat mnozenja: " + rezultat.dajBroj());

		rezultat = prviBroj.podijeli(drugiBroj);
		System.out.println("Rezultat dijeljenja: " + rezultat.dajBroj());

		System.out.printf("Modul broja %s je: %f%n", prviBroj.dajBroj(), prviBroj.modulBroja());

		System.out.print("Unesi broj elemenata niza: ");
		int N = u.nextInt();
		KompleksniBroj[] niz = new KompleksniBroj[N];
		for (int i = 0; i < N; i++) {
			System.out.printf("%nUnesi %d. element niza: ", i + 1);
			niz[i] = new KompleksniBroj(u.nextFloat(), u.nextFloat());
		}

		KompleksniBroj maks = niz[0];
		for (int i = 1; i < N; i++) {
			if (maks.modulBroja() < niz[i].modulBroja()) {
				maks = niz[i];
			}
		}
		System.out.println();
		System.out.println("Maksimum niza je: " + maks.dajBroj());
		u.close();
	}

}
