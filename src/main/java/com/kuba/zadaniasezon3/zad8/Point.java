/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3.zad8;

/**
 *
 * @author jarek
 */
public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }    

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
    
    @Override
    public String toString() {
        String str = "";
        str += String.format("%.2f", x);
        str += " X ";
        str += String.format("%.2f", y);
        return str;
    }
}
