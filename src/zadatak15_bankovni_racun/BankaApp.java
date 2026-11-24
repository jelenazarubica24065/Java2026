package zadatak15_bankovni_racun;

class BankovniRacun {
	private String imeVlasnika;
	private double stanje;

	public BankovniRacun(String imeVlasnika, double stanje) {
		this.imeVlasnika = imeVlasnika;
		this.stanje = stanje;
	}

	public String getImeVlasnika() {
		return imeVlasnika;
	}

	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}

	public double getStanje() {
		return stanje;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}

	public void uplati(double iznos) {
		stanje = stanje + iznos;
	}

	public void isplati(double iznos) {
		if (iznos <= stanje) {
			stanje = stanje - iznos;
		} else {
			System.out.println("Nema dovoljno sredstava.");
		}
	}

	public void ispisi() {
		System.out.println("Vlasnik: " + imeVlasnika + ", stanje: " + stanje);
	}
}

public class BankaApp {

	public static void main(String[] args) {
		BankovniRacun r = new BankovniRacun("Ana Peric", 100);
		r.ispisi();
		r.uplati(50.5);
		r.ispisi();
		r.isplati(30);
		r.ispisi();
		r.isplati(500);
		r.ispisi();
	}

}
