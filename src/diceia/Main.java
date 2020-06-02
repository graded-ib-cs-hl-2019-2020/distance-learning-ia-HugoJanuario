

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceia;
import java.util.Random;
import java.lang.Math;









/**
 *
 * @author hugojanuario
 */
public class Main { 
 public static int numSides = 6;
 public static int numDice = 1;
 public static String output;
 
    public static void addDice() { //Increments the value of numDice if it is smaller than 10(Max).
        if (numDice<10) {
            numDice++; 
        }    
    }
    public static void subDice() { //decrements the value of numDice if it is bigger than 0(Min).
        if (numDice>0) {
            numDice--; 
        }         
    }
    public static void addSide() { //Increments the value of numSides if it is smaller than 10(Max).
        if (numSides<10) {
            numSides++;  
        }   
    }
    public static void subSide() { //decrements the value of numSides if it is bigger than 0(Min).
        if (numSides>0) {
            numSides--;  
        }       
    }
    public static void rollDice() {
        Dice dice = new Dice(numSides, numDice);//Instantiated the Dice object!
        int[] outPutList = new int[numDice];// Creates an array that holds the size of numDice
        for (int i = 1; i <=numDice; i++) {  
           outPutList[i]= (int)(Math.random()*numSides)+1; 
        }  
        for (int i = 1; i <=numDice; i++) {   
            String outputI = outPutList[i]+", "; // converts the array into a String value and adjusts placement.
            output.concat(outputI); //concatenates the recently converted string to the output String
        } 
     }
    public static String setOutput() {
        return output; //Returns the new String output so it can be displayed.
    }
 





public static void main(String [] args){
  
}
    
          
    
    
     

}

