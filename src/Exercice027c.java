class White
{ public White (int abs, int ord)      { x = abs ;  y = ord ; }
  public void deplace (int dx, int dy) { x += dx ;  y += dy ; }
  public double abscisse () { return x ; }
  public double ordonnee () { return y ; }
  private double x ;   // abscisse
  private double y ;   // ordonnee
}
public class Exercice027c
{ public static void main (String args[])
  { White a ;
    a = new White(3, 5) ;
    System.out.println ("Je suis un point de coordonnees "
                        + a.abscisse() + " " + a.ordonnee()) ;
    a.deplace(2, 0) ;
    System.out.println ("Je suis un point de coordonnees "
                        + a.abscisse() + " " + a.ordonnee()) ;
    White b = new White(6, 8) ;
    System.out.println ("Je suis un point de coordonnees "
                        + b.abscisse() + " " + b.ordonnee()) ;
  }
}