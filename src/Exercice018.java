
public class Exercice018
{ public static void main (String[] args)
  { int i, n ;

//    for (i=0, n=0 ; i<5 ; i++) n++ ;
//    System.out.println ("A : i = " + i + ", n = " + n) ;
    /*
     * A : i = 1 , n = 1
     * A : i = 2 , n = 2
     * A : i = 3 , n = 3
     * A : i = 4 , n = 4
     * A : i = 5 , n = 5
     */
//    for (i=0, n=0 ; i<5 ; i++, n++) {}
//    System.out.println ("B : i = " + i + ", n = " + n) ;
    /*
     * A : i = 1 , n = 1
     * A : i = 2 , n = 2
     * A : i = 3 , n = 3
     * A : i = 4 , n = 4
     * A : i = 5 , n = 5
     */
//    for (i=0, n=50 ; n>10 ; i++, n-= i ) {}
//    System.out.println ("C : i = " + i + ", n = " + n) ;
    /*
     * 1 - 49
     * 2 - 47
     * 3 - 44
     * 4 - 40
     * 5 - 35
     * 6 - 29
     * 7 - 22
     * 8 - 14
     * 9 - 5
     */
    for (i=0, n=0 ;
      i<3 ; i++, n+=i, System.out.println ("D : i = " + i + ", n = " + n)) ;
    System.out.println ("E : i = " + i + ", n = " + n) ;
    /*
     * 1 - 1
     * 2 - 3
     * 3 - 6
     */
  }
}
