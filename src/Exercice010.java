
public class Exercice010 {

	public static void main(String[] args) {
		int n = 10, p = 5, q = 10;

		n = p = q = 5;
		n += p += q;
		System.out.println("A : n = " + n + " p = " + p + " q = " + q);
		// A : n = 15 p = 10 q = 5
		q = n < p ? n++ : p++;
		System.out.println("B : n = " + n + " p = " + p + " q = " + q);
		// B : n = 15 p = 11 q = 10
		q = n > p ? n++ : p++;
		System.out.println("C : n = " + n + " p = " + p + " q = " + q);
		// C : n = 16 p = 11 q = 15
	}

}
