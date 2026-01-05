package Jobsheet2;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok, tunjanganAnak, jmlAnak, jmlTunjanganAnak;
        double simpananWajib = 0.05, jmlSimpananWajib, gajiBersih;

        System.out.print("Jumlah gaji pokok adalah: ");
        gajiPokok = sc.nextInt();
        System.out.print("Jumlah tunjangan anak per bulan adalah: ");
        tunjanganAnak = sc.nextInt();
        System.out.print("Jumlah anak bu jesi adalah: ");
        jmlAnak = sc.nextInt();
        System.out.println("Simpanan wajib dana pensiun dari gaji pokok = " + simpananWajib);

        jmlSimpananWajib = gajiPokok * simpananWajib;
        jmlTunjanganAnak = tunjanganAnak * jmlAnak;
        gajiBersih = gajiPokok + jmlTunjanganAnak - jmlSimpananWajib;

        System.out.println("Total gaji bersih yang didapatkan bu jesi adalah: " + gajiBersih);
    }
}
