package Eleminatecodefear;

import java.nio.file.FileSystemNotFoundException;

/**
 *
 * @author Santunu23
 */
public class LogicCentricPuzzlesix {
    /**
     * Given 2 positive int arguments(a,b) return whichever argument is 
     * nearest to the number 21 without going over.
     * REturn 0 if they both go over 21
     ***/
    
    public static void main(String[] args){
        System.out.println(nearestTwentyone(19,21));  
        System.out.println(nearestTwentyone(21,19));
        System.out.println(nearestTwentyone(19,22));
        System.out.println(nearestTwentyone(32,22));
       
    }
    
    public static int nearestTwentyone(int a,int b){
        
        if(a>21 && b>21) return 0;
        if(a>21 && b<21) return b; // a disqualified
        if(a<21 && b>21) return a; // b disqualifies
        if(a>b)
            return a;
        else
            return b;
    }
    
    
}
