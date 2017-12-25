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
public class LoopingPuzzletwo {
    /**
     * Return a version of the given string where for every star(*) in the string the star and the 
     * char immediately to its left and right are gone.So ab*cd yields "ad" and "ab**cd" also yields "ad".
     * Expectations 
     * startKill("cd*zq") //"cq"
     * startKill("ab**cd") //""ad
     * startKill("wacy*xko")//wacko
     **/

   public static void main(String[] args){
       System.out.println(starKill("cd*zq"));
       System.out.println(starKill("ab**cd"));
       System.out.println(starKill("wacy*xko"));
   }
   public static String starKill(String str){
       String result="";
   for(int i=0;i<str.length();i++){
       if(i==0 && str.charAt(i) !='*')
            result+=str.charAt(i);
       if (i>0 && str.charAt(i) !='*' && str.charAt(i-1)!='*') 
           result +=str.charAt(i);
       if(i>0 && str.charAt(i)=='*' && str.charAt(i-1) !='*')
           result=result.substring(0, result.length()-1);
       
           }
   return result;
   }
//     String result="";
//      for(int i=0;i<str.length();i++){
//          if(i==0 && str.charAt(i) !='*'){
//            result +=str.charAt(i);
//          }
//          if(i>0 && str.charAt(i) !='*' && str.charAt(i-1)!='*'){
//              result+=str.charAt(i);
//          }
//          if(i>0 && str.charAt(i)=='*' && str.charAt(i-1) !='*'){
//              result=result.substring(0,result.length()-1);
//         }
//      }   
//      return result;
//   }
}
