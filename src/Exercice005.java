
public class Exercice005 {

	public static void main(String[] args) {
		int i = 10, j = 5;
		
		if (i < 5 && j++ < 10)
			System.out.println("&&1 vrai");
		//
		else
			System.out.println("&&1 faux");
		//&&1 faux
		System.out.println("i = " + i + "  j = " + j);
		//i = 10 j = 5
		
		if (i < 5 & j++ < 10)
			System.out.println("& vrai");
		//
		else
			System.out.println("& faux");
		//& faux
		System.out.println("i = " + i + "  j = " + j);
		//i = 10 j = 6
		
		if (i < 15 && j++ < 10)
			System.out.println("&&2 vrai");
		//&&2 vrai
		else
			System.out.println("&&2 faux");
		//
		System.out.println("i = " + i + "  j = " + j);
		//i = 10 j = 7
		
		if (i < 15 || j++ < 10)
			System.out.println("|| vrai");
		//|| vrai
		else
			System.out.println("|| faux");
		//
		System.out.println("i = " + i + "  j = " + j);
		//i = 10 j = 7
	}

}
