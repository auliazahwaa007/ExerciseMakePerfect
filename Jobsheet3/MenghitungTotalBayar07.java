package Jobsheet3;

import java.util.Scanner;

public class MenghitungTotalBayar07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int harga;
        double potongan, jmlBayar, diskon = 0.15, harga;

        System.out.print("Masukkan harga: ");
        harga = sc.nextInt();

        potongan = diskon * harga;
        jmlBayar = harga - potongan;

        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jmlBayar);
    }
}
