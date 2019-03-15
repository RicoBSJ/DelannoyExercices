class PointTheta {
	public PointTheta(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void affCoord() {
		System.out.println("Coordonnees : " + x + " " + y);
	}

	private int x, y;
}

class PointName extends PointTheta {
	public PointName(int x, int y, char nom) {
		super(x, y);
		this.nom = nom;
	}

	public void affCoordNom() {
		System.out.print("Point de nom " + nom + " ");
		affCoord();
	}

	private char nom;
}

public class Exercice062 {
	public static void main(String args[]) {
		PointName pn1 = new PointName(1, 7, 'A');
		pn1.affCoordNom(); // methode de PointNom

		PointName pn2 = new PointName(4, 3, 'B');
		pn2.affCoordNom(); // methode de PointNom
		pn2.affCoord(); // methode de Point
	}
}

/*
 * Point de nom A Coordonnees : 1 7 Point de nom A Coordonnees : 1 7 Point de
 * nom B Coordonnees : 4 3 Coordonnees : 4 3
 */