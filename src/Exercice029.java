
class G {
	static void f(int n) {q = n;}
	/* q devrait être en static
	 * car f est static
	*/
	void g(int n) {q = n; p = n;}
/* p ne devrait pas avoir le status de final
 * car la valeur de n lui est attribuée
 */

	static private int p = 20;
	static private int q;
}

public class Exercice029 extends G {//rajouter extends
	public static void main(String args[]) {
		Exercice029 a = new Exercice029();
		int n = 5;
		a.g(n);
		G.f(n);//Préférer la class à l'objet
		f(n);//Incorrect
	}
}