package izuzeci.osnove;

import java.util.Scanner;

public class PrimjerBezObradeIzuzetaka {
	public static int kolicnik(int im, int br) {
		return br / im;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unijeti imenilac i brojilac: ");
		int imenilac = unos.nextInt();
		int brojilac = unos.nextInt();
		int rezultat = kolicnik(imenilac, brojilac);
		System.out.printf("%d/%d = %d%n", brojilac, imenilac, rezultat);
		unos.close();
	}
}
