package com.mycompany.mavenproject3;

import java.util.Scanner;

public class TemperatureRuangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- CEK TEMPERATURE RUANGAN ---");
        System.out.print("Masukkan suhu ruangan (C): ");
        int suhu = sc.nextInt();

        if (suhu < 18) {
            System.out.println("Suhu: " + suhu + "C -> Ruangan Dingin");
        } else if (suhu >= 18 && suhu <= 24) {
            System.out.println("Suhu: " + suhu + "C -> Ruangan Sejuk");
        } else if (suhu >= 25 && suhu <= 30) {
            System.out.println("Suhu: " + suhu + "C -> Ruangan Normal / Hangat");
        } else if (suhu > 30) {
            System.out.println("Suhu: " + suhu + "C -> Ruangan Panas");
        }
        
        sc.close();
    }
}
