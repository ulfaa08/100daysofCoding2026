package konversiotomatis;

public class KonversiOtomatis {
    public static void main(String[] args) {
        
        System.out.println("=== KONVERSI OTOMATIS (Kecil ke Besar) ===");

        // 1. byte (paling kecil)
        byte b = 100;
        System.out.println("1. byte: " + b);

        // 2. byte -> short
        short s = b;
        System.out.println("2. byte ke short: " + s);

        // 3. short -> int
        int i = s;
        System.out.println("3. short ke int: " + i);

        // 4. int -> long
        long l = i;
        System.out.println("4. int ke long: " + l);

        // 5. long -> float
        float f = l;
        System.out.println("5. long ke float: " + f);

        // 6. float
        double d = f;
        System.out.println("6. float ke double: " + d);

        // 7. char -> int (
        char c = 'A';
        int dariChar = c; // 'A' jadi 65
        System.out.println("7. char ke int: '" + c + "' jadi " + dariChar);

        // 8. boolean
        boolean bool = true;
        System.out.println("8. boolean: " + bool + " (tipe ini tidak bisa dikonversi)");

        // Contoh lengkap urutannya
        System.out.println("\n--- Contoh Rantai Lengkap ---");
        byte nilaiAwal = 50;
        double nilaiAkhir = nilaiAwal; 
        System.out.println("byte " + nilaiAwal + " otomatis menjadi double " + nilaiAkhir);
    }
}
