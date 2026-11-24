package vjezbe6.zadatak2;

import java.util.ArrayList;

public class Metode {

	public static ArrayList<EProizvodi> uredjajiTipa(EProizvodi[] niz, String tip) {
		ArrayList<EProizvodi> rezultat = new ArrayList<EProizvodi>();
		for (EProizvodi p : niz) {
			if (p.getTip().equalsIgnoreCase(tip)) {
				rezultat.add(p);
			}
		}
		return rezultat;
	}

	public static void stampajTip(EProizvodi[] niz, String tip) {
		ArrayList<EProizvodi> izabrani = uredjajiTipa(niz, tip);
		if (izabrani.isEmpty()) {
			System.out.println("Nema uredjaja tipa " + tip);
		}
		for (EProizvodi p : izabrani) {
			System.out.println(p);
		}
	}
}
