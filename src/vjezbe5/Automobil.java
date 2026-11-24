package vjezbe5;

public class Automobil extends Vozilo {
	private int brojVrata;
	private int brojOsoba;

	public Automobil() {
		this(null, null, 0, 0, 0, 0);
	}

	public Automobil(String marka, String model, int kubikaza, int godiste, int brojVrata, int brojOsoba) {
		super(marka, model, kubikaza, godiste);
		this.brojVrata = brojVrata;
		this.brojOsoba = brojOsoba;
	}

	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		if (brojVrata > 0) this.brojVrata = brojVrata;
	}

	public int getBrojOsoba() {
		return brojOsoba;
	}

	public void setBrojOsoba(int brojOsoba) {
		if (brojOsoba > 0) this.brojOsoba = brojOsoba;
	}

	@Override
	public float cijenaRegistracije() {
		return ((float) getKubikaza() / 10 + (2026 - getGodiste()) * 10) * getOsnovicaZaRegistraciju();
	}

	@Override
	public String toString() {
		return "Automobil [brojVrata=" + brojVrata + ", brojOsoba=" + brojOsoba + ", marka=" + getMarka()
				+ ", model=" + getModel() + ", kubikaza=" + getKubikaza() + ", godiste=" + getGodiste() + "]";
	}
}
