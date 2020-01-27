/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3.zad7;

/**
 *
 * @author jarek
 */
public class PaymentCalculator {
    private double zusCosts = (double) 1000;
    private double taxPercentige = (double) 20;
    private int months = 12;
    
    public double nettoYearPayment(Employee employee) {
        return employee.getSalary() * months;
    }
            
    public double bruttoYearPayment(Employee employee) {
        double gross;
        // calculations:  gross * (1 - tax) = netto
        //              gross = netto / (1 - tax)
        gross = ((double)100 * employee.getSalary()) / (100 - taxPercentige);
        gross += zusCosts;
        gross *= months;
        return gross;
    }
    
}
