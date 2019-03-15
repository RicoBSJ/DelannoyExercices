class Alegorie {
	public void affiche() {
		System.out.print("Je suis un A  ");
	}
}

class Bravo extends Alegorie {
}

class Casque extends Alegorie {
	public void affiche() {
		System.out.print("Je suis un C  ");
	}
}

class Dame extends Casque {
	public void affiche() {
		System.out.print("Je suis un D  ");
	}
}

class Elargir extends Bravo {
}

class Fantome extends Casque {
}

public class Exercice067 {
	public static void main(String arg[]) {
		Alegorie a = new Alegorie();
		a.affiche();
		System.out.println();

		Bravo b = new Bravo();
		b.affiche();
		a = b;
		a.affiche();
		System.out.println();

		Casque c = new Casque();
		c.affiche();
		a = c;
		a.affiche();
		System.out.println();

		Dame d = new Dame();
		d.affiche();
		a = d;
		a.affiche();
		c = d;
		c.affiche();
		System.out.println();

		Elargir e = new Elargir();
		e.affiche();
		a = e;
		a.affiche();
		b = e;
		b.affiche();
		System.out.println();

		Fantome f = new Fantome();
		f.affiche();
		a = f;
		a.affiche();
		c = f;
		c.affiche();
	}
}

/*
 * Je suis un A Je suis un A Je suis un A Je suis un C Je suis un C Je suis un D
 * Je suis un D Je suis un D Je suis un A Je suis un A Je suis un A Je suis un C
 * Je suis un C Je suis un C
 * 
 */