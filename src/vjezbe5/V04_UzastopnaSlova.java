package vjezbe5;

import java.util.Scanner;

public class V04_UzastopnaSlova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi string: ");
		String s = sc.next();

		boolean nadjeno = false;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				System.out.println("Ponavlja se slovo: " + s.charAt(i));
				nadjeno = true;
			}
		}
		if (!nadjeno) {
			System.out.println("Nema uzastopnih slova.");
		}
		sc.close();
	}

}
