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
public class LoopingPuzzleFive {
    /**
     * Given a string,return the length of the largest stack  of the same char in the string
     * 
     * Expectation 
     * LongestStreak("hayyeu")
     * LongestStreak("XPNzzzddOOOxx")
     * LongestStreak("")
     * 
     **/
public static void main(String[] args){
      System.out.println(LongestStreak("hayyeu"));
      System.out.println(LongestStreak("XPNzzzddOOOxx"));
      System.out.println(LongestStreak(""));
    }
    
public static int LongestStreak(String str){
    int max=0;
    for(int i=0;i<str.length();i++){
       int count=0;
       for(int j=i;j<str.length();j++){
       if(str.charAt(i)==str.charAt(j)){
       count++;
       }
       }
       if(count>max){
       max=count;}
    }
return max;
}
}