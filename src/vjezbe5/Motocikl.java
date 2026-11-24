package vjezbe5;

public class Motocikl extends Vozilo {
	private int kilometraza;

	public Motocikl() {
		this(null, null, 0, 0, 0);
	}

	public Motocikl(String marka, String model, int kubikaza, int godiste, int kilometraza) {
		super(marka, model, kubikaza, godiste);
		this.kilometraza = kilometraza;
	}

	public int getKilometraza() {
		return kilometraza;
	}

	public void setKilometraza(int kilometraza) {
		this.kilometraza = kilometraza;
	}

	@Override
	public float cijenaRegistracije() {
		return ((float) getKubikaza() / 5 - (float) getKilometraza() / 1000) * getOsnovicaZaRegistraciju();
	}

	@Override
	public String toString() {
		return "Motocikl [kilometraza=" + kilometraza + ", marka=" + getMarka() + ", model=" + getModel()
				+ ", kubikaza=" + getKubikaza() + ", godiste=" + getGodiste() + "]";
	}
}
