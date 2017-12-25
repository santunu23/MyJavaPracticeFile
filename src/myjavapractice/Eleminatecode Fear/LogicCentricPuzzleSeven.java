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
public class LogicCentricPuzzleSeven {
      
    /*
      Given 3 int arguments a,b,c return their sum,However if one of the arguments is 13 then id does not count toward 
      the sum and arguments to it's right do not count either.So for example if b is 13 then both b and c do not count.
    */
    public static void main(String[] args){
          System.out.println(partialSum(1, 2, 3));   //6 3 1
          System.out.println(partialSum(1, 2, 13));
          System.out.println(partialSum(1, 13, 3));
    }
    
    public static int partialSum(int a,int b,int c){
        if(a==13){
        return c;}else if(b==13){
        return a;}else if(c==13){
        return a+b;}else{
        return a+b+c;
        }
        
    }
    
}
