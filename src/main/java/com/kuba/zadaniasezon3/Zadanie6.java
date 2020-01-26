/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3;

import com.kuba.zadaniasezon3.zad6.Barman;
import com.kuba.zadaniasezon3.zad6.Drink;

/**
 *
 * @author jarek
 */
public class Zadanie6 {
    public static void main(String[] args) {
        Barman barman = new Barman();
        Drink drink;
        
        drink = barman.createDrink("Coca Colla, 45, Whisky, 35, Lemon, 20");
        if (drink == null) {
            System.out.println("Niewłaściwie utworzony drink, sorry, koniec programu.");
            return;
        }
            
        barman.printDrink(drink);
    }
}
