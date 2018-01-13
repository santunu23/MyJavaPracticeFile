package Eleminatecodefear;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 *
 * @author Santunu23
 */
/** 
 * Given 3 int arguments a,b,c return their sum.However,if one of the arguments is the same as any 
 * of the other ones,that number should not count towards the sum.So basically your only sum unique numbers,not duplicate.
 * 
 * Expectation
 * sumUnique(1,2,3)
 * sumUnique(3,2,3)
 * sumUnique(3,3,3)
 * 
 */
 
public class Assignment08 {
    public static Integer sumUnique(int a,int b,int c){
           int[] myArray=new int[]{a,b,c};
           int sum=0;
           
            LinkedHashSet<Integer> myArrayList=new LinkedHashSet<Integer>();
           for(int i=0;i<myArray.length;i++){
            myArrayList.add(myArray[i]);
           }
           for(int k:myArrayList){
           sum+=k;
           }
       return sum;
    }
    
    public static void main(String[] args){
        System.out.println(sumUnique(1,2,3));
        System.out.println(sumUnique(3,2,3)); //2
        System.out.println(sumUnique(3,3,3));
    }
}
