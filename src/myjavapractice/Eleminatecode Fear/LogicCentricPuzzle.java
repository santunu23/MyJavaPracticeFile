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
/* Puzzle 01. 
  You are driving a little too fast and police officer stops you.
  Write code to compute the find you would have to pay.
If your speed is 60 or less the result is 0 since there is no fine.
If speed is between 61 and 80 and 80 inclusive the find is 100 dolars.
If speed is 81 or more the resule is 200.
Unless it is a holiday on that day your speed can be 5 higher in all cases.
  Expectation 
   speedingFine(60,false)
   speedingFine(65,false)
   speedingFine(65,true)
*/


public class LogicCentricPuzzle {
    public static void main(String[] args){
         System.out.println(speedingfine(60, false));
         System.out.println(speedingfine(65, false));
         System.out.println(speedingfine(65, true));
        
    } 
    
    public static int speedingfine(int speed,boolean holiday){
      
        if(holiday==false){
          if(speed<=60){
          return 0;
          }else if(speed>=61 && speed<=80){
              return 100;
          }else if(speed>81){
          return 200;
          }
        }else{
        if(speed<=65){
          return 0;
          }else if(speed>=66 && speed<=85){
              return 100;
          }else if(speed>86){
          return 200;
          }
        }
      
       return 0;
    }
    
}
