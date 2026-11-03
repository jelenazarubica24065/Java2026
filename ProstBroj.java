package vjezbe;

import java.util.Scanner;

public class ProstBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner u = new Scanner(System.in);
		int n = u.nextInt();
		
		boolean prost = n > 1;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				prost = false;
				break;
			}
		}
		
		if (prost) System.out.println("Prost je.");
		else System.out.println("Nije prost.");
       
	}

}
