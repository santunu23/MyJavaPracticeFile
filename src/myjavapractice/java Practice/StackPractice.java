package DataStructre;

import java.util.Stack;

class StackPractice{
    public void myStac(int num){
     Stack<Integer> myStack=new Stack<Integer>();
         int count=0;
         while(num>0){
           myStack.push(num);
           count++;
         }
         //Display stack data 
         
         while(!(myStack.isEmpty())){
             System.out.print(myStack.pop()+"\n"); 
         
         }
    }
    
    public static void main(String[] args) {
      StackPractice stPr=new StackPractice();
      stPr.myStac(40);
    }
}