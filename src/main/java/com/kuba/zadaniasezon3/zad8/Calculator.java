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
public class Calculator {
    
    public double area(Rectangle rect) {
        double x = rect.getWidth();
        double y = rect.getLength();
        return x * y;
    }

    public double area(Circle circle) {
        double r = circle.getRadius();
        return Math.PI * r * r;
    }

    public boolean isInFigure(Point point, Circle circle) {        
        double x = point.getX() - circle.getX();
        double y = point.getY() - circle.getY();
        double z = Math.sqrt(x * x + y * y);
        
        return z < circle.getRadius();
    }

    public boolean isInFigure(Point point, Rectangle rectangle) {
        return rectangle.isInX(point.getX()) && rectangle.isInY(point.getY());
    }
}
