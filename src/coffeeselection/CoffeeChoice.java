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
        int[] coffeeNumber = {1, 2, 3, 4, 5, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42};
        Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                int c = rand.nextInt(coffeeNumber.length);
                System.out.println("De koffie die jij vandaag krijgt is = " + coffeeNumber[c]);
        }
    }
}