
public class Exercice011c {
	public static void main(String[] args) {
		// groupe 3
		int n = 2;
		final int p = 100;
		switch (n) // Aucune valeur n'est affectée à n
		{
		case 2:
			System.out.println("petit");
			break;

		case p:
			System.out.println("limite"); // p n'est pas une valeur constante
			break;
		}
	}
}