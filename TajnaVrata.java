package vjezbe2_dodatni;

import java.util.Scanner;

public class TajnaVrata {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int n = u.nextInt();
		int a = n / 100;
		int b = n / 10 % 10;
		int c = n % 10;
		int kod = a * b * c - (a + b + c);
		System.out.println("Kod: " + kod);
		u.close();
	}

}
