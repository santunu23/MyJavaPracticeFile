/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavapractice;

import java.util.HashSet;

/**
 *
 * @author Santunu23
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
             String a="Amar";
     HashSet<Character> myset=new HashSet<Character>();
     for(int i=0;i<a.length();i++){
         myset.add('A');
         myset.add('E');
         myset.add('I');
         myset.add('O');
         myset.add('U');
         myset.add('a');
         myset.add('e');
         myset.add('i');
         myset.add('o');
         myset.add('u');
         myset.add(a.charAt(i));
     }
    
      for(char k:myset){
          if(k!='A'&&k!='E'&&k!='I'&&k!='O'&&k!='U'&&k!='a'&&k!='e'&&k!='i'&&k!='o'&&k!='u'){
              System.out.println(k);
          }
      }
    }
}
