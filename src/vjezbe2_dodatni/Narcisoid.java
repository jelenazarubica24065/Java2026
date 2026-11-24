package vjezbe2_dodatni;

import java.util.Scanner;

public class Narcisoid {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int n = u.nextInt();

		int brojCifara = 0, t = n;
		while (t > 0) {
			brojCifara++;
			t = t / 10;
		}

		int suma = 0;
		t = n;
		while (t > 0) {
			int c = t % 10;
			suma += (int) Math.round(Math.pow(c, brojCifara));
			t = t / 10;
		}
		if (suma == n) System.out.println("Da");
		else System.out.println("Ne");
		u.close();
	}

}
