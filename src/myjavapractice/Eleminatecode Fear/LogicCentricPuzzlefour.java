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
public class LogicCentricPuzzlefour {
    /**
     * We'll say a number isCool if it's a multiple of 11 or if it
      one more than a multiple of 11.Return true if the given non-negative number is cool.Use the '%' 'modulus' 
      operator we spoke about in the prerequisite section.Which the lesson on modulus if you need to review.
      isCool(22)
      isCool(23)
      isCool(24)***/
    
    public static void main(String[] args){
      System.out.println(isCool(22));
      System.out.println(isCool(23));
      System.out.println(isCool(24));
      
    }
    
    public static boolean isCool(int n){
    if(n%11==0){
    return true;
    }
        return false;
    
    }
      
    
    
}
