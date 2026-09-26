package com.mycompany.hitungluaskolam;
import java.util.Scanner;

public class HitungLuasKolam {
    public static void main(String[] args) {
        final double PI = 3.14;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("=== PROGRAM MENGHITUNG LUAS KOLAM ===");
            System.out.println();
            System.out.print("Masukkan diameter kolam (meter) : ");
            double diameter = in.nextDouble();
            double r = diameter / 2.0;
            double luas = PI * Math.pow(r, 2);
            
            System.out.println("\n---------------------------------------\n");
            System.out.println("+++ Hasil Perhitungan +++\n");
            System.out.println("Diameter     : " + diameter + " m");
            System.out.println("Jari-jari    : " + r + " m");
            System.out.println("Luas         : " + luas + " m2");
            System.out.println("\n============================");
        }
    }
}
