package vjezbe6.zadatak1;

public class HemijskiProizvod extends Proizvod {
	private double temperaturaSkladistenja;
	private boolean zapaljivo;

	public HemijskiProizvod(String opis, String barkod, String zemlja, int godina,
	                        double uvoznaCijena, double temperaturaSkladistenja, boolean zapaljivo) {
		super(opis, barkod, zemlja, godina, uvoznaCijena);
		this.temperaturaSkladistenja = temperaturaSkladistenja;
		this.zapaljivo = zapaljivo;
	}

	@Override
	public double maloprodajnaCijena() {
		if (zapaljivo) {
			return uvoznaCijena * 1.125;
		} else {
			return uvoznaCijena * 1.10;
		}
	}

	@Override
	public String toString() {
		return "Hemijski: " + super.toString() + " | temperatura: " + temperaturaSkladistenja
				+ " | zapaljivo: " + zapaljivo;
	}
}
