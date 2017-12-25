/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eleminatecodefear;

/**
 *
 * @author Santunu23
 */
public class LoopCategoryone {
 
     //The program should extract categories from the str(apperal,makeup,furniture)
    public static void main(String[] args){
    String str="We have a large inventory of things in our warehourse falling in"+"the category apperal and the slightly"
            +"more in demand category makeup along with the category furniture and ....";
   
         int i=0;
         while(true){
             
             int found=str.indexOf("category",i);
             if(found == -1) break;
             int start=found+9;//start of the actual starting
             int end=str.indexOf(" ",start);
             System.out.println(str.substring(start,end));
             i=end+1;
         }
    }
  
    
    
    //Extract  all categories from the string argument
//public static void printCetagory(String str){
//
//}
//    
    
    
}

