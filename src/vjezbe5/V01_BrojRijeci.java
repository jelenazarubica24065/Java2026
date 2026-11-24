package vjezbe5;

import java.util.Scanner;

public class V01_BrojRijeci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi recenicu: ");
		String recenica = sc.nextLine().trim();

		if (recenica.isEmpty()) {
			System.out.println("Broj rijeci: 0");
		} else {
			String[] rijeci = recenica.split("\\s+");
			System.out.println("Broj rijeci: " + rijeci.length);
		}
		sc.close();
	}

}
