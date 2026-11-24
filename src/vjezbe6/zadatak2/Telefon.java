package vjezbe6.zadatak2;

public class Telefon extends EProizvodi {
	private String operativniSistem;
	private double velicinaEkrana;

	public Telefon(String opis, String sifra, double uvoznaCijena,
	               String operativniSistem, double velicinaEkrana) {
		super(opis, sifra, uvoznaCijena);
		this.operativniSistem = operativniSistem;
		this.velicinaEkrana = velicinaEkrana;
	}

	@Override
	public double maloprodajnaCijena() {
		double cijena = super.maloprodajnaCijena();
		if (velicinaEkrana > 6) {
			cijena = cijena * 1.03;
		}
		return cijena;
	}

	@Override
	public String toString() {
		return "Telefon: " + super.toString() + ", OS: " + operativniSistem + ", ekran: " + velicinaEkrana + "\"";
	}
}
