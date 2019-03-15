class PointDelta {
	public PointDelta(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		System.out.println("Coordonnees : " + x + " " + y);
	}

	private int x, y;
}

class PointNames extends PointDelta {
	public PointNames(int x, int y, char Nom) {
		super(x, y);
		this.Nom = Nom;
	}

	public void affiche() {
		System.out.print("Point de nom " + Nom + " ");
		super.affiche();
	}

	private char Nom;
}

public class Exercice063 {
	public static void main(String args[]) {
		PointDelta p = new PointDelta(3, 7);
		p.affiche(); // methode de Point
		PointNames pn = new PointNames(1, 7, 'A');
		pn.affiche(); // methode de PointNom
	}
}
