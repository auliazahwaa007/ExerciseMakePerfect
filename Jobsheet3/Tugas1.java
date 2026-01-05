package Jobsheet3;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int hargaMotor, uangMuka, lamaCicil;
        double bunga = 0.01, jmlCicilanPerBulan;
        
        System.out.print("Masukkan harga motor: ");
        hargaMotor = sc.nextInt();
        System.out.print("Masukkan jumlah uang muka: ");
        uangMuka = sc.nextInt();
        System.out.print("Masukkan lama cicilan: ");
        lamaCicil = sc.nextInt();

        int sisaHarga = hargaMotor - uangMuka;
        double bungaPerBulan = 0.01 * sisaHarga;
        double totalBayar = sisaHarga + bungaPerBulan;
        double totalCicilanPerBulan = totalBayar / lamaCicil;

        System.out.println("Sisa harga yang harus dibayarkan adalah Rp." + sisaHarga);
        System.out.println("Bunga yang harus dibayarkan, perbulannya adalah Rp." + bungaPerBulan);
        System.out.println("Total pembayaran adalah Rp." + totalBayar);
        System.out.println("Cililan perbulannya adalah Rp." + totalCicilanPerBulan);
        
    }
}
