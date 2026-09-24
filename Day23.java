package com.mycompany.menghitungluaspersegi;
import java.util.Scanner;

public class LuasPersegi {

    public static double hitungLuas(double panjangSisi) {
        return panjangSisi * panjangSisi;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input sisi persegi : ");
            double s = sc.nextDouble();
            
            double hasil = hitungLuas(s);
            
            System.out.println("----------------------------");
            System.out.println("Sisi yang diinput : " + s);
            System.out.println("Luas persegi adalah : " + hasil);
        }
    }
}
