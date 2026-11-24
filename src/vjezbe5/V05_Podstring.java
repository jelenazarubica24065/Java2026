package vjezbe5;

import java.util.Scanner;

public class V05_Podstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Prvi string: ");
		String prvi = sc.nextLine();
		System.out.print("Drugi string: ");
		String drugi = sc.nextLine();

		if (prvi.contains(drugi)) {
			System.out.println("Drugi JE podstring prvog, pocinje na indeksu " + prvi.indexOf(drugi));
		} else {
			System.out.println("Drugi NIJE podstring prvog.");
		}
		sc.close();
	}

}
