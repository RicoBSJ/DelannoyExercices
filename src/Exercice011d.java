
public class Exercice011d {
	public static void main(String[] args) {
		// groupe 4
		int n = 0;
		final int LIMITE = 20;
		switch (n) {
		case LIMITE - 1:
			System.out.println("un peu trop petit");
			break;
		case LIMITE:
			System.out.println("OK");
			break;
		case LIMITE + 1:
			System.out.println("un peu trop grand");
			break;
		}
	}
}