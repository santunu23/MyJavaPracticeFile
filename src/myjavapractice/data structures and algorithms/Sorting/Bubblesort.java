/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContestAlgorithm.Sorting;

/**
 *
 * @author Santunu23
 * 
 * https://www.geeksforgeeks.org/bubble-sort/
 * 
 */
public class Bubblesort {
    public static void main(String[] args) {
        int[] myArray=new int[]{4,5,2,8,3};
        int temp=0;
        for(int i=1;i<=myArray.length;i++){
        for(int j=1;j<myArray.length;j++){
        if(myArray[j-1]>myArray[j]){
          temp=myArray[j];
          myArray[j]=myArray[j-1];
          myArray[j-1]=temp;
        }
        }
        }
        
        for(int d=0;d<myArray.length;d++){
            System.out.println("Bubble sorted list are  "+myArray[d]);
        }
        
        
        
    }
    
}
