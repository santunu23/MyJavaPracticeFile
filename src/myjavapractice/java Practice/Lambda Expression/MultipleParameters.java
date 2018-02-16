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
interface Addable{
int add(int a,int b);
}
public class MultipleParameters {
    public static void main(String[] args) {
    Addable ad=(a,b)->(a+b);
    System.out.println(ad.add(10,20));    
    //Pass parameters with data type 
    Addable ad2=(a,b)->(a+b);
        System.out.println(ad2.add(10, 30));
    }
}
