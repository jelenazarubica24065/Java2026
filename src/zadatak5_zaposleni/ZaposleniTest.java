package zadatak5_zaposleni;

public class ZaposleniTest {

	public static void main(String[] args) {
		Zaposleni z1 = new Zaposleni("Ana", "Peric", 12, 750);
		Zaposleni z2 = new Zaposleni("Marko", "Jovic", 4, 700);
		Zaposleni z3 = new Zaposleni("Ivan", "Savic", 15, 1000);

		System.out.println(z1.getIme() + " ima platu " + z1.getPlata());
		z2.setPrezime("Jovanovic");
		z2.setGodineStaza(5);

		z1.ispisi();
		z2.ispisi();
		z3.ispisi();

		z1.povecajPlatu();
		z2.povecajPlatu();
		z3.povecajPlatu();

		System.out.println("Plate: " + z1.getPlata() + ", " + z2.getPlata() + ", " + z3.getPlata());
	}

}
