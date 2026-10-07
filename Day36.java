package com.mycompany.ganjilgenap;

import java.util.Scanner;

public class GanjilGenap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan > 0) {
            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " adalah Genap Positif");
            } else {
                System.out.println(bilangan + " adalah Ganjil Positif");
            }
        } else {
            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " adalah Genap Negatif / Nol");
            } else {
                System.out.println(bilangan + " adalah Ganjil Negatif");
            }
        }
    }
}
