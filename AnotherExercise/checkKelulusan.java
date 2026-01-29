package AnotherExercise;

import java.util.Scanner;

public class checkKelulusan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== PENGECEKAN KELULUSAN =====");
        System.out.print("Masukkan nilai Anda: ");
        int nilai = sc.nextInt();

        if (nilai >= 75) {
            System.out.println("Selamat Anda Lulus!!!");
        } else {
            System.out.println("Nilai Anda belum mencukupi silahkan mencoba kembali.");
        }
    }
}
