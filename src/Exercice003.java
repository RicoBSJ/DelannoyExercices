
public class Exercice003 {
	public static void main(String args[]) {

		double x1 = 1e200, x2 = 1e210;
		double y, z;
		y = x1 * x2;
		System.out.println("valeur de y " + y);
		//valeur de y Infinity

		x2 = x1;
		z = y / (x2 - x1);
		System.out.println(y + " divise par " + (x2 - x1) + " = " + z);
		//Infinity divise par 0.0 = Infinity
		y = 15;
		z = y / (x2 - x1);
		System.out.println(y + " divise par " + (x2 - x1) + " = " + z);
		//15.0 divise par 0.0 = Infinity
		z = (x2 - x1) / (x2 - x1);
		System.out.println((x2 - x1) + " divise par " + (x2 - x1) + " = " + z);
		//0.0 divise par 0.0 = NaN
		System.out.println(z + "+1 = " + (z + 1));
		//NaN+1 = NaN
		x1 = Float.POSITIVE_INFINITY;
		x2 = Double.NEGATIVE_INFINITY;
		z = x1 / x2;
		System.out.println(x1 + "/" + x2 + " = " + z);
		Clavier.lireInt();
		//Infinity/-Infinity = NaN
	}
}