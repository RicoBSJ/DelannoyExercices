
public class Exercice017
{ public static void main(String[] args)
  { int n, p ;

//    n=p=0 ;
//    while (n<5) n+=2 ; p++ ;
//    System.out.println ("A : n = " + n + ", p = " + p) ;
    /*
     * n+=2; p++;
     * 2; 0;
     * 4; 1;
     * 6;
     * A : n = 6, p = 1
     */
    n=p=0 ;
    while (n<5) { n+=2 ; p++ ; }
    System.out.println ("B : n = " + n + ", p = " + p) ;
    /*
     * B : n = 6, p = 3
     */
  }
}