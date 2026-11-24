package vjezbe6.zadatak1;

public abstract class Proizvod {
	protected String opis;
	protected String barkod;
	protected String zemlja;
	protected int godina;
	protected double uvoznaCijena;

	public Proizvod(String opis, String barkod, String zemlja, int godina, double uvoznaCijena) {
		this.opis = opis;
		this.barkod = barkod;
		this.zemlja = zemlja;
		this.godina = godina;
		this.uvoznaCijena = uvoznaCijena;
	}

	public abstract double maloprodajnaCijena();

	@Override
	public String toString() {
		return String.format("%s | barkod: %s | zemlja: %s | godina: %d | uvozna cijena: %.2f",
				opis, barkod, zemlja, godina, uvoznaCijena);
	}
}
