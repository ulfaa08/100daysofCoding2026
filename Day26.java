package com.mycompany.luaslingkaran;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            final double PI = 3.14;
            
            double jari = input.nextDouble();
            
            double luas = PI * jari * jari;
            
            System.out.println(luas);
        }
    }
}
