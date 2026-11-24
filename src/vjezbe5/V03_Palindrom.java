package vjezbe5;

import java.util.Scanner;

public class V03_Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi tekst: ");
		String tekst = sc.nextLine();

		String obrnuto = new StringBuilder(tekst).reverse().toString();
		if (tekst.equals(obrnuto)) {
			System.out.println("Palindrom (prosta provjera)");
		} else {
			System.out.println("Nije palindrom (prosta provjera)");
		}

		String ocisceno = tekst.replace(" ", "").toLowerCase();
		String obrnutoOcisceno = new StringBuilder(ocisceno).reverse().toString();
		if (ocisceno.equals(obrnutoOcisceno)) {
			System.out.println("Palindrom (bez praznina i velikih slova)");
		} else {
			System.out.println("Nije palindrom (bez praznina i velikih slova)");
		}
		sc.close();
	}

}
