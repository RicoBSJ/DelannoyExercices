
public class Exercice014 {
	public static void main(String[] args) {
		// int i, n, som;
		// som = 0;
		// for (i = 0; i < 4; i++) {
		// System.out.println("donnez un entier ");
		// n = Clavier.lireInt();
		// som += n;
		// }
		// System.out.println("Somme : " + som);
		// }

		/*
		 * Avec while
		 */

		// int i = 0;
		// int n, som;
		// som = 0;
		// while (i < 4) {
		// System.out.println("donnez un entier ");
		// n = Clavier.lireInt();
		// som += n;
		// i++;
		// }
		// System.out.println("Somme : " + som);
		// }
		// }

		/*
		 * Avec do while
		 */

		int i = 0;
		int n, som;
		som = 0;
		do {
			System.out.println("donnez un entier ");
			n = Clavier.lireInt();
			som += n;
			i++;
		} while (i < 4);
		System.out.println("Somme : " + som);
	}
}