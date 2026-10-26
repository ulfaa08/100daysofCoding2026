package javaapplication24;

import java.util.Scanner;

public class Breakdanreturn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N = s.nextInt();

        System.out.println("contoh continue: ");
        for(int i=1;i<=N;i++){if(i==4)continue;System.out.print(i+" ");}

        System.out.println("\ncontoh break: ");
        for(int i=1;i<=N;i++){if(i==6)break;System.out.print(i+" ");}

        System.out.println("\ncontoh return: ");
        System.out.println("Hasil penjumlahan : "+tambah(10,7));
    }
    
    static int tambah(int x, int y){
        return x + y;
    }
}
