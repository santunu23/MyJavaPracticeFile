/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpression;

/**
 *
 * @author Santunu23
 */
interface Mydata{
public int  add(int a,int b);
}
public class Withwithoutreturnstae {
    public static void main(String[] args) {
        //Lambda expression without return statement 
        Addable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10, 20));
        //Lambda expresson with return statement
        Addable ad2=(int a,int b)->{
        return (a+b);
        };
        System.out.println(ad2.add(10, 30));
        
    }
}
