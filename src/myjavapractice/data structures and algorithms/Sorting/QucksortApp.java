/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author Santunu23
 */
public class QucksortApp {
    public static void main(String[] args){
       int[] inputArray={12,81,74,43,1098,0,8,92,754,912,0,6,4};
        quicksort(inputArray,0,inputArray.length-1);
        System.out.println(Arrays.toString(inputArray));
    }
    public static void quicksort(int [] inputArray,int start,int end){
    if(start<end){
    int pp=partition(inputArray, start, end);
        quicksort(inputArray, start, pp-1);
        quicksort(inputArray, pp+1, end);
    }
    }
public static int partition(int[] inputArray,int start,int end){
    int pivot=inputArray[end];
    int i=start-1;
    for(int j=start;j<=end-1;j++){
    if(inputArray[j]<=pivot){
    i++;
    //We are swapping below
    int ival=inputArray[i];
    int jval=inputArray[j];
    inputArray[i]=jval;
    inputArray[j]=ival;
    }
    }
    //put the pivot value in the correct slot next
    int ival=inputArray[i+1];
    inputArray[end]=ival;
    inputArray[i+1]=pivot;  //here pivot value is placed in the correct slot of the array
    return i+1;
}
}