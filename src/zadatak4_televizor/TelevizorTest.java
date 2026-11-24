package zadatak4_televizor;

public class TelevizorTest {

	public static void main(String[] args) {
		Televizor tv = new Televizor(5, "RTCG 1", 9);
		tv.ispisi();
		tv.pojacajTon();
		tv.pojacajTon();
		tv.ispisi();
		tv.setJacinaTona(15);
		tv.setBrojKanala(0);
		tv.setBrojKanala(12);
		tv.setNazivKanala("Vijesti");
		tv.ispisi();
	}

}
