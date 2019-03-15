class Point023 {
	public Point023(char c, double x) // constructeur
	{
		nom = c;
		abs = x;
	}

	public void affiche() {
		System.out.println("Point de nom " + nom + "  d'abscisse " + abs);
	}

	public void translate(double dx) {
		abs += dx;
	}

	private char nom; // nom du point
	private double abs; // abscisse du point
}

public class Exercice023 {
	public static void main(String args[]) {
		Point023 a = new Point023('C', 2.5);
		a.affiche();
		Point023 b = new Point023('D', 5.25);
		b.affiche();
		b.translate(2.25);
		b.affiche();
	}
}