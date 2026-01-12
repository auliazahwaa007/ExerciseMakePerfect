package Jobsheet9;

import java.util.Scanner;

public class SearchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int n = sc.nextInt();

        int[] arrNilai = new int[n];

        // Input nilai mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        boolean ketemu = false;
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (i + 1));
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("\nNilai " + key + " tidak ditemukan");
        }

        sc.close();
    }
}
