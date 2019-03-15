class PointZ {
	public PointZ(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static boolean identiques(PointZ a, PointZ b) {
		return ((a.x == b.x) && (a.y == b.y));
	}

	public boolean identique(PointZ a) {
		return ((a.x == x) && (a.y == y));
	}
}

class PointNord extends PointZ {
	PointNord(int x, int y, char nom) {
		super(x, y);
		this.nom = nom;
	}

	private char nom;
}

public class Exercice069 {
	public static void main(String args[]) {
		PointZ p = new PointZ(2, 4);
		PointNord pn1 = new PointNord(2, 4, 'A');
		PointNord pn2 = new PointNord(2, 4, 'B');
		System.out.println(pn1.identique(pn2));
		System.out.println(PointZ.identiques(pn1, pn2));
		System.out.println(p.identique(pn1));
		System.out.println(pn1.identique(p));
	}
}