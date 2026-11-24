package vjezbe6.zadatak3;

import java.util.ArrayList;

public class Restoran {
	private String naziv;
	private String adresa;
	private String pib;
	private ArrayList<Zaposleni> zaposleni = new ArrayList<Zaposleni>();
	private ArrayList<ObracunPlate> istorija = new ArrayList<ObracunPlate>();

	public Restoran(String naziv, String adresa, String pib) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
	}

	public void dodaj(Zaposleni z) {
		zaposleni.add(z);
	}

	public boolean ukloni(int id) {
		Zaposleni z = nadji(id);
		if (z == null) return false;
		zaposleni.remove(z);
		return true;
	}

	public Zaposleni nadji(int id) {
		for (Zaposleni z : zaposleni) {
			if (z.getId() == id) return z;
		}
		return null;
	}

	public void obracunPlata(int mjesec, int godina) {
		System.out.println("Restoran " + naziv + ", " + adresa + ", PIB " + pib);
		System.out.println("Obracun za " + mjesec + "/" + godina);
		System.out.printf("%-4s %-20s %-10s %6s %12s %10s%n",
				"ID", "Ime i prezime", "Tip", "Sati", "Prek./bonus", "Plata");
		for (Zaposleni z : zaposleni) {
			double plata = z.izracunajPlatu();
			System.out.printf("%-4d %-20s %-10s %6d %12.1f %10.2f%n",
					z.getId(), z.getImePrezime(), z.getTip(),
					z.getUkupanBrojSati(), z.getDodatak(), plata);
			istorija.add(new ObracunPlate(mjesec, godina, z, plata, z.getNapomena()));
		}
	}

	public double ukupanTrosakPlata() {
		double zbir = 0;
		for (Zaposleni z : zaposleni) {
			zbir += z.izracunajPlatu();
		}
		return zbir;
	}

	public void ispisiIstoriju() {
		for (ObracunPlate o : istorija) {
			System.out.println(o);
		}
	}
}
