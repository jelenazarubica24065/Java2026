package vjezbe6.zadatak1;

public class Garderoba extends Proizvod {
	private String materijal;
	private Sezona sezona;

	public Garderoba(String opis, String barkod, String zemlja, int godina,
	                 double uvoznaCijena, String materijal, Sezona sezona) {
		super(opis, barkod, zemlja, godina, uvoznaCijena);
		this.materijal = materijal;
		this.sezona = sezona;
	}

	@Override
	public double maloprodajnaCijena() {
		return uvoznaCijena * 1.05;
	}

	@Override
	public String toString() {
		return "Garderoba: " + super.toString() + " | materijal: " + materijal + " | sezona: " + sezona;
	}
}
