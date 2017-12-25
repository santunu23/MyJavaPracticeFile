package Eleminatecodefear;

public class StringManipulationSolution {

/*Assignment 1:Give a string of odd length,return the middle 3 
  characters from the string,so the string "Monitor",""yields,"mit" 
  if the string length is less than 3,return the string as is.*/

    public static void main(String[] args){
    String[] myString=new String[]{"Monitor","yields","mit","Foodlover"};
    
    for(int i=0;i<myString.length;i++){
        if(myString[i].length()<=3){
        System.out.println("We can not proceed");
        }else{
           int a=myString[i].length()/2;
           String b=myString[i].substring(a-1,a+2);
           System.out.println(b);
        }

    }


   





       }
    }

