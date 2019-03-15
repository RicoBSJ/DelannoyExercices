
class I {
	public void affiche() {
		System.out.println("Je suis un A");
	}
}

class J extends I {
}

class K extends I {
	public void affiche() {
		System.out.println("Je suis un C");
	}
}

class L extends K {
	public void affiche() {
		System.out.println("Je suis un D");
	}
}

class M extends J {
}

class N extends K {
}

public class Exercice065 {
	public static void main(String arg[]) {
		I a = new I();
		a.affiche();
		J b = new J();
		b.affiche();
		K c = new K();
		c.affiche();
		L d = new L();
		d.affiche();
		M e = new M();
		e.affiche();
		N f = new N();
		f.affiche();
	}
}