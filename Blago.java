package vjezbe2_dodatni;

import java.util.Scanner;

public class Blago {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		double x1 = u.nextDouble(), y1 = u.nextDouble();
		double x2 = u.nextDouble(), y2 = u.nextDouble();

		double xb = x2 + 2;
		double yb = y2 - 3;

		double vazdusno = Math.sqrt(Math.pow(xb - x1, 2) + Math.pow(yb - y1, 2));
		double hrastKuca = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double kucaBlago = Math.sqrt(2 * 2 + 3 * 3);
		double prekoKuce = hrastKuca + kucaBlago;

		System.out.printf("Blago je na (%.1f, %.1f)%n", xb, yb);
		System.out.printf("Vazdusno rastojanje: %.2f%n", vazdusno);
		System.out.printf("Rastojanje preko kuce: %.2f%n", prekoKuce);
		u.close();
	}

}
