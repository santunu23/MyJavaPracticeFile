 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpression;

/**
 *
 * @author Santunu23
 */
interface Sayable{
public String say(String name);
}
public class SingleParameter {
    public static void main(String[] args) {
        Sayable s1=name->{
        return "Hello, "+name;
        };
        
        System.out.println(s1.say("Sonoo"));
    }
}
