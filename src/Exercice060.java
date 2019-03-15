class PointBeta {
	public void initialise(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void deplace(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	private int x, y;
}

class PointA extends PointBeta {
	void affiche() {
		System.out.println("Coordonnees : " + getX() + " " + getY());
	}
}

public class Exercice060 {
	public static void main(String args[]) {
		PointBeta p = new PointBeta();
		p.initialise(2, 5);
		System.out.println("Coordonnees : " + p.getX() + " " + p.getY());
		PointA pa = new PointA();
		pa.initialise(2, 5); // on utilise la methode initialise de Point
		pa.affiche(); // et la mÈthode affiche de PointA
	}
}