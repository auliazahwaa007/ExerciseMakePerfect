package Jobsheet8;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabang;
        int totalPelangganSemua = 0;
        int totalItemSemua = 0;

        System.out.print("Jumlah cabang kafe: ");
        jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int cabang = 1; cabang <= jumlahCabang; cabang++) {
            System.out.println("\n--- Cabang " + cabang + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                System.out.print("- Pelanggan " + pelanggan + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang " + cabang + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            totalPelangganSemua += jumlahPelanggan;
            totalItemSemua += totalItemCabang;
        }

        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganSemua + " orang");
        System.out.println("Item terjual: " + totalItemSemua + " item");
    }
}
