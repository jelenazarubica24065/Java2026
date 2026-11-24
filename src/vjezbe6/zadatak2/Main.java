package vjezbe6.zadatak2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<EProizvodi> uredjaji = new ArrayList<EProizvodi>();
		int izbor;

		do {
			System.out.println();
			System.out.println("1. Unos uredjaja");
			System.out.println("2. Pregled svih uredjaja sa maloprodajnom cijenom");
			System.out.println("3. Pregled uredjaja odredjenog tipa");
			System.out.println("0. Izlaz");
			System.out.print("Izbor: ");
			izbor = Integer.parseInt(sc.nextLine().trim());

			if (izbor == 1) {
				System.out.print("Opis: ");
				String opis = sc.nextLine();
				System.out.print("Sifra (npr. RA001, TE001, TV001): ");
				String sifra = sc.nextLine().trim();
				System.out.print("Uvozna cijena: ");
				double cijena = Double.parseDouble(sc.nextLine().trim());

				String tip = sifra.substring(0, 2).toUpperCase();
				if (tip.equals("RA")) {
					System.out.print("Procesor: ");
					String procesor = sc.nextLine();
					System.out.print("Memorija (GB): ");
					int memorija = Integer.parseInt(sc.nextLine().trim());
					uredjaji.add(new Racunar(opis, sifra, cijena, procesor, memorija));
				} else if (tip.equals("TE")) {
					System.out.print("Operativni sistem: ");
					String os = sc.nextLine();
					System.out.print("Velicina ekrana: ");
					double ekran = Double.parseDouble(sc.nextLine().trim());
					uredjaji.add(new Telefon(opis, sifra, cijena, os, ekran));
				} else if (tip.equals("TV")) {
					System.out.print("Velicina ekrana: ");
					double ekran = Double.parseDouble(sc.nextLine().trim());
					uredjaji.add(new TV(opis, sifra, cijena, ekran));
				} else {
					System.out.println("Nepoznat tip sifre!");
				}
			} else if (izbor == 2) {
				if (uredjaji.isEmpty()) {
					System.out.println("Nema uredjaja.");
				}
				for (EProizvodi p : uredjaji) {
					System.out.println(p);
				}
			} else if (izbor == 3) {
				System.out.print("Tip (RA, TE ili TV): ");
				String tip = sc.nextLine().trim();
				EProizvodi[] niz = uredjaji.toArray(new EProizvodi[0]);
				Metode.stampajTip(niz, tip);
			}
		} while (izbor != 0);

		System.out.println("Kraj programa.");
		sc.close();
	}
}
