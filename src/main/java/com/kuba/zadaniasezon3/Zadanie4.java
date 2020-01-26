/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuba.zadaniasezon3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Pospieszyłem się z zrobiłem to na 2 sposoby, przez scanner i args.
 * 
 * @author jarek
 */
public class Zadanie4 {
    static List<Integer> list = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        if (args.length == 0) {
            System.out.println("Wpisz liczby całkowite, '0' kończy wpisywanie:");
            try {
                while(sc.hasNext()) {
                    i = sc.nextInt();
                    if (i == 0)
                        break;

                    list.add(i);
                }
            }
            catch (Exception e) { 
                System.out.println("Exception thrown: " + e);
            }
            sc.close();
        } else {
            /* Tą część dopisałem potem bo nie zauważyłem że miało być w argumentach */
            for (String arg : args)
                list.add(Integer.decode(arg));
        }
        
        
        System.out.println("Wpisano " + list.size() + " liczb całkowitych." );
        System.out.println("Przekazane liczby to:[" + printNumbers(";") + "]");
        System.out.println("Przekazane kwadraty liczb:[" + printSquareNumbers() + "]");
        System.out.println("Suma liczb: " + printNumbers(" + ") + " = " + printSumNumbers() );        
    }

    private static String printNumbers(String sign) {
        boolean sep = false;
        String str = "";
        
        for (Integer i : list) {
            str += (sep ? sign : "") + i;
            sep = true;
        }
        return str;
    }

    private static String printSquareNumbers() {
        boolean sep = false;
        String str = "";
        
        for (Integer i : list) {
            str += (sep ? ";" : "") + (Math.multiplyFull(i, i));
            sep = true;
        }
        return str;
    }
    
    private static String printSumNumbers() {
        Long lg = (long) 0;
        
        for (Integer i : list)
            lg += i;
        return "" + lg;
    }
}
