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
public class LogicCentricPuzzletwo {
    
    /**
     The birds in florida like to sing during favorable temperatures.In particular,they sing if the temperature is
     between 60 and 90(inclusive) unless in the summer,there the upper limit is 100 of 90.
     Given on int temperature and a boolean isSummer.return true if the birds  are singing and false otherwise**/
    public static void main(String[] args){
        System.out.println(birdsSinging(70, false));
        System.out.println(birdsSinging(95, false));
        System.out.println(birdsSinging(95, true));
    }
    
    public static boolean birdsSinging(int temp,boolean isSummer){
        if(isSummer==true){
        if(temp>60&& temp<=100){
          return true;
        }}else{
            if(temp>60 && temp<=90){
                    return true;
                    }
        }
        return false;
        
    }
    
}
