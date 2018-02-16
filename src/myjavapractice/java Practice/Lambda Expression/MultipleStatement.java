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
interface MeSayable{
   String say(String message);
}
public class MultipleStatement {
    public static void main(String[] args) {
        MeSayable me=(message)->{
        String s1="I want to say ";
        String s2=s1+message;
        return s2;
        };
        System.out.println(me.say("I love you"));
        
        
    }
}
