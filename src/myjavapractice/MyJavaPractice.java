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
public class MyJavaPractice {
    
    public static void main(String[] args){
       System.out.println(HelloString("Zabra"));
    }
    
     public static String HelloString(String name){
         if(name.length()<=1){
         return name;
         }else{
         return name.charAt(0)+"$"+HelloString(name.substring(1));
         }
     }
   
    
}
