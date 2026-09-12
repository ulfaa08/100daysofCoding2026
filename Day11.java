package biodata9tipedata;

import java.util.Scanner;

public class Biodata9TipeData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========= INPUT BIODATA =========");
        // 1. String
        System.out.print("1. Nama Lengkap [String] : ");
        String nama = input.nextLine();
        // 2. int
        System.out.print("2. Umur [int] : ");
        int umur = input.nextInt();
        // 3. double
        System.out.print("3. Tinggi Badan [double] : ");
        double tinggi = input.nextDouble();
       // 4. float
        System.out.print("4. Berat Badan [float] : ");
        float berat = input.nextFloat();
        
        input.nextLine(); // buat buang enter
       // 5. char
        System.out.print("5. Jenis Kelamin L/P [char] : ");
        char jk = input.nextLine().charAt(0);
       // 6. boolean
        System.out.print("6. Status Mahasiswa [true/false] : ");
        boolean status = input.nextBoolean();
       // 7. long
        System.out.print("7. No HP [long] : ");
        long noHp = input.nextLong();
       // 8. short
        System.out.print("8. Tahun Masuk [short] : ");
        short tahunMasuk = input.nextShort();
       // 9. byte
        System.out.print("9. Jumlah Saudara [byte] : ");
        byte jmlSaudara = input.nextByte();
        
        System.out.println("Data berhasil disimpan!"); // opsional
        
        input.close();
    }
  
}
