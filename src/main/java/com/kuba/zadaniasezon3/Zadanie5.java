/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3;

import com.kuba.zadaniasezon3.zad5.Cabrio;

/**
 *
 * @author jarek
 */
public class Zadanie5 {
    public static void main(String[] args) {
        Cabrio auto = new Cabrio("Jaguar", "XC-20");
        
        System.out.println("Open roof!");
        roof(auto, true);

        System.out.println("Start moving!");
        auto.setMoving(true);

        System.out.println("Close roof!");
        roof(auto, false);

        System.out.println("Stop moving!");
        auto.setMoving(false);

        System.out.println("Close roof!");
        roof(auto, false);
        
    }

    private static void roof(Cabrio auto, boolean open) {
        int event;
        event = auto.setRoofOpen(open);
        if (event < 0)
            System.out.println("Error, roof can't be opening or closing during car is moving.");
        else
            System.out.println("Confirm, roof is " + (auto.isRoofOpen()?"opened":"closed") + ".");
    }
    
}
