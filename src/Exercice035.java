
public class Exercice035 {

class A {
	public void f(int n) {}
	public void f(byte b) {}
	public void f(float x) {}
	public void f(double y) {}
}

static A a ; static byte b; static short p;
int n; static long q; static float x; static double y;

public static void main (String args[]) {
	
	a.f(b);
	a.f(p);
	a.f(q);
	a.f(x);
	a.f(y);
	a.f(2. *x);
	a.f(b+1);
	a.f(b++);
	
	}
}
