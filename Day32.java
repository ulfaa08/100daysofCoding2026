package com.mycompany.latihanoperator;

public class LatihanOperator {
    public static void main(String[] args) {
        int conformance = 80;
        int fitness = 60;

        boolean lulusConformance = conformance >= 75; // true
        boolean lulusFitness = fitness >= 75; // false

        // Kombinasi AND, OR, NOT
        boolean hasilAND = lulusConformance && lulusFitness;
        boolean hasilOR = lulusConformance || lulusFitness;
        boolean hasilKombinasi = lulusConformance && !lulusFitness;

        System.out.println("AND (&&) = " + hasilAND); // false
        System.out.println("OR (||) = " + hasilOR); // true
        System.out.println("Kombinasi (&& + !) = " + hasilKombinasi); // true
        System.out.println("Kombinasi (|| + && + !) = " + ((lulusConformance || lulusFitness) && !lulusFitness));
    }
}
