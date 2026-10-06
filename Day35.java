package com.mycompany.nestedifganjilgenap;

import java.util.Scanner;

public class NestedIfGanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        // if luar untuk cek bilangan valid (bukan 0)
        if (bilangan != 0) {
            // if di dalam (nested if) untuk cek ganjil/genap
            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " adalah Bilangan Genap");
            } else {
                System.out.println(bilangan + " adalah Bilangan Ganjil");
            }
        } else {
            System.out.println("Bilangan adalah Nol");
        }
    }
}
