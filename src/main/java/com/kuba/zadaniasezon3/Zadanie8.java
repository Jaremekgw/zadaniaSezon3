/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3;

import com.kuba.zadaniasezon3.zad8.Calculator;
import com.kuba.zadaniasezon3.zad8.Circle;
import com.kuba.zadaniasezon3.zad8.Point;
import com.kuba.zadaniasezon3.zad8.Rectangle;

/**
 *
 * @author jarek
 */
public class Zadanie8 {

    public static void main(String[] args) {
        //
        Point p1 = new Point(45, 40);
        Rectangle r1 = new Rectangle(3, 21.8, 35, 61);
        Circle c1 = new Circle(50, 30, 16);
        Calculator calc = new Calculator();
        
        System.out.println("Rectangle: (" + r1.toString() + ") has square area: " + String.format("%.2f", calc.area(r1)));
        System.out.println("Circle: (" + c1.toString() + ") has square area: " + String.format("%.2f", calc.area(c1)));
        System.out.println("Point: (" + p1.toString() + ") is contained in rectangle: (" + r1.toString() + ")? " + (calc.isInFigure(p1, r1)?"YES.":"NOT.") );
        System.out.println("Point: (" + p1.toString() + ") is contained in circle: (" + c1.toString() + ")? " + (calc.isInFigure(p1, c1)?"YES.":"NOT.") );
    }
    
}
