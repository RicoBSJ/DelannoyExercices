class Brown
{ public Brown (int abs, int ord)      { x = abs ;  y = ord ; }
  public void affiche ()
  { System.out.println ("Coordonnees " + x + " " + y) ;
  }
  public Brown MaxNorme (Brown b)
  { double na = x*x + y*y ;    // ou encore this.x*this.x + this.y*this.y
    double nb = b.x*b.x + b.y*b.y ;
    if (na>nb) return this ;
          else return b ;
  }
  private double x ;   // abscisse
  private double y ;   // ordonnee
}
public class Exercice038b
{ public static void main (String args[])
  { Brown p1 = new Brown (2, 5) ; System.out.print ("p1 : ") ; p1.affiche() ;
  	Brown p2 = new Brown (3, 1) ; System.out.print ("p2 : ") ; p2.affiche() ;
  	Brown p = p1.MaxNorme (p2) ;  // ou p2.maxNorme(p1)
    System.out.print ("Max de p1 et p2 : ") ; p.affiche() ;
  }
}

