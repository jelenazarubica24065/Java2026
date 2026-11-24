package zadatak4_televizor;

public class Televizor {

	private int brojKanala;
	private String nazivKanala;
	private int jacinaTona;

	public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
		this.brojKanala = 1;
		this.jacinaTona = 0;
		setBrojKanala(brojKanala);
		this.nazivKanala = nazivKanala;
		setJacinaTona(jacinaTona);
	}

	public int getBrojKanala() {
		return brojKanala;
	}

	public void setBrojKanala(int brojKanala) {
		if (brojKanala >= 1) {
			this.brojKanala = brojKanala;
		} else {
			System.out.println("Broj kanala mora biti >= 1.");
		}
	}

	public String getNazivKanala() {
		return nazivKanala;
	}

	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}

	public int getJacinaTona() {
		return jacinaTona;
	}

	public void setJacinaTona(int jacinaTona) {
		if (jacinaTona >= 0 && jacinaTona <= 10) {
			this.jacinaTona = jacinaTona;
		} else {
			System.out.println("Jacina tona mora biti od 0 do 10.");
		}
	}

	public void pojacajTon() {
		if (jacinaTona < 10) {
			jacinaTona++;
		} else {
			System.out.println("Ton je vec na maksimumu.");
		}
	}

	public void ispisi() {
		System.out.println("Kanal " + brojKanala + " (" + nazivKanala + "), jacina tona: " + jacinaTona);
	}

}
