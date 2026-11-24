package vjezbe2;

import java.util.Scanner;

public class Cifre {

	public static void main(String[] args) {
		int N, cifNajm, cifNajv = 0;
		Scanner u = new Scanner(System.in);
		System.out.print("Unesi prirodan broj N: ");
		N = u.nextInt();
		cifNajm = N % 10;
		while (N != 0) {
			cifNajv = N % 10;
			N = N / 10;
		}
		if (cifNajm == cifNajv)
			System.out.printf("Cifre %d i %d su iste.%n", cifNajv, cifNajm);
		else
			System.out.printf("Cifre %d i %d nisu iste.%n", cifNajv, cifNajm);
		u.close();
	}

}
