package javapractice;

import java.util.Arrays;

/**
 *
 * @author Santunu23
 */
public class Removeduplicatewithoutcollection {
public static void removeDuplicates(int[] arrayWithduplicates){
    
    int noOfduplicates=arrayWithduplicates.length;
           for(int i=0;i<noOfduplicates;i++){
           for(int j=i+1;j<noOfduplicates;j++){
               //{4, 3, 2, 4, 9, 2}
                if(arrayWithduplicates[i]==arrayWithduplicates[j]){
                   //Replace duplicate entry with the last unique number
                   arrayWithduplicates[j]=arrayWithduplicates[noOfduplicates-1];
                    noOfduplicates--;
                   j--;
                }
           }
           }
           int[] arryWithoutduplicates=Arrays.copyOf(arrayWithduplicates, noOfduplicates);
           for(int i=0;i<arryWithoutduplicates.length;i++){
           System.out.print(arryWithoutduplicates[i]+"\t");
           }
           
           
           
}
    
       
//       //Display all the parameter data for the first time
//       for(int i=0;i<arrayWithduplicates.length;i++){
//         System.out.print(arrayWithduplicates[i]);
//       }
//       //Assume all the datas in the array are unique.
//         int noUniqueelements=arrayWithduplicates.length;
//         
//         //Compairing all elements with other elements
//           for(int i=0;i<noUniqueelements;i++){
//           for(int j=i+1;j<noUniqueelements;j++){
//             if(arrayWithduplicates[i]==arrayWithduplicates[j]){
//                //Replace duplicate elements with last unique number
//             arrayWithduplicates[j]=arrayWithduplicates[noUniqueelements-1];
//                    //Decrementing noOfUniqueElements
//                 noUniqueelements--;
//                    //Decrementing j
//                    j--;
//           }
//           }
//           } 
//           //Coping only unique numbers from arraywithunique to arraywithunique
//           int[] arrayWithoutduplicates=Arrays.copyOf(arrayWithduplicates, noUniqueelements);
//           //printing arrayWithoutDuplicates
//            System.out.println();
//        System.out.println("Array Without Duplicates : ");
//        for (int i = 0; i <arrayWithoutduplicates.length; i++)
//        {
//            System.out.print(arrayWithoutduplicates[i]+"\t");
//        }
//        System.out.println();
//        System.out.println("==============================");

    
        public static void main(String[] main){
         
        removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
         
        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
         
        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
         
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});

         }    
    
}
