package vjezbe2_dodatni;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int n = u.nextInt();
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (n % 5 == 0) {
			System.out.println("Fizz");
		} else if (n % 3 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(n);
		}
		u.close();
	}

}
