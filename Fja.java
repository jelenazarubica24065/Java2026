package vjezbe2;

import java.util.Scanner;

public class Fja {

	public static void main(String[] args) {
		int x;
		float f;
		Scanner u = new Scanner(System.in);
		System.out.print("Unesi x: ");
		x = u.nextInt();
		if (x < 1) {
			f = x * x;
		} else if (x < 5) {
			f = 2 - x;
		} else {
			f = (float) (x * x * x - 1) / 5;
		}
		System.out.printf("f(%d) = %.2f%n", x, f);
		u.close();
	}

}
