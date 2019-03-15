
public class Exercice016 {
	public static void main(String[] args) {
		int n, p;

		n = 0;
		while (n <= 5)
			n++;
		/*
		 * n = 1
		 * n = 1 + 1 = 2
		 * n = 2 + 1 = 3
		 * n = 3 + 1 = 4
		 * n = 4 + 1 = 5
		 * n = 5 + 1 = 6
		 */
		System.out.println("A : n = " + n);
		// A : n = 6
		n = p = 0;
		while (n <= 8)
			n += p++;
		/*
		 * n = n + p++
		 * n = n + p + 1 = 1
		 * n = 1 + 1 + 1 = 3
		 * n = 3 + 2 + 1 = 6
		 * n = 6 + 3 + 1 = 10
		 */
		System.out.println("B : n = " + n);
		// B : n = 10
		n = p = 0;
		while (n <= 8)
			n += ++p;
		/*
		 * n = n + (p + 1)
		 * n = n + (p + 1) = 1
		 * n = 1 + (1 + 1) = 3
		 * n = 3 + (2 + 1) = 6
		 * n = 6 + (3 + 1) = 10
		 */
		System.out.println("C : n = " + n);
		// C : n = 10
		n = p = 0;
		while (p <= 5)
			n += p++;
		/*
		 * n = n + p + 1 = 1
		 * n = 1 + 1 + 1 = 3
		 * n = 3 + 2 + 1 = 6
		 * n = 6 + 3 + 1 = 10
		 * n = 10 + 4 + 1 = 15
		 */
		System.out.println("D : n = " + n);
		// D : n = 15
		n = p = 0;
		while (p <= 5)
			n += ++p;
		/*
		 * n = n + (p + 1) = 1
		 * n = 1 + (1 + 1) = 3
		 * n = 3 + (2 + 1) = 6
		 * n = 6 + (3 + 1) = 10
		 * n = 10 + (4 + 1) = 15
		 * n = 15 + (5 + 1) = 21
		 */
		System.out.println("D : n = " + n);
		// D : n = 21
	}
}
/*
 * i += ++i + i++;
 * i = i + (++i + i++);
 * i = i + (i + (i+1)++);
 * i = i + (i +(i+2));
 * i = i + (i + i + 2);
 * i = 3 * i + 2;
 * i = 3 * 0 + 2;
 * POUR n += p++
 * à chaque tour:
 * -tu ajoutes à la valeur de n, la valeur de p.
 * -tu incrémentes p de 1.
 * p va donc valoir successivement 1,2,3,4,5
 * n(0) + 1 + 2 + 3 + 4 = 10
 * POUR n += ++p
 * à chaque tour:
 * -tu incrémentes p de 1.
 * -tu ajoutes à la valeur de n, la valeur de p.
 * p va donc valoir successivement 1,2,3,4,5
 */