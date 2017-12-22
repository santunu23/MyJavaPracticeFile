/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavapractice;

/**
 *
 * @author Santunu23
 */
public class RecurnationMethod {
    public static void main(String[] args){
      System.out.println(MymethodString("Zabra"));
      System.out.println(MymethodString("Cobra"));
    }
    
    public static String MymethodString(String name){
       if(name.length()<=2){
       return  name;
       }else{
       return name.charAt(0)+"$"+MymethodString(name.substring(1));
       }
    
    }
}
