package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        //double rata2;
        //int jumlahLulus = 0;
        //int jmlMhs;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        
        for(int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for(int i = 0; i < nilaiMhs.length; i++) {
            totalLulus += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }
        double rataLulus = totalLulus/jmlLulus;
        double rataTidakLulus = totalTidakLulus/jmlTidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
