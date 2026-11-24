package vjezbe6.zadatak3;

import java.util.ArrayList;

public class Smjena {
	private String datum;
	private int pocetak;
	private int kraj;
	private TipSmjene tip;
	private ArrayList<Zaposleni> radnici = new ArrayList<Zaposleni>();

	public Smjena(String datum, int pocetak, int kraj, TipSmjene tip) {
		this.datum = datum;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.tip = tip;
	}

	public void dodajRadnika(Zaposleni z) {
		radnici.add(z);
	}

	public int trajanje() {
		if (kraj >= pocetak) return kraj - pocetak;
		return kraj + 24 - pocetak;
	}

	public void upisiSate() {
		for (Zaposleni z : radnici) {
			z.setUkupanBrojSati(z.getUkupanBrojSati() + trajanje());
		}
	}
}
