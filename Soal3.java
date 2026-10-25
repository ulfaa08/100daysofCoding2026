package soal3;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String s = sc.nextLine().replace(',', '.');
        
        try {
            double rating = Double.parseDouble(s);
            int nilai = (int) rating; 

            if (rating < 1 || rating >= 4) {
                System.out.println("Input tidak valid");
            } else {
                
                switch (nilai) {
                    case 1:
                        System.out.println("Rating: Buruk");
                        break;
                    case 2:
                        System.out.println("Rating: Biasa");
                        break;
                    case 3:
                        System.out.println("Rating: Bagus");
                        break;
                    default:
                        System.out.println("Input tidak valid");
                }
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid");
        }
    }
}
