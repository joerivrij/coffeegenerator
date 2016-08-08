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
        "Dubbele Espresso", "Cappuccino", "Warme Chocolademelk", "Chococcino"
    };

    public static String koffieNaam() {
        getKoffieNrRandom();
        return coffeeName[plaats];
    }

    public static int koffieCode() {
        if ((coffeeNumber[plaats] == 56) || (coffeeNumber[plaats] == 57)
                || (coffeeNumber[plaats] == 100)) {
            return coffeeNumber[plaats];
        } else {
            return coffeeNumber[plaats] + coffeeStrength[kracht];
        }
    }

    public static int koffieKracht() {
        if ((coffeeNumber[plaats] == 56) || (coffeeNumber[plaats] == 57)
                || (coffeeNumber[plaats] == 100)) {
            return 0;
        } else {
            getKrachtRandom();
            return coffeeStrength[kracht];

        }
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
