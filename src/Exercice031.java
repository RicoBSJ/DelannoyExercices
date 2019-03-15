class IdentA
{ public IdentA ()
  { numCour++ ;
	num = numCour ;
  }
  public int getIdent()
  { return num ;
  }
  public static int getIdentMax()
  { return numCour ;
  }
  private static int numCour = 0 ;   // prochain numéro à attribuer
  private int num ;              // numéro de l'objet

}
public class Exercice031
{ public static void main (String args[])
  { IdentA a = new IdentA(), b = new IdentA() ;
    System.out.println ("numero de a : " + a.getIdent()) ;
    System.out.println ("numero de b : " + b.getIdent()) ;
    System.out.println ("dernier numero " + IdentA.getIdentMax()) ;
    IdentA c = new IdentA() ;
    System.out.println ("dernier numero " + IdentA.getIdentMax()) ;
  }
}


