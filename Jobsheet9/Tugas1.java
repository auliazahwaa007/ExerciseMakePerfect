package Jobsheet9;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai mahasiswa yang akan di input: ");
        int n = sc.nextInt();

        int arrNilai[] = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
            total += arrNilai[i];
        }
        int nilaiTertinggi = arrNilai[0];
        int nilaiTerendah = arrNilai[0];
        
         for (int i = 1; i < n; i++) {
            if (arrNilai[i] > nilaiTertinggi) {
                nilaiTertinggi = arrNilai[i];
            }
            if (arrNilai[i] < nilaiTerendah) {
                nilaiTerendah = arrNilai[i];
            }
        }
            double rataRata = (double) total / n;
            
            System.out.println("\n===== HASIL PENGOLAHAN NILAI =====");
            System.out.print("Nilai mahasiswa: ");
            for (int i = 0; i < n; i++) {
            System.out.print(arrNilai[i] + " ");
        }
        System.out.println("\nNilai rata-rata   : " + rataRata);
        System.out.println("Nilai tertinggi   : " + nilaiTertinggi);
        System.out.println("Nilai terendah    : " + nilaiTerendah);

        sc.close();
    }
}
