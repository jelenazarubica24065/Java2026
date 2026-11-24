package vjezbe5;

import java.util.Scanner;

public class V10_Enkripcija {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi cifre: ");
		String s = sc.next();

		StringBuilder rezultat = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int cifra = s.charAt(i) - '0';
			if (cifra % 2 == 0) {
				rezultat.append('0');
			} else {
				rezultat.append('1');
			}
		}
		System.out.println(rezultat);
		sc.close();
	}

}
