package Eleminatecodefear;

import java.util.ArrayList;
/**
 *
 * @author Santunu23
 */
public class LoopingPuzzlethree {
    /**
     * Given an array of strings,return the count of the number of strings with the given length.
     * Expectations 
     * wordsCount({"a","bb","b","ccc"},1)  -> 2
     * wordsCount({"a","bb","b","ccc"},3)  ->1
     * wordsCount({"a","bb","b","ccc"},4)  ->0
     * 
     * 
     **/
    public static void main(String[] args){
        String[] Kantam=new String[]{"a","bb","b","ccc"};
        System.out.println(wordCount(Kantam,1));
    }
    public static int wordCount(String[] words,int len){
          int count=0;
           for(int i=0;i<words.length;i++){
           if(words[i].length()==len){
           count++;
           }
           }
           return count;
    }
}
