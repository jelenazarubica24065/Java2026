package zadatak14_automobil;

class Automobil {
	private String marka;
	private String model;
	private int godiste;
	private int brzina;

	public Automobil(String marka, String model, int godiste, int brzina) {
		this.marka = marka;
		this.model = model;
		this.godiste = godiste;
		this.brzina = brzina;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}

	public void ubrzaj(int vrijednost) {
		brzina = brzina + vrijednost;
		if (brzina > 200) {
			brzina = 200;
		}
	}

	public void uspori(int vrijednost) {
		brzina = brzina - vrijednost;
		if (brzina < 0) {
			brzina = 0;
		}
	}

	public void ispisi() {
		System.out.println(marka + " " + model + " (" + godiste + "), brzina: " + brzina + " km/h");
	}
}

public class AutomobilApp {

	public static void main(String[] args) {
		Automobil a = new Automobil("Audi", "A4", 2015, 50);
		a.ispisi();
		a.ubrzaj(100);
		a.ispisi();
		a.ubrzaj(150);
		a.ispisi();
		a.uspori(80);
		a.ispisi();
		a.uspori(500);
		a.ispisi();
	}

}
