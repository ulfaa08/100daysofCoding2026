package com.mycompany.kalkulatorsederhana;

import java.util.Scanner;
public class KalkulatorSederhana {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("--- KALKULATOR IF ---");
            System.out.print("Nilai x = ");
            int x = sc.nextInt();
            System.out.print("Nilai y = ");
            int y = sc.nextInt();
            
            System.out.print("Pilih menu (+ - * /): ");
            String menu = sc.next();
            
            if (menu.equals("+")) {
                System.out.println(x + " + " + y + " = " + (x+y));
            } else if (menu.equals("-")) {
                System.out.println(x + " - " + y + " = " + (x-y));
            } else if (menu.equals("*") || menu.equals("x")) {
                System.out.println(x + " * " + y + " = " + (x*y));
            } else if (menu.equals("/")) {
                if (y == 0) {
                    System.out.println("Error: y tidak boleh 0");
                } else {
                    System.out.println(x + " / " + y + " = " + (x/y));
                }
            } else {
                System.out.println("Operator tidak dikenal");
            }
        }
    }
}
