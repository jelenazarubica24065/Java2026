package vjezbe5;

import java.util.Scanner;

public class V06_IstiBezObziraNaSlova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Prvi string: ");
		String a = sc.nextLine();
		System.out.print("Drugi string: ");
		String b = sc.nextLine();

		if (a.equalsIgnoreCase(b)) {
			System.out.println("Stringovi su isti (bez obzira na velicinu slova).");
		} else {
			System.out.println("Stringovi nisu isti.");
		}
		sc.close();
	}

}
