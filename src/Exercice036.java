
public class Exercice036 {
	class R {
		public void f(int n, float x) {}
		public void f(float x1, float x2) {}
		public void f(float x, int n) {}
	}

static R a ; static short p; static int n1, n2; static float x;

	public static void main (String args[]) {
		
		a.f(n1, x);
		a.f(x, n1);
		a.f(p, x);
//		a.f(n1, n2);
		
		}
}
