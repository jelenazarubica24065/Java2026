package izuzeci.osnove;

public class BacanjeIzuzetkaSaFinally {
	public static void baciIzuzetak() throws Exception {
		try {
			System.out.println("try blok");
			throw new Exception("Naš izuzetak");
		} catch (Exception e) {
			System.out.println("Izuzetak uhvaćen: " + e.getMessage());
			throw e;
		} finally {
			System.out.println("finally blok");
		}
	}

	public static void main(String[] args) {
		try {
			baciIzuzetak();
		} catch (Exception e) {
			System.out.println("Izuzetak obrađen u main()");
		}
	}
}
