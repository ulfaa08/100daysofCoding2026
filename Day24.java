package com.mycompany.hitungluastaman;

import java.util.Scanner;

public class HitungLuasTaman {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=== PROGRAM MENGHITUNG LUAS TAMAN ===");
            System.out.println();
            
            System.out.print("Masukkan panjang taman (meter)  : ");
            double panjang = input.nextDouble();
            
            System.out.print("Masukkan lebar taman (meter)    : ");
            double lebar = input.nextDouble();
            
            double luas = panjang * lebar;
            
            System.out.println();
            System.out.println("------------------------------------");
            System.out.println();
            System.out.println("Hasil Perhitungan:");
            System.out.println("Panjang Taman     : " + panjang + " m");
            System.out.println("Lebar Taman       : " + lebar + " m");
            System.out.println("Luas Taman        : " + luas + " m2");
            System.out.println("========================");
        }
    }
}
