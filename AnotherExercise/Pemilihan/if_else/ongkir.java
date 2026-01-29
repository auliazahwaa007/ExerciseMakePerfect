package AnotherExercise.Pemilihan.if_else;

import java.util.Scanner;

public class ongkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        int totalBelanja = sc.nextInt();
        System.out.print("Apakah alamat pengiriman berada di area dalam kota? (True/false): ");
        boolean alamat = sc.nextBoolean();
        if (totalBelanja >= 200000) {
            if (alamat == true) {
                System.out.println("Selamat Anda mendapatkan promo gratis ongkos kirim");
            } else {
                System.out.println("Alamat Anda berada di area dalam kota. promo ongkos kirim belum bisa didapatkan.");
            }
        } else {
            System.out.println("Total Pembelian Anda belum memenuhi batas minimum. promo ongkos kirim belum bisa didapatkan.");
        }
    }
}
