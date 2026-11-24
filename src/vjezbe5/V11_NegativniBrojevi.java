package vjezbe5;

import java.util.Scanner;

public class V11_NegativniBrojevi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesi string: ");
		String s = sc.next();

		int brojac = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '-') {
				boolean krajIliZnak = (i + 2 == s.length())
						|| s.charAt(i + 2) == '+' || s.charAt(i + 2) == '-';
				if (Character.isDigit(s.charAt(i + 1)) && krajIliZnak) {
					brojac++;
				}
			}
		}
		System.out.println(brojac);
		sc.close();
	}

}
