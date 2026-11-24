package vjezbe6.zadatak2;

public class EProizvodi {
	protected String opis;
	protected String sifra;
	protected double uvoznaCijena;

	public EProizvodi(String opis, String sifra, double uvoznaCijena) {
		this.opis = opis;
		this.sifra = sifra;
		this.uvoznaCijena = uvoznaCijena;
	}

	public String getTip() {
		return sifra.substring(0, 2).toUpperCase();
	}

	public double maloprodajnaCijena() {
		return uvoznaCijena * 1.05;
	}

	@Override
	public String toString() {
		return String.format("%s (%s), uvozna cijena: %.2f, maloprodajna: %.2f",
				opis, sifra, uvoznaCijena, maloprodajnaCijena());
	}
}
