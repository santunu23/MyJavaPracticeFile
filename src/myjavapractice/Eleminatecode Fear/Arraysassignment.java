package Eleminatecodefear;

/**
 *
 * @author Santunu23
 */
public class Arraysassignment {
    public static void main(String[] args){
 System.out.println(search(new int[]{2,3,4,5,6,7},7));
 System.out.println(search(new int[]{2,3,4,5,6,7},1));
    }
   public static int search(int[] num,int target){
      for(int i=0;i<num.length;i++){
          if(num[i]==target){
          return num[i];
          }
         
   }
      return -1;
}
}
