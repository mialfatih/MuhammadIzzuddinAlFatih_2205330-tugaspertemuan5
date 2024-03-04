package soal5;

import java.util.Scanner;

public class soall1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loopIng = scanner.nextInt();

        Loop(loopIng);
    }

    public static void Loop(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
}
