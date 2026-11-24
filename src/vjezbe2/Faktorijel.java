package vjezbe2;

import java.util.Scanner;

public class Faktorijel {

	public static void main(String[] args) {
		long P = 1;
		int N;
		Scanner u = new Scanner(System.in);
		System.out.print("Unesi prirodan broj N: ");
		N = u.nextInt();
		for (int i = 1; i <= N; i++) {
			P = P * i;
		}
		System.out.printf("%d! = %d%n", N, P);
		u.close();
	}

}
