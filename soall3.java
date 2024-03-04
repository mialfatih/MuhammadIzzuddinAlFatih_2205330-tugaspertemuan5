package soal5;

import java.util.Scanner;

public class soall3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int b = input.nextInt();

        int hasil = FPB(a, b);

        System.out.println("Faktor Persekutuan Terbesar dari " + a + " dan " + b + " adalah: " + hasil);
    }

    public static int FPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
