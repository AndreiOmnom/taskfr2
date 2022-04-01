//package com.company;

//import java.util.Scanner;

//public class Main {

    //public static void main(String[] args) {
    //    Scanner  scanner = new Scanner(System.in);
    //    Scanner scanner1 = new Scanner(System.in);
     //   int scanner = ;
      //  int scanner1;

      //      int cifralast = scanner.nextInt()  ;
       //     int cifralast1 = scanner1.nextInt()  ;
      // while (scanner.hasNextInt()) {
          //     int scanner   =  cifralast / 10;
          //  int scanner1  = scanner1.nextInt() / 10;
          //  int point = 0;
           //  point = cifralast + cifralast1 - 2;
           //     System.out.print(point);
           //     point = 0;
           //     cifralast = 0;
            //56    cifralast1 = 0;
             //   break;
          //  }

          //  }
     //   }

  //      while (scanner.hasNextInt()){
  //          int temp = scanner.nextInt();
  //          if (temp == 0){
  //              System.out.println(counter);
  //              break;
  //          } else {
  //              counter++;
  //         }
   //     }
  //  }
//}
package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int chislo1 = scanner1.nextInt();
        int chislo2 = scanner2.nextInt();


        int last1 = chislo1 % 10;
        int last2 = chislo2 % 10;
        chislo1 = chislo1 / 10;
        chislo2 = chislo2 / 10;


        if (last2 > 2) ;
        {
            int point = 0;
            point = last1 + last2 - 2;
            System.out.print(point);
            last1 = 0;
            last2 = 0;
        }

        if (last2 <= 2) ;
        {
            int point = 0;
            point = last1 + last2;

            System.out.print(point);
            last1 = 0;
            last2 = 0;

        }
        chislo1 = chislo1 / 10;
        chislo2 = chislo2 / 10;
    }

}


          //  chislo1  =  chislo1 / 10;
          //  chislo2   =  chislo2 / 10;
          //  break;
          //  }
           // length = length - 1;
       // }


//*    int number  = 54734;
//    int cifrmax = number % 10;
//   int cifrmin =number % 10;
 //           number = number /10;
 //                   while ( number > 0) {
 //                   int cifrlast = number % 10;
//                    if (cifrlast <  cifrmin) {
 //       cifrmin = cifrlast;
 //       }
 //       cifrmax = cifrlast;
 //       }
 //       number = number / 10;
  //      }
 //*       System.out.println("min=" + cifrmin + " max=" +cifrmax);