class UtilTab2 {
	public static int[] genere(int n) {
		int[] res = new int[n];
		for (int i = 0, j = 1; i < n; i++, j += 2)
			res[i] = j;
		return res;
	}

	public static int[] somme(int t1[], int t2[]) {
		int n = t1.length;
		if (n != t2.length)
			return null;
		int res[] = new int[n];
		for (int i = 0; i < n; i++)
			res[i] = t1[i] + t2[i];
		return res;
	}

	public static void affiche(int[] t) {
		for (int i = 0; i < t.length; i++)
			System.out.print(t[i] + " ");
		System.out.println();
	}
}

public class Exercice054 {
	public static void main(String args[]) {
		int ta[] = { 1, 5, 9 };
		System.out.print("ta = ");
		UtilTab2.affiche(ta);
		int tb[] = UtilTab2.genere(3);
		System.out.print("tb = ");
		UtilTab2.affiche(tb);
		int tc[] = UtilTab2.somme(ta, tb);
		System.out.print("tc = ");
		UtilTab2.affiche(tc);
	}
}