package vjezbe6.zadatak3;

public class Menadzer extends Zaposleni {
	private double bonus;

	public Menadzer(int id, String ime, String prezime, double plataPoSatu,
	                int ukupanBrojSati, double bonus) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.bonus = bonus;
	}

	@Override
	public double izracunajPlatu() {
		return 1300 + 4 * ukupanBrojSati * plataPoSatu + bonus;
	}

	@Override
	public String getTip() { return "Menadzer"; }

	@Override
	public double getDodatak() { return bonus; }

	@Override
	public String getNapomena() {
		if (bonus > 0) return "bonus: " + bonus + " EUR";
		return "";
	}
}
