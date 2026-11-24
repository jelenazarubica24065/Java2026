package vjezbe5;

import java.util.ArrayList;
import java.util.Scanner;

public class TestnaKlasa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Osnovica za registraciju: ");
		Vozilo.setOsnovicaZaRegistraciju(sc.nextFloat());

		ArrayList<Vozilo> vozniPark = new ArrayList<>();
		System.out.print("Koliko vozila ima preduzece: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Tip (A-automobil, M-motocikl, K-kamion): ");
			String tip = sc.next();
			System.out.print("Marka model kubikaza godiste: ");
			String marka = sc.next();
			String model = sc.next();
			int kubikaza = sc.nextInt();
			int godiste = sc.nextInt();

			if (tip.equalsIgnoreCase("A")) {
				System.out.print("Broj vrata i broj osoba: ");
				int vrata = sc.nextInt();
				int osobe = sc.nextInt();
				vozniPark.add(new Automobil(marka, model, kubikaza, godiste, vrata, osobe));
			} else if (tip.equalsIgnoreCase("M")) {
				System.out.print("Kilometraza: ");
				vozniPark.add(new Motocikl(marka, model, kubikaza, godiste, sc.nextInt()));
			} else {
				System.out.print("Nosivost (t): ");
				vozniPark.add(new Kamion(marka, model, kubikaza, godiste, sc.nextInt()));
			}
		}

		float ukupno = 0;
		for (Vozilo v : vozniPark) {
			System.out.println(v + " -> " + v.cijenaRegistracije());
			ukupno += v.cijenaRegistracije();
		}
		System.out.println("Ukupno za registraciju: " + ukupno + " EUR");
		sc.close();
	}

}
