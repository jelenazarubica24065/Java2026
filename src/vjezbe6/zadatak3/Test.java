package vjezbe6.zadatak3;

public class Test {
	public static void main(String[] args) {
		Restoran r = new Restoran("Konoba", "Ulica 1, Podgorica", "12345678");

		r.dodaj(new Konobar(1, "Marko", "Markovic", 5, 40, 10));
		r.dodaj(new Konobar(2, "Jovana", "Jovanovic", 4.5, 35, 0));
		r.dodaj(new Kuvar(3, "Ana", "Anic", 6, 40));
		r.dodaj(new Kuvar(4, "Nikola", "Nikolic", 7, 30));
		r.dodaj(new Menadzer(5, "Petar", "Petrovic", 10, 40, 200));

		r.obracunPlata(10, 2026);
		System.out.printf("Ukupan trosak plata: %.2f EUR%n", r.ukupanTrosakPlata());

		System.out.println("--- istorija ---");
		r.ispisiIstoriju();

		Zaposleni z = r.nadji(3);
		System.out.println("Nadjen: " + z);
		System.out.println("Uklonjen 4: " + r.ukloni(4));
		System.out.println("Uklonjen 99: " + r.ukloni(99));

		Smjena s = new Smjena("2026-10-01", 6, 14, TipSmjene.JUTARNJA);
		s.dodajRadnika(z);
		s.upisiSate();
		System.out.println("Ana sada ima sati: " + z.getUkupanBrojSati());
	}
}
