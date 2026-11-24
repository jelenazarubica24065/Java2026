package vjezbe5;

import java.util.Scanner;

public class V08_ObrniRijeci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi recenicu: ");
		String recenica = sc.nextLine();

		String[] rijeci = recenica.split(" ");
		StringBuilder rezultat = new StringBuilder();
		for (int i = 0; i < rijeci.length; i++) {
			rezultat.append(new StringBuilder(rijeci[i]).reverse());
			if (i < rijeci.length - 1) {
				rezultat.append(" ");
			}
		}
		System.out.println(rezultat);
		sc.close();
	}

}
