/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavapractice;

import java.util.Stack;

/**
 *
 * @author Santunu23
 */
public class DescimaltoBinary {
    public static void main(String[] args){
//    int[] myArr=new int[40];
//    int a=10;
//    int index=0;
//    while(true){
//        if(a==0){
//        break;}else{
//    myArr[index++]=a%2;
//    a=a/2;
//        }
//}
//    for(int i=index-1;i>=0;i--){
//        System.out.print(myArr[i]);
//    }

 /*
  Convert Decimal into binary using stack
*/
 
 Stack<Integer> MyStack=new Stack<Integer>();
 int a=10;
 int index=0;
 while(true){
    if(a==0){
    break;}else{
        index=a%2;
      MyStack.push(index);
      a=a/2;
    }
 }
 
 while(!MyStack.isEmpty()){
     System.out.print(MyStack.pop());
 }
 
 
    }
    
}
