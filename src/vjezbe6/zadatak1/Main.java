package vjezbe6.zadatak1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void prikaziSve(ArrayList<Proizvod> lista) {
		for (Proizvod p : lista) {
			System.out.println(p);
		}
	}

	public static void prikaziCijene(ArrayList<Proizvod> lista) {
		for (Proizvod p : lista) {
			System.out.printf("%.2f%n", p.maloprodajnaCijena());
		}
	}

	public static double prosjek(ArrayList<Proizvod> lista, String grupa) {
		double zbir = 0;
		int broj = 0;
		for (Proizvod p : lista) {
			boolean uGrupi = false;
			if (grupa.equals("Garderoba") && p instanceof Garderoba) uGrupi = true;
			if (grupa.equals("Hemija") && p instanceof HemijskiProizvod) uGrupi = true;
			if (grupa.equals("Hrana") && p instanceof Hrana) uGrupi = true;
			if (uGrupi) {
				zbir += p.maloprodajnaCijena();
				broj++;
			}
		}
		if (broj == 0) return 0;
		return zbir / broj;
	}

	public static void main(String[] args) {
		ArrayList<Proizvod> lista = new ArrayList<Proizvod>();
		lista.add(new Garderoba("Majica", "111", "Turska", 2025, 100, "pamuk", Sezona.LJETO));
		lista.add(new Garderoba("Jakna", "112", "Italija", 2025, 200, "vuna", Sezona.ZIMA));
		lista.add(new HemijskiProizvod("Razrjedjivac", "221", "Njemacka", 2024, 50, 15, true));
		lista.add(new HemijskiProizvod("Sapun", "222", "Srbija", 2024, 40, 20, false));
		lista.add(new Hrana("Jogurt", "331", "Srbija", 2026, 10, 120, LocalDate.now().plusMonths(2)));
		lista.add(new Hrana("Testenina", "332", "Italija", 2026, 20, 350, LocalDate.now().plusYears(2)));

		System.out.println("--- Svi proizvodi ---");
		prikaziSve(lista);
		System.out.println("--- Maloprodajne cijene ---");
		prikaziCijene(lista);
		System.out.printf("Prosjek Garderoba: %.2f%n", prosjek(lista, "Garderoba"));
		System.out.printf("Prosjek Hemija: %.2f%n", prosjek(lista, "Hemija"));
		System.out.printf("Prosjek Hrana: %.2f%n", prosjek(lista, "Hrana"));
	}
}
