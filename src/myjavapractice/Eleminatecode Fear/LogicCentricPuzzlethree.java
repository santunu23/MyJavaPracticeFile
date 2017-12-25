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
public class LogicCentricPuzzlethree {
    /**
     * Given three ints,first,second,third return true if second is greater than first and third is greater than
     * second.However,with the exception that if the parameter 'itsOk' is true 
     * scond does not need to be greater than first but still better be less than third 
     * 
     * Expectations 
     * isOrdered(1,2,4,false)->true
     * isOrdered(1,2,1,false)->false
     * isOrdered(1,1,2,true)->trues
     **/
    public static void main(String[] args){
      
        System.out.println(isOrdered(1, 2, 4, false));
        System.out.println(isOrdered(1, 2, 1, false));
        System.out.println(isOrdered(1, 1, 2, true));
        
        
    }
    
      public static boolean isOrdered(int first,int second,int third,boolean itsOk){
      if(itsOk==false&&second>first && third>second){
      return true;
      }else{
         if(third>second){
         return true;}
         else{
         return false;}}
      
      }
    
    
    
    
    
    
}
      
