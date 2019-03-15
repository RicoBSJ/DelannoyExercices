
class Black
{ public Black (int abs, int ord)      { x = abs ;  y = ord ; }
  public void deplace (int dx, int dy) { x += dx ;  y += dy ; }
  
  public void afficheAbs () {
	  System.out.println ("Je suis un point d'abscisses " + x) ;
  }
  public void afficheOrd () {
	  System.out.println ("Je suis un point de coordonnees " + y) ;
  }
  
//  public void affiche ()
//  { System.out.println ("Je suis un point de coordonnees " + x + " " + y) ;
//  }
  private double x ;   // abscisse
  private double y ;   // ordonnee
}
public class Exercice027b
{ public static void main (String args[])
  { Black a ;
    a = new Black(3, 5) ;        a.afficheAbs() ;a.afficheOrd();
    a.deplace(2, 0) ;            a.afficheAbs() ;a.afficheOrd();
    Black b = new Black(6, 8) ;  b.afficheAbs() ;b.afficheOrd();
  }
}
/*
 * Je suis un point de coordonnees 3.0 5.0
 * Je suis un point de coordonnees 5.0 5.0
 * Je suis un point de coordonnees 6.0 8.0
 */