package vjezbe6.troskovi;

public abstract class Zaposleni implements Trosak {
	private String ime;
	private String prezime;
	private int brojGodinaStaza;

	public abstract float obracunPlate();

	@Override
	public float iznosTroska() {
		return this.obracunPlate();
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getBrojGodinaStaza() {
		return brojGodinaStaza;
	}

	public void setBrojGodinaStaza(int brojGodinaStaza) {
		this.brojGodinaStaza = brojGodinaStaza;
	}

	public Zaposleni(String ime, String prezime, int brojGodinaStaza) {
		super();
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setBrojGodinaStaza(brojGodinaStaza);
	}

	public Zaposleni() {
		this(null, null, 0);
	}
}
