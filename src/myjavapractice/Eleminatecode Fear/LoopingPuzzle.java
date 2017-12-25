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
public class LoopingPuzzle {
    /**
     * Given a string  return a string where for every char in the original append twice.****/
    public static void main(String[] args){
        System.out.println(repeatChar("The"));//"TThhee"
        System.out.println(repeatChar("AAbb"));//"AAAAbbbb"
        System.out.println(repeatChar("Hi-There"));//HHii-TThheerree
         }
    
    public static String repeatChar(String str){
       String result="";
       for(int i=0;i<str.length();i++){
       char aChar=str.charAt(i);
       result=result+aChar+aChar;
        
       }
       return result;
    }
    
}
