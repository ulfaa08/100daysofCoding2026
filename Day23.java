package com.mycompany.menghitungluaspersegi;
import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();

        double luas = sisi * sisi;

        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas);
    }
}
