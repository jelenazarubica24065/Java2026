package vjezbe6.zadatak2;

public class Racunar extends EProizvodi {
	private String procesor;
	private int memorija;

	public Racunar(String opis, String sifra, double uvoznaCijena, String procesor, int memorija) {
		super(opis, sifra, uvoznaCijena);
		this.procesor = procesor;
		this.memorija = memorija;
	}

	@Override
	public double maloprodajnaCijena() {
		return super.maloprodajnaCijena() * 1.05;
	}

	@Override
	public String toString() {
		return "Racunar: " + super.toString() + ", procesor: " + procesor + ", memorija: " + memorija + " GB";
	}
}
