package myjavapractice;

/**
 *
 * @author Santunu23
 */
public class fibonoci {
       static int n1=0,n2=1,n3=0;
    static void  printfibonaccinumbers(int count){
         if(count>0){
         n3=n2+n1;
         n1=n2;
         n2=n3;
             System.out.println(" "+n3);
             printfibonaccinumbers(count-1);
         }
         }
       public static void main(String[] args) {
               int count=10;
        printfibonaccinumbers(count-2);
    }
}
