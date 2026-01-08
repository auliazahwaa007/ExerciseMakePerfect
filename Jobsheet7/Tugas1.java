package Jobsheet7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalTiket = 0;
        double totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah pengunjung bioskop (ketik 'selesai' untuk perhitungan): ");
            String jmlPengunjung = sc.nextLine();
             if (jmlPengunjung.equalsIgnoreCase("Selesai") ) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
           // System.out.print("");
            int pengunjung = Integer.parseInt(jmlPengunjung);
            for (int i = 1; i <= pengunjung; i++) {
                System.out.print("Masukkan nama pengunjung: ");
                String namaPengunjung = sc.nextLine();
                System.out.print("Masukkan jumlah pembelian tiket pelanggan ke-" + i + " :");
                int jmlTiket = sc.nextInt();
                sc.nextLine();
                if (jmlTiket <= 0) {
                    System.out.println("Jumlah tiket tidak valid, harap melakukan input ulang!");
                    continue;
                }

                int hargaTiket = 50000;
                double totalBayar;
                if (jmlTiket > 4) {
                    int hargaSebelumDiskon4 = jmlTiket * hargaTiket;
                    double diskon4 = hargaSebelumDiskon4 * 0.1;
                    totalBayar = hargaSebelumDiskon4 - diskon4;
                    System.out.println("Selamat anda mendapatkan disko sebesar 10%!!");
                   // System.out.println("Total pembelian anda adalah Rp." + totalBayar);
                } else if (jmlTiket > 10) {
                    int hargaSebelumDiskon10 = jmlTiket * hargaTiket;
                    double diskon10 = hargaSebelumDiskon10 * 0.15;
                    totalBayar = hargaSebelumDiskon10 - diskon10;
                    System.out.println("Selamat anda mendapatkan disko sebesar 15%!!");
                  //  System.out.println("Total pembelian anda adalah Rp." + totalBayar);
                } else {
                    totalBayar = hargaTiket * jmlTiket;
                  //  System.out.println("Total pembelian anda adalah Rp." + totalBayar);
                }
                System.out.println("Total pembelian anda adalah Rp." + totalBayar);
                totalTiket += jmlTiket;
                // double totalBayar;
                totalPenjualan += totalBayar;
            }
        } while (true);
        System.out.println("Semua transaksi selesai.");
        System.out.println("Total tiket yang terjual hari ini adalah: " + totalTiket);
        System.out.println("Total penjualan hari ini adalah: " + totalPenjualan);
    }
}
