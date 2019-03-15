class Red
{ public Red (int abs, int ord)      { x = abs ;  y = ord ; }
  public void affiche ()
  { System.out.println ("Coordonnees " + x + " " + y) ;
  }
  public static Red MaxNorme (Red a, Red b)
  { double na = a.x*a.x + a.y*a.y ;
    double nb = b.x*b.x + b.y*b.y ;
    if (na>nb) return a ;
          else return b ;
  }
  private double x ;   // abscisse
  private double y ;   // ordonnee
}
public class Exercice038a
{ public static void main (String args[])
  { Red p1 = new Red (2, 5) ; System.out.print (" p1 : ") ; p1.affiche() ;
  	Red p2 = new Red (3, 1) ; System.out.print (" p2 : ") ; p2.affiche() ;
  	Red p = Red.MaxNorme (p1, p2) ;
    System.out.print ("Max de p1 et p2 : ") ; p.affiche() ;
  }
}

