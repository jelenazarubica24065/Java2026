package zadatak22_nizovi3;

import java.util.Arrays;

public class Zadatak3 {

	static void uvecajParne(int[] niz, int x) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				niz[i] = niz[i] + x;
			}
		}
	}

	public static void main(String[] args) {
		int[] a3 = { 1, 2, 3, 4, 5, 6 };
		uvecajParne(a3, 10);
		System.out.println(Arrays.toString(a3));
	}

}
