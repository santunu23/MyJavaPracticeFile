package MyJavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromArrayList {

//Copying all the elements of ArrayList to LinkedHashSet. 
//Why we choose LinkedHashSet? Because it removes duplicates and maintains the insertion order.
//Emptying the ArrayList, you can use clear() method to remove all elements of ArrayList and start fresh. 
//Copying all the elements of LinkedHashSet (non-duplicate elements) to the ArrayList. 
    public static void main(String[] args){
        
      LinkedHashSet<String> uinput=new LinkedHashSet<String>();
      for(int i=0;i<5;i++){
          Scanner sc=new Scanner(System.in);
      System.out.println("Please enter the name");
      uinput.add(sc.nextLine());
      }
      System.out.println("Now print the array : "+ uinput);

    }
   
}
