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

  public static void main(String[] args) {
       getRandom();
    }
  
    public static void getRandom() {
        int[] coffeeStrength = {1, 2, 3, 4, 5};
        int[] coffeeNumber = {0, 25, 30, 35, 40, 45, 56, 57};
        String[] coffeeName = {"Koffie", "Wiener Melange", "Café au Lait", "Espresso", 
            "Cappuccino", "Dubbele Espresso", "Chocomel", "Chococino"};
        Random soort = new Random();  
        for (int i = 0; i < 10; i++) {
                int c = soort.nextInt(coffeeNumber.length);
        Random kracht = new Random();
                int k = kracht.nextInt(coffeeStrength.length);
                int code = coffeeNumber[c] + k;
                System.out.println("De " + coffeeName[c] + " zal u lekker smaken!"
                + " De snelcode voor uw selectie is: " + code);
        }
    }
}