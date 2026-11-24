package zadatak5_zaposleni;

public class Zaposleni {

	private String ime;
	private String prezime;
	private int godineStaza;
	private double plata;

	public Zaposleni(String ime, String prezime, int godineStaza, double plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.godineStaza = godineStaza;
		this.plata = plata;
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

	public int getGodineStaza() {
		return godineStaza;
	}

	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public void ispisi() {
		System.out.println(ime + " " + prezime + ", staz: " + godineStaza + " god.");
	}

	public void povecajPlatu() {
		if (plata < 800 && godineStaza > 10) {
			plata = plata * 1.06;
		}
	}

}
