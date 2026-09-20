package konversimanual;

public class KonversiManual {
    public static void main(String[] args) {
        
        System.out.println("=== KONVERSI MANUAL/PAKSA (Besar ke Kecil) ===");

        // 1. double (paling besar) -> float (harus paksa)
        double d = 100.99;
        float f = (float) d;
        System.out.println("1. double ke float: " + d + " jadi " + f);

        // 2. float -> long
        float f2 = 200.5f;
        long l = (long) f2;
        System.out.println("2. float ke long: " + f2 + " jadi " + l + " (koma hilang)");

        // 3. long -> int
        long l2 = 3000L;
        int i = (int) l2;
        System.out.println("3. long ke int: " + l2 + " jadi " + i);

        // 4. int -> short
        int i2 = 400;
        short s = (short) i2;
        System.out.println("4. int ke short: " + i2 + " jadi " + s);

        // 5. short -> byte (paling kecil)
        short s2 = 150;
        byte b = (byte) s2;
        System.out.println("5. short ke byte: " + s2 + " jadi " + b);

        // 6. int -> char (angka jadi huruf)
        int angka = 65;
        char c = (char) angka;
        System.out.println("6. int ke char: " + angka + " jadi '" + c + "'");

        // 7. double -> int (contoh data hilang paling jelas)
        double d2 = 99.99;
        int i3 = (int) d2;
        System.out.println("7. double ke int: " + d2 + " jadi " + i3 + " (koma kepotong)");

        // 8. boolean
        boolean bool = true;
        System.out.println("8. boolean: " + bool + " (tetap tidak bisa dikonversi)");
    }
}
