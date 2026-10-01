package com.mycompany.operator;

public class Operator {
    public static void main(String[] args) {
        int a = 80;
        int b = 75;

        System.out.println(a >= b); // true = Lebih Besar Sama Dengan
        System.out.println(a <= b); // false = Lebih Kecil Sama Dengan
        System.out.println(b <= 75); // true
        
        if(a >= 75){
            System.out.println("Lulus Conformance");
        }
    }
}
