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
public class Circle {
    private Point point;
    private double radius;
    
    public Circle(double x, double y, double r) {
        point = new Point(x, y);
        radius = r;
    }
    
    public Point getCenter() {
        return point;
    }
    
    public double getRadius() {
        return radius;
    }

    double getX() {
        return point.getX();
    }

    double getY() {
        return point.getY();
    }
    
    @Override
    public String toString() {
        String str = "";
        str += point.toString();
        str += " % ";
        str += String.format("%.2f", radius);
        return str;
    }
    
}
