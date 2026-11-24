package vjezbe6.zadatak3;

public class Konobar extends Zaposleni {
	private double prekovremeniSati;

	public Konobar(int id, String ime, String prezime, double plataPoSatu,
	               int ukupanBrojSati, double prekovremeniSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.prekovremeniSati = prekovremeniSati;
	}

	@Override
	public double izracunajPlatu() {
		double redovno = 4 * ukupanBrojSati * plataPoSatu;
		double prekovremeno = prekovremeniSati * plataPoSatu * 1.2;
		return redovno + prekovremeno;
	}

	@Override
	public String getTip() { return "Konobar"; }

	@Override
	public double getDodatak() { return prekovremeniSati; }

	@Override
	public String getNapomena() {
		if (prekovremeniSati > 0) return "uracunat prekovremeni rad";
		return "";
	}
}
