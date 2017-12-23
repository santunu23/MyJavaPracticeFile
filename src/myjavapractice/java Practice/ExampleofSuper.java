/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Santunu23
 */

//The super keyword in java is a reference variable which is used to refer immediate parent class object.
//Whenever you create the instance of subclass, an instance of parent class is created implicitly which 
//is referred by super reference variable.

//1)super can be used to refer immediate parent class instance variable.
//2)Get a function
//3)Example of using super keyword in constructor


//1)super can be used to refer immediate parent class instance variable.
//   class Animal{
//        void MyAnimal(){
//          System.out.println("Animal is a group");
//        }
//        }
//    class Cat extends Animal{
//       void Catsubclass(){
//       super.MyAnimal();
//       System.out.println("This is cat sub class");
//       }
//    }
//   class ExampleofSuper{
//   public static void main(String[] args){
//   Cat cat=new Cat();
//   cat.Catsubclass();
//   }
//   }

//2) Get a function

//class Animal{
//    String animal="Animal is a group";
//}
//class Cat extends Animal{
//    void PrintData(){
//    System.out.println(super.animal);
//    System.out.println("This is a cat subclass");
//    }
//}
//class ExampleofSuper{
//public static void main(String[] args){
//Cat ca=new Cat();
//ca.PrintData();
//}
//}

//3)Example of using super keyword in constructor
class Animal{
Animal(){
System.out.println("This is animal keyword");
}
}
class Cat extends Animal{
Cat(){
    super();
System.out.println("Cat is my subclass");
}
}
class ExampleofSuper{
public static void main(String[] args){
Cat ca=new Cat();
}
}