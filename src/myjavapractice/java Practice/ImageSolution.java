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
public class ImageSolution {
    /*
      1)Write a program that will ask the user to enter a number and print all the numbers in a single line
    */
//       public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//           System.out.println("Enter your number : ");
//        int a=sc.nextInt();
//        for(int i=1;i<a;i++){
//         System.out.print(i+",");
//}
//    }
        //2)Write a program that will ask user to enter a number n,then sum all the numbers from 1 to n
//         public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//             System.out.println("Enter your number : ");
//          int a=sc.nextInt();
//          int number=0;
//          for(int i=1;i<a;i++){
//            number+=i;
//          }
//             System.out.println("Result of the sum from 1 to n is : "+number);
//    }
        
    /*
       3)Write a program that will ask user to enter a number n,find all the even number from 1 to n.example 
       user input 10,the program should print 2,4,6,8,10.
    */
//           public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter the number ");
//            int a=sc.nextInt();
//            int number=0;
//            for(int i=0;i<a;i++){
//              if(i%2==0){
//                System.out.print(i+",");
//             }
//            }
//    }
    /*
      4) Write a program which is ask user to pass a number,after then find all the odd number 1 to n,example 
         user pass 10 then the odd number is 1,3,5,7
    */
    
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int a=sc.nextInt();
//        for(int i=0;i<a;i++){
//          if(i%2!=0){
//          System.out.println(i);
//          }
//        }
//    }
    
    /*
      5) Write a program which is help you to sort out the factorial number of the user input.
    */
    
//         public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//             System.out.println("Enter your factorial number ");
//          int a=sc.nextInt();
//          int fact=1;
//          for(int i=1;i<=a;i++){
//             fact*=i;
//          }
//             System.out.println(fact);
//        }
    
    //Recurtion method 
//    static int ImageSolution(int n){
//    if(n==0)
//        return 1;
//    else 
//        return (n*ImageSolution(n-1));
//    }
//       public static void main(String[] args) {
//           int fact=1;
//           int number=4;
//           fact=ImageSolution(number);
//           System.out.println(fact);
//       }
 
    /*
       6) Write a program that will compute for and display the sum of all number which is divided by 3 from 1 to 1000
    */
       
//      public static void main(String[] args) {
//        for(int i=1;i<1000;i++){
//          if(i%3==0){
//           System.out.print(i+",");
//          }
//        }
//    } 
    /*
      7) Write a program that will ask the user to enter a number,then find factorial of this number.
    */
//       public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("The number is ");
//         int a=sc.nextInt();
//        for(int i=1;i<a;++i){
//         if(a%i==0){
//             System.out.println("The factorial is "+i);
//         }
//         
//        }
//    }
    /*
     8)Write a program that will accept a number n and display the sum of all even numbers and all the odd numbers
       1 to n
    */
    
//      public static void main(String[] args) {
//           int evenNumber=0;
//           int oddNumber=0;
//          for(int i=1;i<=10;i++){
//             if(i%2==0){
//                 evenNumber+=i;
//             }else{
//                 oddNumber+=i;
//             }
//          }
//          System.out.println("Print all the even numbers are : "+evenNumber);
//          System.out.println("Print the odd numbers are : "+oddNumber);
//    }

     /*
        9)Write a program that will display the following pattern,given the value of n.
        Example if n=4 then 
          *
          **
          ***
          ****  
    */
       
//         public static void main(String[] args) {
//             
//             for(int i=1;i<=4;i++){
//                 for(int j=1;j<=i;j++){
//                 System.out.print("*");
//                 }
//                 System.out.println("");
//             }
//                
//            }
       
           
           

}
