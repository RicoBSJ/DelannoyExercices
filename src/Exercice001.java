
public class Exercice001 {

	public static void main(String[] args) {
		
		// Eliminer les parenthèses superflues dans les expressions suivantes (l’ordre
		// des calculs devant rester le même) :

		int a = 1, b = 2, c = 3, x = 1, y = 2, z = 3, n = 1, p = 2;

		int m = a + b - 2 * c;// expression 1
		System.out.println(m);
		//-3
		int o = 2 * x / (y * z);// expression 2
		System.out.println(o);
		//0
		int q = x + 3 * (n % p);// expression 3
		System.out.println(q);
		//4
		int r = -a / -(b + c);// expression 4
		System.out.println(r);
		//-1/-5=0
		int s = x / y % -z;// expression 5
		System.out.println(s);
		//1/2%-3=0
		int t = x / (y % -z);// expression 6
		System.out.println(t);
		//1/(2%-3)=1/-2=0
	}
}
