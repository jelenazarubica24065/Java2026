package izuzeci.osnove;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimjerSaObradomIzuzetaka {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		boolean losUnos = true;
		while (losUnos) {
			System.out.print("Unijeti imenilac i brojilac razlomka: ");
			try {
				int imenilac = unos.nextInt();
				int brojilac = unos.nextInt();
				int rezultat = kolicnik(imenilac, brojilac);
				System.out.printf("%d/%d = %d%n", brojilac, imenilac, rezultat);
				losUnos = false;
			} catch (ArithmeticException e) {
				System.out.println("Imenilac ne može biti 0.");
			} catch (InputMismatchException e) {
				System.out.println("Morate unijeti cijele brojeve.");
				unos.nextLine();
			}
		}
		unos.close();
		System.out.println("Kraj programa.");
	}

	public static int kolicnik(int im, int br) throws ArithmeticException {
		return br / im;
	}
}
