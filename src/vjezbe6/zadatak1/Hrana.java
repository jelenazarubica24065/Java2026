package vjezbe6.zadatak1;

import java.time.LocalDate;

public class Hrana extends Proizvod {
	private int brojKalorija;
	private LocalDate rokUpotrebe;

	public Hrana(String opis, String barkod, String zemlja, int godina,
	             double uvoznaCijena, int brojKalorija, LocalDate rokUpotrebe) {
		super(opis, barkod, zemlja, godina, uvoznaCijena);
		this.brojKalorija = brojKalorija;
		this.rokUpotrebe = rokUpotrebe;
	}

	@Override
	public double maloprodajnaCijena() {
		LocalDate granica = LocalDate.now().plusMonths(6);
		if (rokUpotrebe.isBefore(granica)) {
			return uvoznaCijena * 1.05;
		} else {
			return uvoznaCijena * 1.10;
		}
	}

	@Override
	public String toString() {
		return "Hrana: " + super.toString() + " | kalorije: " + brojKalorija
				+ " | rok upotrebe: " + rokUpotrebe;
	}
}
