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
public class LoopingPuzzleFour {
    /**
     * Given 2 arrays that are the same length containing strings,compare the 1st String 
     * in one array to the 1st string in the other array,the 2nd to the 2nd and so on.
     * Count the number of times that the 2 strings are non-empty and start with the same char
     * The strings may be any length including 0.
     * 
     * Expectations 
     * matchingChar({"aa","bb","cc"},{"aaa","xx","bb"})   ->1
     * matchingChar({"aa","bb","cc"},{"aaa","b","bb"})    ->2
     * matchingChar({"aa","bb","cc"},{"","","bb"})        ->1
     **/
    
    public static void main(String[] args){
        String[] myArray1=new String[]{"aa","ba","cc"};
        String[] myArray2=new String[]{"aaa","xx","bb"};
        System.out.println(matchingChar(myArray1,myArray2));
    }
    public static int matchingChar(String[] arg1,String[] arg2){
       int count=0;
        for(int i=0;i<arg1.length;i++){
        String a=arg1[i];
        String b=arg2[i];
        if(a.charAt(0)==b.charAt(0)){
        count++;
        }
    }
    return count;
    }
    
}