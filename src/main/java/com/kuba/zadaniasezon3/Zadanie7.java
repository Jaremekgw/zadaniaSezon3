/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3;

import com.kuba.zadaniasezon3.zad7.Employee;
import com.kuba.zadaniasezon3.zad7.PaymentCalculator;

/**
 *
 * @author jarek
 */
public class Zadanie7 {
    
    public static void main(String[] args) {
        Employee employee;
        PaymentCalculator calculator = new PaymentCalculator();
        
        employee = new Employee("Piotr", "Centek", 3000);
        
        System.out.println("Employee: " + employee.toString() 
                + " has netto:" + calculator.nettoYearPayment(employee)
                + " and gross:" + calculator.bruttoYearPayment(employee)
                + " salary per year.");
    }
}
