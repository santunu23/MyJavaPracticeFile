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
public class Createaninfinityloop {
    
    public static void main(String[] args){
    //We can create infinity loop by using for and while loop 
    int i=0;
// 1)   for(;;){
//        i++;
//    System.out.println(i);
//    }

//2)Another way to create infinity loop by using while loop
      while(true){
          i++;
          System.out.println(i);
      }
    
    }
    
}
