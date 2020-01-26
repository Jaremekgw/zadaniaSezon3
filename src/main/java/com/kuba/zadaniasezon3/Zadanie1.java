/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3;

/**
 * Nie jestem pewien czy bez zmiennych o to ci chodziło.
 * @author jarek
 */
public class Zadanie1 {
    public static void main(String[] args) {
        float a, b, c;
        
        System.out.printf("Liczby bez zmiennych: %.2f + %.2f + %.2f\r\n", 45.632, 123.2356623, 6.678655);
        
        a = (float) 19.4223;
        b = (float) 112.456;
        c = (float) 3.345;
        
        System.out.printf("Wynik sumy zmiennych: %.2f + %.2f + %.2f = %.2f \r\n", a, b, c, a + b + c);
    }
    
}
