/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeselection;
import java.util.Random;
/**
 *
 * @author jvrij
 */
public class CoffeeChoice {

    static Random rand = new Random();

     static int[] coffeeStrength = {
         1, 2, 3, 4, 5
     };
     
     static int[] coffeeNumber = {
        100, 0, 25, 30, 35, 40, 45, 56, 57
     };
     
     static String[] coffeeName = {
        "Thee", "Koffie", "Wiener Melange", "Café au Lait", "Espresso", 
        "Cappuccino", "Dubbele Espresso", "Chocomel", "Chococino"
     };
     
     public static String koffieNaam() {
 
        String k = coffeeName[koffieNrRandom(coffeeNumber)];
        return k;
     
     }
     
    public static int koffieKracht() {
 
        int i = coffeeStrength[codeRandom(coffeeStrength)];
        return i;
     
     }
    
    public static int koffieCode() {
        
        int j = coffeeNumber[koffieNrRandom(coffeeNumber)];
        return j;
    }


    public static int koffieNrRandom(int[] coffeeNumber) {
      
        int i = rand.nextInt(coffeeNumber.length);
        return i;
    }

    
  public static int codeRandom(int[] coffeeStrength) {
 
        int i = rand.nextInt(coffeeStrength.length);
        return i;
    }
}

