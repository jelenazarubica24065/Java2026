package zadatak2_staticki_kompleksni;

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

		rezultat = KompleksniBroj.sabiranje(prviBroj, drugiBroj);
		System.out.println("Rezultat sabiranja: " + rezultat.dajBroj());

		rezultat = KompleksniBroj.oduzimanje(prviBroj, drugiBroj);
		System.out.println("Rezultat oduzimanja: " + rezultat.dajBroj());

		rezultat = KompleksniBroj.mnozenje(prviBroj, drugiBroj);
		System.out.println("Rezultat mnozenja: " + rezultat.dajBroj());

		System.out.printf("Modul broja %s je: %f%n", prviBroj.dajBroj(), KompleksniBroj.modulBroja(prviBroj));
		u.close();
	}

}
