
public class Exercice015
{ public static void main(String[] args)
  { int n=0 ;
    do
    { if (n%2==0) { System.out.println (n + " est pair") ;
                    n += 3 ;
                    continue ;
                  }
      if (n%3==0) { System.out.println (n + " est multiple de 3") ;
                    n += 5 ;
                  }
      if (n%5==0) { System.out.println (n + " est multiple de 5") ;
                    break ;
                  }
      n += 1 ;
    }
    while (true) ;
  }
}

/*
 * 0 est pair
 * 3 est multiple de 3
 * 9 est multiple de 3
 * 15 est multiple de 3
 * 20 est multiple de 5
*/