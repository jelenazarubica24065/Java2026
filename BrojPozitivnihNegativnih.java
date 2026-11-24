package vjezbe1;

import java.util.Scanner;

public class BrojPozitivnihNegativnih {

	public static void main(String[] args) {
		int a, b, c, brojPozitivnih = 0;
		Scanner u = new Scanner(System.in);
		System.out.println("Unesi a: ");
		a = u.nextInt();
		System.out.println("Unesi b: ");
		b = u.nextInt();
		System.out.println("Unesi c: ");
		c = u.nextInt();

		if (a >= 0) brojPozitivnih++;
		if (b >= 0) brojPozitivnih++;
		if (c >= 0) brojPozitivnih++;

		System.out.printf("Uneseno je %d pozitivna broja i %d negativna.%n", brojPozitivnih, 3 - brojPozitivnih);
		u.close();
	}

}
