
public class Exercice028 {
	void f(int n, float x) {
	}
	void g(byte b) {
	}
	void h(int n, double c) {
	}
	void i(int b) {
		
	}

	static Exercice028 a; static int n; static byte b; static float x; static double y;

	public static void main(String[] args) {
		a.f (n, x);
		a.f (b+3, x);
		a.f (b,x);
		a.h (n,y);//promotion de int,float vers int,double
		a.f (n, (float)y);
		a.f (n, 2*x);
		a.h (n+5, x+0.5);//promotion de int,float vers double
		a.g (b);
		a.i (b+1);//promotion de byte vers int
		a.g (b++);
		a.i (3);//promotion de byte vers int
	}
}
