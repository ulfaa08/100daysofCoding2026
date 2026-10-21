package com.mycompany.cekbilangan;

import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = sc.nextInt();

        System.out.println("-------------------------");

        System.out.println(
            bilangan + (bilangan % 2 != 0
                ? " adalah bilangan GANJIL"
                : " adalah bilangan GENAP")
        );

        sc.close();
    }
}
