/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavapractice;

import java.util.Scanner;

/**
 *
 * @author Santunu23
 */




public class Numberpattern {
    public static void main(String[] args) {

/*
    Pattern 1)
                1
                12
                123
                1234
                12345
                123456
                1234567        
 */    

//       for(int i=1;i<7;i++){
//       for(int j=1;j<=i;j++){
//           System.out.print(j);
//       }
//           System.out.println("");
//       }

   /* Pattern 2)
                  1
                  2 2
                  3 3 3
                  4 4 4 4
                  5 5 5 5 5
                  6 6 6 6 6 6
                  7 7 7 7 7 7 7
*/
   
//     for(int i=1;i<=7;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(i);
//         }
//         System.out.println();
//     }

  /* Pattern 3)
                 1
                 1 2
                 1 2 3
                 1 2 3 4
                 1 2 3 4 5
                 1 2 3 4 5 6
                 1 2 3 4 5 6 7
                 1 2 3 4 5 6
                 1 2 3 4 5
                 1 2 3 4
                 1 2 3
                 1 2
                 1
*/

//            for(int i=1;i<=7;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//                System.out.println("");
//            }
//            for(int i=6;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//                System.out.println("");
//            }
           
 
       /*
        Pattern 5 :
                    7 6 5 4 3 2 1
                    7 6 5 4 3 2
                    7 6 5 4 3
                    7 6 5 4
                    7 6 5
                    7 6
                    7
*/
       
       for(int i=1;i<=7;i++){
           for(int j=7;j>=i;j--){
               System.out.print(j);
           }
           System.out.println();
       }
       
       
       
       
       
       
       
       
       
       /*
          1
          12
          123
          1234
       */
//   for(int i=1;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//       System.out.println("");
//   }
       
/*
   4321
   432
   43
   4
*/
//for(int i=0;i<=4;i++){
//    for(int j=4;j>i;j--){
//        System.out.print(j);
//    }
//System.out.println("");
//}
 
   /*
     *..
     **.
     ***
   */
    
//     for(int i=1;i<=3;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println("");
//     }

        /*
         ***
         .**
         ..*

         */
//       for(int i=3;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             if(i==2&&j==1){
//                 System.out.print(" *");
//             }else if(i==1&&j==1){
//                 System.out.print("  *");
//             }
//             else{
//             System.out.print("*");
//             }
//         }
//         System.out.println("");
//     }

        /*
            ..*..
            .***.
            *****
        */
       
//        for(int i=1;i<=3;i++){
//            for(int j=1;j<=5;j++){
//                if(i==1&&j==1||i==1&&j==2||i==1&&j==4||i==1&&j==5){
//                    System.out.print(" ");
//                }else if(i==2&&j==1||i==2&&j==5){
//                    System.out.print(" ");
//                }
//                else{
//                System.out.print("*");
//            }
//            }
//            System.out.println("");
//        } 
        
           /*
             12321
              121
               1
           */
//    for(int i=1;i<=3;i++){
//        if(i==1){
//        for(int j=1;j<=3;j++){
//            System.out.print(j);
//        }
//        }else if(i==2){
//          for(int j=1;j<2;j++){
//            System.out.print(j);
//        }
//        }else if(i==3){
//        System.out.println(1);
//        }
//        
//        if(i==1||i==2){
//        System.out.println(21);
//    }
//    }
/*
  Find out prime number 

*/

//Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your number ");
//int a=sc.nextInt();
//for(int i=1;i<=10;i++){
//  
//        if(a%i==0){
//            System.out.println("This is not prime number");
//            break;
//        }else if(a%a==0){
//            System.out.println("This is a prime number");
//            break;
//        } 
//        else{
//            System.out.println("This is prime number");
//           break;
//        }
//  
//}
    }
    
}
