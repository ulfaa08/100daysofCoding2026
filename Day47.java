package com.mycompany.operatorpenugasan;

public class main {
    public static void main (String[] args) {
        int stok = 10; 
        System.out.println("stok awal:" + stok);
        stok += 5;
        System.out.println("Tambah5 += : " + stok);
        stok -=3;
        System.out.println("Pinjam 3 -= : " + stok);
        stok *= 2;
        System.out.println("kali 2 *= " + stok);
        stok /= 4; 
        System.out.println("Bagi 4/= : " + stok);
        stok %= 3;
        System.out.println("Sisa bagi 3 %= " + stok);
        
    }
            
}
