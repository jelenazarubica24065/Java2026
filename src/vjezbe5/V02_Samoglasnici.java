package vjezbe5;

import java.util.Scanner;

public class V02_Samoglasnici {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi rijec: ");
		String rijec = sc.next().toLowerCase();

		int samoglasnici = 0;
		int suglasnici = 0;
		for (int i = 0; i < rijec.length(); i++) {
			char c = rijec.charAt(i);
			if ("aeiou".indexOf(c) >= 0) {
				samoglasnici++;
			} else if (Character.isLetter(c)) {
				suglasnici++;
			}
		}
		System.out.println("Samoglasnika: " + samoglasnici);
		System.out.println("Suglasnika: " + suglasnici);
		sc.close();
	}

}
