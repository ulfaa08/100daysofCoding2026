package com.mycompany.operatorlogika;

public class OperatorLogika {
    public static void main(String[] args) {
        int nilaiConformance = 80;
        int nilaiFitness = 60;
        
        boolean lulusConformance = nilaiConformance >= 75;
        boolean lulusFitness = nilaiFitness >= 75;

        System.out.println("AND: " + (lulusConformance && lulusFitness));
        System.out.println("OR: " + (lulusConformance || lulusFitness));
        System.out.println("NOT: " + (!lulusFitness));
    }
}
