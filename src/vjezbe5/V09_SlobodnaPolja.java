package vjezbe5;

import java.util.Scanner;

public class V09_SlobodnaPolja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("String od 0 i 1: ");
		String s = sc.next();
		System.out.print("Pozicija (od 0): ");
		int p = sc.nextInt();

		int slobodnih = 0;
		if (p > 0 && s.charAt(p - 1) == '0') {
			slobodnih++;
		}
		if (p < s.length() - 1 && s.charAt(p + 1) == '0') {
			slobodnih++;
		}
		System.out.println(slobodnih);
		sc.close();
	}

}
