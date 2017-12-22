package myjavapractice;
/**
 *
 * @author Santunu23
 * More example in  the link https://alvinalexander.com/java/edu/pj/pj010018
 */
public class JavaTernaryOperatorExamples {
public static void main(String[] args){
    int minVal,a=2,b=3;
    minVal=a<b?a:b;
    System.out.println("Minimum number is: "+minVal);
     
    Float result=false?1.0f:2.0f;
    System.out.println("Float number is + "+result);
    
    //result will be display "Sorry dude"
    String d=false?"Thanks dude":"Sorry dude";
    System.out.println(d);
    
    // example using the ternary operator on the rhs, in a string
     int x=5;
     String out="There "+(x>1?" are "+x+" cokies ":" one cockie")+" in the jar ";
     System.out.println(out);
    
    
}    
}
