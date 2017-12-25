package Eleminatecodefear;

import java.util.ArrayList;

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
    public static void main(String[] args){
//        System.out.println(sumUnique(1,2,3));
//        System.out.println(sumUnique(3,2,3)); //2
//        System.out.println(sumUnique(3,3,3));

        int[] myArray=new int[]{3,2,3};
        for(int i=0;i<myArray.length;i++){
        ArrayList myarraylist=new ArrayList();
        myarraylist.add(myArray[i]);
        System.out.println(myarraylist);
    }
    
//    public static int sumUnique(int a,int b,int c){
//        return 0;
//    }
    
}
}