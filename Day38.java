package com.mycompany.menuluas;

import java.util.Scanner;

public class MenuIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1. Cek Positif/Negatif");
        System.out.println("2. Cek Ganjil/Genap");
        System.out.println("3. Keluar");
        System.out.print("Pilih [1-3]: ");
        int pilih = input.nextInt();

        if (pilih == 1) {
            System.out.print("Masukkan bilangan: ");
            int bil = input.nextInt();
            if (bil > 0) {
                System.out.println("Positif");
            } else if (bil < 0) {
                System.out.println("Negatif");
            } else {
                System.out.println("Nol");
            }
        } else if (pilih == 2) {
            System.out.print("Masukkan bilangan: ");
            int bil = input.nextInt();
            if (bil % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
            }
        } else {
            System.out.println("Program selesai");
        }
    }
}
