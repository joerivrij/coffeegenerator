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
    static int plaats;
    static int kracht;
     static int[] coffeeStrength = {
         1, 2, 3, 4, 5
     };
     
     static int[] coffeeNumber = {
        100, 0, 25, 30, 35, 40, 45, 56, 57
     };
     
     static String[] coffeeName = {
        "Thee", "Koffie", "Wiener Melange", "Café au Lait", "Espresso", 
        "Dubbele Espresso", "Cappuccino", "Chocomel", "Chococino"
     };
      
     public static String koffieNaam() {
       getKoffieNrRandom();
       return coffeeName[plaats];
     }
     
      public static int koffieCode() {
      
        return coffeeNumber[plaats];
    }
         
    public static int koffieKracht() {
        getKrachtRandom();
       return coffeeStrength[kracht];
     
     }

    public static int getKoffieNrRandom() {
         CoffeeChoice.plaats = rand.nextInt(coffeeNumber.length);
         return plaats;
    }
    
  public static int getKrachtRandom() {
 
        CoffeeChoice.kracht = rand.nextInt(coffeeStrength.length);
        return kracht;
    }
}




 
