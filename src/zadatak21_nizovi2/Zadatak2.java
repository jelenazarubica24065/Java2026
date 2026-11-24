package zadatak21_nizovi2;

public class Zadatak2 {

	static void parniNegativni(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < 0 && niz[i] % 2 == 0) {
				System.out.print(niz[i] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a2 = { 4, -2, 7, -8, -3, 10, -6 };
		parniNegativni(a2);
	}

}
