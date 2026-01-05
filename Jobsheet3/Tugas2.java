package Jobsheet3;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jarak;
        int hargaBensinperLiter = 10000;

        System.out.print("Masukkan jarak yang ditempuh: ");
        jarak = sc.nextDouble();
        System.out.println("Harga bensin per liternya adalah Rp. " + hargaBensinperLiter);

        double biayaBensin = jarak / 2 * hargaBensinperLiter;

        System.out.println("Biaya yang bensin diperlukan untuk perjalanan tersebut adalah Rp. " + biayaBensin);
    }
}
