/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpression;

import java.util.ArrayList;

/**
 *
 * @author Santunu23
 */
public class LambaForeach {
    public static void main(String[] args) {
       ArrayList<String> list=new ArrayList<String>(); 
         list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");
        
        list.forEach((n)->System.out.println(n)
        );
     
    }
 }
