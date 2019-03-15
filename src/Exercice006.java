
public class Exercice006 {

	public static void main(String[] args) {

		int x = 1, y = 2, b = 3, c = 4, d = 5, n = 1, p = 2, i = 1;

		int a = x + 5; // 1
		System.out.println(a);
		//6
		a = (x = y) + 2; // 2
		System.out.println(a);
		//4
		a = (x = y + 2); // 3
		System.out.println(a);
		//4
		boolean e = a < b && c < d; // 4
		System.out.println(e);
		//false
		int z = i++ * (n + p); // 5
		System.out.println(z);
		//(1) * (1 + 2) = 3
		x += n % p; // 6
		System.out.println(x);
		//4 += (1 % 2) = 5
		n = (p += 5); // 7
		System.out.println(n);
		//n = (p = 2+5) = 7
	}
}
