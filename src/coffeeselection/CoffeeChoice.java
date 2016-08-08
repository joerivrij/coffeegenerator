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
        10, 20, 30, 40, 50, 60, 70, 80, 90
     };
     
     static String[] coffeeName = {
        "Thee", "Koffie", "Wiener Melange", "Café au Lait", "Espresso", 
        "Cappuccino", "Dubbele Espresso", "Chocomel", "Chococino"
     };
     
     public static String koffieNaam() {
 
        String k = coffeeName[getKoffieNrRandom(coffeeNumber)];
        return k;
     
     }
     
      public static int koffieCode() {
        
        int j = coffeeNumber[getKoffieNrRandom(coffeeNumber)];
        return j;
    }
         
    public static int koffieKracht() {
        
        int i = coffeeStrength[krachtRandom(coffeeStrength)];
        return i;
     
     }

    public static int getKoffieNrRandom(int[] coffeeNumber) {

        int rnd = rand.nextInt(coffeeNumber.length);
        return rnd;
    }
    
  public static int krachtRandom(int[] coffeeStrength) {
 
        int i = rand.nextInt(coffeeStrength.length);
        return i;
    }
}




 
