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
public class ConditionExercise {
    
    /*We have a loud barking dog.The "hour paramerter" is the current hour time in the range 0....23.
    We are in trouble if the dog is barking and the hour is before 7 or after 20 return true if we are in trouble"*/
    
    public static void main(String[] args){ 
        boolean barking=true;
      System.out.println(dogTrouble(true,6));  //true
         System.out.println(dogTrouble(true,7)); //false
         System.out.println(dogTrouble(false,6)); //false
         
    }
    public static Boolean dogTrouble(boolean barking,int hour){
          if(hour<7 || hour>20){
           return false;
          }else{
          return true;
          }
       
          
    }
}