package myjavapractice;

/**
 *
 * @author Santunu23
 */
public class fibonoci {
    public static void main(String[] args) {
        //In fibonacci series next number is the sum of previous two nubmers for example 
        //0,1,2,3,5,8,13,21,34,55
        int n1=0;
        int n2=1;
        for(int i=2;i<=10;i++){
        int n3=n2+n1;
        System.out.print(n3+"");
        n1=n2;
        n2=n3;
        }
    }
}
