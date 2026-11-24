package vjezbe2_dodatni;

import java.util.Scanner;

public class Zavjesa {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int zx1 = u.nextInt(), zy1 = u.nextInt(), zx2 = u.nextInt(), zy2 = u.nextInt();
		int px1 = u.nextInt(), py1 = u.nextInt(), px2 = u.nextInt(), py2 = u.nextInt();

		boolean pokriva = zx1 <= px1 && zx2 >= px2 && zy1 >= py1 && zy2 <= py2;
		if (pokriva) System.out.println("Zavjesa pokriva prozor.");
		else System.out.println("Zavjesa ne pokriva prozor.");
		u.close();
	}

}
