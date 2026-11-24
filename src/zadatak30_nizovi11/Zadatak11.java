package zadatak30_nizovi11;

public class Zadatak11 {

	static int zbirCifara(int broj) {
		broj = Math.abs(broj);
		int zbir = 0;
		while (broj > 0) {
			zbir += broj % 10;
			broj /= 10;
		}
		return zbir;
	}

	static int najveciZbirCifara(int[] niz) {
		int najbolji = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (zbirCifara(niz[i]) > zbirCifara(najbolji)) {
				najbolji = niz[i];
			}
		}
		return najbolji;
	}

	public static void main(String[] args) {
		System.out.println(najveciZbirCifara(new int[] { 123, 99, 5, 1000, 48 }));
	}

}
