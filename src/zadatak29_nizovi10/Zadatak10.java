package zadatak29_nizovi10;

public class Zadatak10 {

	static int brojSuprotnih(int[] niz) {
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[i] == -niz[j]) {
					brojac++;
				}
			}
		}
		return brojac;
	}

	public static void main(String[] args) {
		System.out.println(brojSuprotnih(new int[] { 1, 2, -1, 3, -3 }));
		System.out.println(brojSuprotnih(new int[] { 20, 10, -10, 100 }));
	}

}
