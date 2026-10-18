package com.mycompany.kalkulator;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Switch-Case ===");
        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan operator (+ - * /): ");
        char op = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        double hasil = 0;

        switch (op) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                hasil = a / b;
                break;
            default:
                System.out.println("Operator tidak dikenali!");
                return;
        }

        System.out.println("Hasil: " + a + " " + op + " " + b + " = " + hasil);
    }
}
