package vjezbe6.troskovi;

import java.util.ArrayList;

public class Testnaklasa {
	public static void main(String[] args) {
		ArrayList<Zaposleni> zaposleni = new ArrayList<Zaposleni>();
		zaposleni.add(new StalnoZaposleni("Janko", "Jankovic", 10, 5.2f));
		zaposleni.add(new StalnoZaposleni("Marija", "Mirkovic", 2, 6.4f));
		zaposleni.add(new HonorarniZaposleni("Emir", "Jakic", 1, 23, 15f));

		float ukupnaPlata = 0;
		for (Zaposleni z : zaposleni) {
			ukupnaPlata += z.obracunPlate();
		}
		System.out.printf("Ukupna plata zaposlenih: %.2f EUR.%n", ukupnaPlata);

		ArrayList<Trosak> troskovi = new ArrayList<Trosak>();
		troskovi.add(new StalnoZaposleni("Branka", "Jankovic", 4, 7.4f));
		troskovi.add(new HonorarniZaposleni("Maja", "Bakrac", 1, 34, 21f));
		troskovi.add(new StalnoZaposleni("Neno", "Bakrac", 2, 4.4f));
		troskovi.add(new Racun("Kinder Bueno", 1f, 0.21f));

		float ukupniTrosak = 0;
		float ukupniRacuni = 0;
		for (Trosak t : troskovi) {
			ukupniTrosak += t.iznosTroska();
			System.out.println("Tip: " + t.getClass().getSimpleName() + " -> " + t);
			if (t instanceof Racun) {
				Racun r = (Racun) t;
				ukupniRacuni += r.iznosTroska();
			}
		}
		System.out.printf("Ukupni troskovi: %.2f EUR.%n", ukupniTrosak);
		System.out.printf("Ukupni racuni: %.2f EUR.%n", ukupniRacuni);
	}
}
