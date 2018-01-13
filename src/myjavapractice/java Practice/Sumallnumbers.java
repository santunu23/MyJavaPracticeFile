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
public class Sumallnumbers {
    /*
        Ask a digit from user and then sum all of it's data.
    */
    
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number");
    int a=sc.nextInt();
    int number=0;
    for(int i=1;i<a;i++){
    number+=i;
    }
    System.out.println(number);
    }
    
}
