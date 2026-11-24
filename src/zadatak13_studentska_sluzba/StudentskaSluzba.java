package zadatak13_studentska_sluzba;

import java.util.Scanner;

class Student {
	private String ime;
	private String prezime;
	private String brojIndeksa;
	private int ocjena1, ocjena2, ocjena3;

	private static String spisak = "";

	public Student(String ime, String prezime, String brojIndeksa, int o1, int o2, int o3) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		this.ocjena1 = o1;
		this.ocjena2 = o2;
		this.ocjena3 = o3;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public double prosjek() {
		return (ocjena1 + ocjena2 + ocjena3) / 3.0;
	}

	public boolean imaPravoNaKredit() {
		return prosjek() > 9;
	}

	public void dodajUSpisak() {
		String stip;
		if (imaPravoNaKredit()) {
			stip = "Da";
		} else {
			stip = "Ne";
		}
		spisak += "(" + ime + ", " + prezime + ", " + stip + ")\n";
	}

	public static void stampajSpisak() {
		System.out.print(spisak);
	}
}

public class StudentskaSluzba {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);

		System.out.println("Unesite podatke za 3 studenta (ime prezime indeks ocjena1 ocjena2 ocjena3):");
		for (int i = 0; i < 3; i++) {
			String ime = u.next();
			String prezime = u.next();
			String indeks = u.next();
			int o1 = u.nextInt();
			int o2 = u.nextInt();
			int o3 = u.nextInt();

			Student s = new Student(ime, prezime, indeks, o1, o2, o3);
			System.out.printf("Student %s %s (%s) - prosjek: %.2f, kredit: %s%n",
					s.getIme(), s.getPrezime(), s.getBrojIndeksa(), s.prosjek(),
					s.imaPravoNaKredit() ? "Da" : "Ne");
			s.dodajUSpisak();
		}

		System.out.println("\nSpisak studenata:");
		Student.stampajSpisak();
		u.close();
	}

}
