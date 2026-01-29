package AnotherExercise.Pemilihan;

import java.util.Scanner;

public class minimarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon = 0.1;

        System.out.print("Masukkan total belanja Anda: ");
        int totalBelanja = sc.nextInt();

        if (totalBelanja >= 100000) {
            double diskonHarga = totalBelanja * diskon;
            double totalBayar = totalBelanja - diskonHarga;
            System.out.println("Selamat Anda mendapatkan diskon sebesar 10%!!!");
            System.out.println("Total pembayaran Anda adalah: Rp. " + totalBayar); 
        } else {
            System.out.println("Total pembayaran Anda adalah: Rp. " + totalBelanja);
        }
    }
}
