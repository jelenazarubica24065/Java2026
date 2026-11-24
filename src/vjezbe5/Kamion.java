package vjezbe5;

public class Kamion extends Vozilo {
	private int nosivost;

	public Kamion() {
		this(null, null, 0, 0, 0);
	}

	public Kamion(String marka, String model, int kubikaza, int godiste, int nosivost) {
		super(marka, model, kubikaza, godiste);
		this.nosivost = nosivost;
	}

	public int getNosivost() {
		return nosivost;
	}

	public void setNosivost(int nosivost) {
		this.nosivost = nosivost;
	}

	@Override
	public float cijenaRegistracije() {
		return ((float) getKubikaza() / 10 + (2026 - getGodiste()) * 10) * getOsnovicaZaRegistraciju()
				+ 30 * nosivost;
	}

	@Override
	public String toString() {
		return "Kamion [nosivost=" + nosivost + ", marka=" + getMarka() + ", model=" + getModel()
				+ ", kubikaza=" + getKubikaza() + ", godiste=" + getGodiste() + "]";
	}
}
