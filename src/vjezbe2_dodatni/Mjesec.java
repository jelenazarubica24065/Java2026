package vjezbe2_dodatni;

import java.util.Scanner;

public class Mjesec {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int m = u.nextInt();
		switch (m) {
		case 1:
			System.out.println("januar");
			break;
		case 2:
			System.out.println("februar");
			break;
		case 3:
			System.out.println("mart");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("maj");
			break;
		case 6:
			System.out.println("jun");
			break;
		case 7:
			System.out.println("jul");
			break;
		case 8:
			System.out.println("avgust");
			break;
		case 9:
			System.out.println("septembar");
			break;
		case 10:
			System.out.println("oktobar");
			break;
		case 11:
			System.out.println("novembar");
			break;
		case 12:
			System.out.println("decembar");
			break;
		default:
			System.out.println("Nedozvoljen broj");
		}
		u.close();
	}

}
