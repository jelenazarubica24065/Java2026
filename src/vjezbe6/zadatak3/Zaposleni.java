package vjezbe6.zadatak3;

public abstract class Zaposleni {
	protected int id;
	protected String ime;
	protected String prezime;
	protected double plataPoSatu;
	protected int ukupanBrojSati;

	public Zaposleni(int id, String ime, String prezime, double plataPoSatu, int ukupanBrojSati) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
		this.ukupanBrojSati = ukupanBrojSati;
	}

	public abstract double izracunajPlatu();

	public abstract String getTip();

	public double getDodatak() {
		return 0;
	}

	public String getNapomena() {
		return "";
	}

	public int getId() { return id; }
	public String getImePrezime() { return ime + " " + prezime; }
	public int getUkupanBrojSati() { return ukupanBrojSati; }
	public void setUkupanBrojSati(int ukupanBrojSati) { this.ukupanBrojSati = ukupanBrojSati; }

	@Override
	public String toString() {
		return id + " " + ime + " " + prezime + " (" + getTip() + ")";
	}
}
