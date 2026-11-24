package zadatak3_student;

import java.util.ArrayList;

public class Student {

	private String ime;
	private String prezime;
	private String brojIndeksa;
	private String adresa;
	private float brojBodova;
	private boolean polozioIliNe;
	private static float prolazNaIspitu;

	public Student() {
		ime = "";
		prezime = "";
		brojIndeksa = "";
		adresa = "";
		brojBodova = 0;
		polozioIliNe = false;
	}

	public Student(String ime, String prezime, String brojIndeksa, String adresa, float brojBodova) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.adresa = adresa;
		this.brojBodova = brojBodova;
		this.polozioIliNe = false;
	}

	public static void setProlazNaIspitu(float a) {
		prolazNaIspitu = a;
	}

	public static float getProlazNaIspitu() {
		return prolazNaIspitu;
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

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public float getBrojBodova() {
		return brojBodova;
	}

	public void setBrojBodova(float brojBodova) {
		this.brojBodova = brojBodova;
	}

	public boolean isPolozioIliNe() {
		return polozioIliNe;
	}

	public void setPolozioIliNe(boolean polozioIliNe) {
		this.polozioIliNe = polozioIliNe;
	}

	public void azurirajPolozioPolje() {
		if (this.brojBodova >= Student.prolazNaIspitu) {
			this.polozioIliNe = true;
		} else {
			this.polozioIliNe = false;
		}
	}

	public static ArrayList<Student> izdvojPoloziliIliNe(ArrayList<Student> a, int b) {
		ArrayList<Student> r = new ArrayList<Student>();
		for (Student x : a) {
			if (x.isPolozioIliNe() && b == 1) {
				r.add(x);
			}
			if (!x.isPolozioIliNe() && b == 0) {
				r.add(x);
			}
		}
		return r;
	}

	public static ArrayList<Student> izdvojUlica(ArrayList<Student> a, String nazivUlice) {
		ArrayList<Student> r = new ArrayList<Student>();
		for (Student x : a) {
			if (x.getAdresa().startsWith(nazivUlice)) {
				r.add(x);
			}
		}
		return r;
	}

	public void stampajStudenta() {
		System.out.printf("%s %s %s %s %.1f%n", brojIndeksa, ime, prezime, adresa, brojBodova);
	}

}
