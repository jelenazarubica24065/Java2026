package vjezbe6.zadatak2;

public class Test {
	public static void main(String[] args) {
		EProizvodi[] niz = new EProizvodi[4];
		niz[0] = new Racunar("Dell", "RA001", 1000, "i5", 16);
		niz[1] = new Telefon("Samsung", "TE001", 500, "Android", 6.5);
		niz[2] = new TV("LG", "TV001", 2000, 75);
		niz[3] = new TV("Philips", "TV002", 400, 43);

		for (EProizvodi p : niz) {
			System.out.printf("%s -> %.2f%n", p.getTip(), p.maloprodajnaCijena());
		}
		System.out.println("--- samo TV ---");
		Metode.stampajTip(niz, "TV");
	}
}
