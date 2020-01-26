/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3.zad6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jarek
 */
public class Drink {
    private List<Ingredient> ingredients = new ArrayList<>();
    private Integer size = 0;

    void add(Ingredient ingredient) {
        ingredients.add(ingredient);
        size += ingredient.getAmount();
    }

    Integer getSize() {
        return size;
    }
    
    String getIngredientsNames() {
        String names = "";
        boolean sep = false;
        for (Ingredient ingredient : ingredients) {
            names += (sep ? ", " : "") + ingredient.getName();
            sep = true;
        }
        return names;
    }

    String getIngredientsProportions() {
        String props = "";
        boolean sep = false;
        for (Ingredient ingredient : ingredients) {
            float p = (float)ingredient.getAmount() / (float)size;

            props += (sep ? ", " : "") + String.format ("%.2f", p);
            sep = true;
        }
        return props;
    }
}
