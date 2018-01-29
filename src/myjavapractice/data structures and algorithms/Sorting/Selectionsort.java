/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContestAlgorithm.Sorting;

import java.util.Scanner;
/**
 * @author Santunu23
 * 
 */
public class Selectionsort {
    public static void main(String[] args){
     int[] myArray=new int[]{7,8,5,4,9,2};
        for(int i=0;i<myArray.length;i++){
         for(int j=i+1;j<myArray.length;j++){
                     if(myArray[i]>myArray[j]){
                     int temp;
                     temp=myArray[j];
                     myArray[j]=myArray[i];
                     myArray[i]=temp;
                     }     
         }
    }
     
//        int i,j,minValue,minIndex,temp=0;
//        for(i=0;i<myArray.length;i++){
//            minValue=myArray[i];
//            minIndex=i;
//            for(j=i;j<myArray.length;j++){
//               if(myArray[j]<minValue){
//                minValue=myArray[j];
//                minIndex=j;
//               }
//            }
//            if(minValue<myArray[i]){
//                /*Swaping */
//            temp=myArray[i];
//            myArray[i]=myArray[minIndex];
//            myArray[minIndex]=temp;
//            }
//        }
        
        for(int k=0;k<myArray.length;k++){
            System.out.print(myArray[k]);    
       }
    }
    
}
