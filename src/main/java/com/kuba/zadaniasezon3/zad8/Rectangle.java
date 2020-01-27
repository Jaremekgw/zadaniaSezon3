/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3.zad8;

import static java.lang.Math.abs;

/**
 *
 * @author jarek
 */
public class Rectangle {
    private Point p1, p2;
    
    public Rectangle(double x1, double y1, double x2, double y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    double getWidth() {
        double x1 = p1.getX();
        double x2 = p2.getX();
        return abs(x1 - x2);
    }

    double getLength() {
        double y1 = p1.getY();
        double y2 = p2.getY();
        return abs(y1 - y2);
    }

    /**
     * Check if x is inside the X side of rectangle
     * 
     * @param x
     * @return 
     */
    boolean isInX(double x) {
        double ref1, ref2;
        ref1 = p1.getX();
        ref2 = p2.getX();
        if ((x > ref1 && x > ref2) || (x < ref1 && x < ref2))
            return false;
        return true;
    }

    /**
     * Check if y is inside the Y side of rectangle
     * 
     * @param y
     * @return 
     */
    boolean isInY(double y) {
        double ref1, ref2;
        ref1 = p1.getY();
        ref2 = p2.getY();
        if ((y > ref1 && y > ref2) || (y < ref1 && y < ref2))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        String str = "";
        str += p1.toString();
        str += " ^ ";
        str += p2.toString();
        return str;
    }
}
