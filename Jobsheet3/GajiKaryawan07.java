package Jobsheet3;

import java.util.Scanner;

public class GajiKaryawan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji, tunjTransp = 600000, tunjMkn = 400000;

        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = sc.nextInt();

        bonus = 0.05 * gajiPokok;
        totGaji = gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok);

        System.out.println("Bonus bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + totGaji);
    }
}
