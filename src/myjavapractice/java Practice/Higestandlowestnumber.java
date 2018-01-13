package myjavapractice;

/**
 *
 * @author Santunu23
 */
public class Higestandlowestnumber {
    public static void main(String[] args){
        /*Findout higest and lowest number of an array,to make the puzzel I am going to sort my array first then 
          declare my first number is lowest and last number in the row is highest.
        */
          int[] myArray=new int[]{4,6,8,9,2};
          
          for(int i=0;i<myArray.length;i++){
            for(int j=i+1;j<myArray.length;j++){
            if(myArray[i]>myArray[j]){
              int temp=myArray[j];
              myArray[j]=myArray[i];
              myArray[i]=temp;
            }
            }
              
          }//Our array is now sortted
              //Now Declare first element as the lowest number and last number as highest number
              for(int d=0;d<myArray.length;d++){
                      int k=myArray.length-1;
                     System.out.println("Lowest number in the array is "+myArray[0]);
                     System.out.println("Higest number in the array is "+myArray[k]);
                     break;
              }
    }
    
}
