/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpression;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author Santunu23
 */
class product{
  int id;  
    String name;  
    float price;  
public product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class FilterCollectionData {
    public static void main(String[] args) {
        ArrayList<product> myArray=new ArrayList<product>();
        myArray.add(new product(1,"Joy",100));
        myArray.add(new product(2,"Tanmoy",200));
        myArray.add(new product(3,"Swapan",300));
        myArray.add(new product(4,"Babli",400));
        myArray.add(new product(5,"Dilip",500));
        myArray.add(new product(6,"Neli",200));
        
             // using lambda to filter data  
            Stream<product> filtered_data = myArray.stream().filter(p -> p.price== 200);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        ); 
    }
}
