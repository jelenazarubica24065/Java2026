package vjezbe5;

import java.util.Scanner;

public class V12_Broker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi transakcije: ");
		String ulaz = sc.nextLine();

		int stanje = 0;
		String[] transakcije = ulaz.split(" ");
		for (String t : transakcije) {
			char vrsta = t.charAt(0);
			int iznos = Integer.parseInt(t.substring(1));
			if (vrsta == 'S') {
				stanje += iznos;
			} else {
				stanje -= iznos;
			}
		}
		System.out.println(stanje);
		if (stanje > 0) {
			System.out.println("Broker je u plusu.");
		} else if (stanje < 0) {
			System.out.println("Broker je u minusu.");
		} else {
			System.out.println("Broker je na nuli.");
		}
		sc.close();
	}

}
