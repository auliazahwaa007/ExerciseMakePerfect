package Jobsheet9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];
        
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("Harga: ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }

        double totalBiaya = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }
        System.out.println("\n======= DAFTAR PESANAN =======");
        for(int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("---------------------------------");
        System.out.println("Total Biaya Rp " + totalBiaya);
    }
}
