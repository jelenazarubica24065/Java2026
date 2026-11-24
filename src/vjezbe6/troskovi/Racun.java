package vjezbe6.troskovi;

public class Racun implements Trosak {
	private String opis;
	private float iznos;
	private float pdv;

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public float getIznos() {
		return iznos;
	}

	public void setIznos(float iznos) {
		this.iznos = iznos;
	}

	public float getPdv() {
		return pdv;
	}

	public void setPdv(float pdv) {
		this.pdv = pdv;
	}

	public Racun(String opis, float iznos, float pdv) {
		super();
		this.setOpis(opis);
		this.setIznos(iznos);
		this.setPdv(pdv);
	}

	public Racun() {
		this(null, 0, 0);
	}

	@Override
	public float iznosTroska() {
		return this.getIznos() + this.getPdv();
	}

	@Override
	public String toString() {
		return "Racun [opis=" + opis + ", iznos=" + iznos + ", pdv=" + pdv + "]";
	}
}
