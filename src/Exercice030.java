class PointOrigine
{ public PointOrigine (int xx) { x = xx ; }
  public void affiche ()
  { System.out.println ("abscisse = " + (x-origine)) ;
    System.out.println ("   relative a une origine d'abscisse " + origine) ;
  }
  public static void setOrigine (int org) { origine = org ;  }
  public static int getOrigine()          { return origine ; }
  private static int origine ;   // abscisse absolue de l'origine courante
  private int x ;                // abscisse absolue du point
}
public class Exercice030
{ public static void main (String args[])
  { PointOrigine a = new PointOrigine (3) ;
  	System.out.print ("Point a - ") ;
  	a.affiche() ;
  	PointOrigine b = new PointOrigine (12) ;
  	System.out.print ("Point b - ") ;
  	b.affiche() ;
  	PointOrigine.setOrigine(3) ;
    System.out.println ("On place l'origine en " + PointOrigine.getOrigine()) ;
    System.out.print ("Point a - ") ;
    a.affiche() ;
    System.out.print ("Point b - ") ;
    b.affiche() ;
  }
}
