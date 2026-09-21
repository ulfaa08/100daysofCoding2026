package primitifkestring;

public class PrimitifKeString {
    public static void main(String[] args) {
        
        System.out.println("=== MENGUBAH TIPE PRIMITIF KE STRING ===");

        // 1. byte ke String
        byte b = 100;
        String s1 = String.valueOf(b);
        System.out.println("1. byte ke String: " + b + " jadi \"" + s1 + "\"");

        // 2. short ke String
        short s = 500;
        String s2 = String.valueOf(s);
        System.out.println("2. short ke String: " + s + " jadi \"" + s2 + "\"");

        // 3. int ke String
        int i = 2000;
        String s3 = String.valueOf(i);
        System.out.println("3. int ke String: " + i + " jadi \"" + s3 + "\"");

        // 4. long ke String
        long l = 10000L;
        String s4 = String.valueOf(l);
        System.out.println("4. long ke String: " + l + " jadi \"" + s4 + "\"");

        // 5. float ke String
        float f = 10.5f;
        String s5 = String.valueOf(f);
        System.out.println("5. float ke String: " + f + " jadi \"" + s5 + "\"");

        // 6. double ke String
        double d = 99.99;
        String s6 = String.valueOf(d);
        System.out.println("6. double ke String: " + d + " jadi \"" + s6 + "\"");

        // 7. char ke String
        char c = 'A';
        String s7 = String.valueOf(c);
        System.out.println("7. char ke String: " + c + " jadi \"" + s7 + "\"");

        // 8. boolean ke String
        boolean bool = true;
        String s8 = String.valueOf(bool);
        System.out.println("8. boolean ke String: " + bool + " jadi \"" + s8 + "\"");
    }
}
