/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eleminatecodefear;

/**
 *
 * @author Santunu23
 */
public class LogicCentricPuzzlefive {
    
 /**
  * Given an int n,return the string form of the number followed by "!",So,if the int is for example 13 this method
  * should return "13!".However the catch is that if the number is divisible by 3 the method should return "Fizz!" 
  * and if divisible by both 3 and 5 use "FizzBuzz!".You'll need the use the "%" "mod" for computing the 
  * remainder after division so 23% 10 yields 3
  * 
  *     Expectations 
  *      fizzyWizzy(1)->1!
  *      fizzyWizzy(2)->2!
  *      fizzyWizzy(3)-->"Fizz"***/
    
    
    public static void main(String[] args){
        System.out.println(FizzBuzz(1));
        System.out.println(FizzBuzz(2));
        System.out.println(FizzBuzz(3));
    }
    
    public static String FizzBuzz(int n){
        boolean fizz=n%3==0;
        boolean buzz=n%5==0;
        
        if(fizz&&buzz){return "FizzBuzz";}
        if(fizz){return "Fizz!";}
        if(buzz){return "Buzz";}
        return n+"!";
        
        
         }
}
