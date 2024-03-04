package soal5;

import java.util.Scanner;

public class soall2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int awal = scanner.nextInt();

        int akhir = scanner.nextInt();

        int jumlahGenap = cetak(awal, akhir);

        System.out.println("Jumlah bilangan genap dari " + awal + " sampai " + akhir + " adalah: " + jumlahGenap);
    }

    public static int cetak(int awal, int akhir) {
        int jumlahGenap = 0;
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                jumlahGenap++;
            }
        }
        return jumlahGenap;
    }
}
