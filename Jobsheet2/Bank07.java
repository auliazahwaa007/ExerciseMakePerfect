package Jobsheet2;
import java.util.Scanner;

public class Bank07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlTabunganAwal, lamaMenabung;
        double prosentaseBunga = 0.02, bunga, jmlTabunganAkhir;

        System.out.println("Masukkan jumlah tabungan awal anda: ");
        jmlTabunganAwal = sc.nextInt();
        System.out.println("Masukkan lama menabung anda: ");
        lamaMenabung = sc.nextInt();

        bunga = lamaMenabung * prosentaseBunga * jmlTabunganAwal;
        jmlTabunganAkhir = bunga + jmlTabunganAwal;

        System.out.println("Bunga adalah: " + bunga);
        System.out.println("Jumlah tabungan akhir adalah: " + jmlTabunganAkhir);
    }
}
