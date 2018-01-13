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
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=sc.nextInt();
         int count=0;
          for(int i=1;i<=10;i++){
          if(a%i==0){
          count++;
          }
          }
          if(count==2){
          System.out.println("This is a prime number");
          }else{
          System.out.println("Not a prime number");
          }
        
        
        
    }
}
