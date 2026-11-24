package vjezbe2_dodatni;

import java.util.Scanner;

public class ParanPozitivan {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int n = u.nextInt();
		String znak, parnost;
		if (n >= 0) znak = "pozitivan";
		else znak = "negativan";
		if (n % 2 == 0) parnost = "paran";
		else parnost = "neparan";
		System.out.println("Broj je " + znak + "/" + parnost);
		u.close();
	}

}
