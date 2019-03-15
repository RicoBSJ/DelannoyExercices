
public class Exercice009 {

	public static void main(String[] args) {
		byte b = 1;
		char c = 2;
		short p = 2;
		int n = 3;
		final int N = 10;
		long q = 4;
		float x = 5.f;
		double y = 6.;

		c = (char) (c + 1); // 1 Cast
		c++; // 2
		c += 3; // 3
		b += c; // 4
		p += b; // 5
		p = (short) (p + b); // 6 Cast
		n += x; // 7
		n = (int) (n + x); // 8 Cast
		x++; // 9
	}

}
