package com.mycompany.positifnegatifnol;

import java.util.Scanner;

public class PositifNegatifNol {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan: ");
            int bilangan = input.nextInt();
            
            // Percabangan untuk menentukan positif, negatif, nol
            if (bilangan > 0) {
                System.out.println(bilangan + " adalah bilangan positif");
            } else if (bilangan < 0) {
                System.out.println(bilangan + " adalah bilangan negatif");
            } else {
                System.out.println(bilangan + " adalah nol");
            }
        }
    }
}
