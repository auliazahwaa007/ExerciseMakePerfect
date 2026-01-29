package AnotherExercise.Pemilihan.if_else;

import java.util.Scanner; 

public class sistemPerkuliahan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total nilai Anda: ");
        int nilai = sc.nextInt();
        System.out.print("Masukkan Prosentase kehadiran (%): ");
        int kehadiran = sc.nextInt();

        if (kehadiran >= 80) {
            if (nilai >= 75) {
                System.out.println("Selamat Anda dinyatakan LULUS!!");
            } else {
                System.out.println("Anda BELUM LULUS. Nilai Anda tidak memenuhi minimum.");
            }
        } else {
            System.out.println("Anda BELUM LULUS. Prosentase kehadiran anda tidak mencapai 80%");
        }
    }
}
