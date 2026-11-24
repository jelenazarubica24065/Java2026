package vjezbe2_dodatni;

import java.util.Scanner;

public class Mravi {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int xg = u.nextInt(), yg = u.nextInt(), xd = u.nextInt(), yd = u.nextInt();
		int N = u.nextInt();
		int naIvici = 0;
		for (int i = 0; i < N; i++) {
			int x = u.nextInt(), y = u.nextInt();
			boolean uspravna = (x == xd || x == xg) && y >= yd && y <= yg;
			boolean vodoravna = (y == yd || y == yg) && x >= xd && x <= xg;
			if (uspravna || vodoravna) naIvici++;
		}
		System.out.println("Na ivici stola je mrava: " + naIvici);
		u.close();
	}

}
