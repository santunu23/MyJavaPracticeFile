/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

/**
 *
 * @author Santunu23
 */
public class Margesort {
    public static void sort(int inputArray[]){
        sort(inputArray,0,inputArray.length-1);
    }
    public static void sort(int[] inputArray,int start,int end){
    if(end<=start){
        return;
    }
    int mid=(start+end)/2;
    sort(inputArray,start,end);//sort left half 
    sort(inputArray,mid+1,end);//sort right half
     merge(inputArray,start,mid,end);
    }
    
    public static void merge(int[] inputArray,int start,int mid,int end){
    int tempArray[]=new int[end-start+1];
    //index counter for the left side of the array
    int leftSide=start;
    //index counter for the right side of the array
    int rightSide=mid+1;
    int k=0;
    while(leftSide<=mid && rightSide<=end){
    if(inputArray[leftSide]<inputArray[rightSide]){
    tempArray[k]=inputArray[leftSide];
    leftSide=leftSide+1;
    }else{
    tempArray[k]=inputArray[rightSide];
    rightSide=rightSide+1;
    }
    k=k+1;
    }
    /*
    When it get's to here,that means the above loop has completed.
    So both the right and the left side of the sub-array can be consider sorted
    */
    if(leftSide<=mid){
    while(leftSide<=mid){
    tempArray[k]=inputArray[leftSide];
    leftSide=leftSide+1;
    k=k+1;
    }
    }else if(rightSide<=end){
        while(rightSide<=end){
    tempArray[k]=inputArray[rightSide];
    rightSide=rightSide+1;
    k=k+1;
    }
    }
    
    //copy over the temp array into the appropriate slots of the inputArray
    
    for(int i=0;i<tempArray.length;i++){
    inputArray[start+i]=tempArray[i];
    }
    
    }
}
