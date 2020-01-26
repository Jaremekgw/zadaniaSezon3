/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3.zad5;

/**
 *
 * @author jarek
 */
public class Cabrio {
    private String name;
    private String brand;
    private boolean moving;     // samochód się porusza
    private boolean roofOpen;   // dach otwarty

    public Cabrio(String brand, String name) {
        this.name = name;
        this.brand = brand;
        moving = false;
        roofOpen = false;
    }

    public String getBrandName() {
        return brand + ", " + name;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }

    public int setRoofOpen(boolean roof_open) {
        if (moving)
            return -1; 

        this.roofOpen = roof_open;
        return 0;
    }
    
    
}
