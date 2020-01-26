/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3.zad6;

/**
 *
 * @author jarek
 */
public class Barman {
    
    public Drink createDrink(String ingredients ) {
        String[] str = ingredients.split(",");
        Drink drink = new Drink();
        
        if (str.length != 6) {
            System.out.println("zla ilość argumentów, powinno być 6: 'nazwa1, ilosc1, nazwa2, ilosc2, nazwa3, ilosc3'. Jest="
                    + str.length );
            return null;
        }
        
        int i = 0;
        while (i < str.length) {
            String name = str[i++].trim();
            Integer amount = Integer.decode(str[i++].trim());
            drink.add(new Ingredient(name, amount));
        }
        return drink;
    }

    public void printDrink(Drink drink) {
        System.out.println("Składniki drika to: " + drink.getIngredientsNames()
                + " w proporcjach: " + drink.getIngredientsProportions() 
                + ". Jego pojemność to: " + drink.getSize());
    }
}
