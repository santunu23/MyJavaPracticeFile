package DataContestAlgorithm.Sorting;
/**
 * @author Santunu23
 * Detail about the insertion sort describe here 
 * https://www.geeksforgeeks.org/insertion-sort/
 */
public class Insertionsort {
    public static void main(String[] args){
    
    int[] myArray=new int[]{12, 11, 13, 5, 6};
    int key,temp,minValue,j;
    for(int i=0;i<myArray.length;i++){
    key=myArray[i];
    j=i-1;
    while(j>=0&&key<myArray[j]){
    temp=myArray[j];
    myArray[j]=myArray[j+1];
    myArray[j+1]=temp;
    j--;
    }
    }  
    
    for(int d=0;d<myArray.length;d++){
    System.out.print(myArray[d]+",");
    }
    }
    
}
