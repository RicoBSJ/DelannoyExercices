
public class Exercice008 {

	public static void main(String[] args) {
		int i, j, n;

		i = 0;
		n = i++;
		System.out.println("A : i = " + i + "  n = " + n);
		//A : i = 1  n = 0
		i = 10;
		n = ++i;
		System.out.println("B : i = " + i + "  n = " + n);
		//B : i = 11 n = 11
		i = 20;
		j = 5;
		n = i++ * ++j;
		System.out.println("C : i = " + i + "  j = " + j + "  n = " + n);
		//C : i = 21  j = 6  n = 120
		i = 15;
		n = i += 3;
		System.out.println("D : i = " + i + "  n = " + n);
		//D : i = 18  n = 18
		i = 3;
		j = 5;
		n = i *= --j;
		System.out.println("E : i = " + i + "  j = " + j + "  n = " + n);
		//E : i = 12  j = 4  n = 12
	}

}
