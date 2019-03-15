
public class Exercice013 {
	public static void main(String[] args) {
		int n = 0;
		{
			do
				n++;
			while (n < 10); // il manque le ;
		}
		{
			do
				; while ((n = Clavier.lireInt()) != 10);
			// Pas d'instructions après le do
		}
		{
			do
				; while (true); // Boucle infinie
		}
//		{
//		do
//			; while (false); // False ne sert à rien
//		}
	}
}