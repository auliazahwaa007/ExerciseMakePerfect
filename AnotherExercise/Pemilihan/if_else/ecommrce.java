package AnotherExercise.Pemilihan.if_else;

import java.util.Scanner;

public class ecommrce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah pembayaran sudah lunas? (True/False): ");
        boolean statusPembayaran = sc.nextBoolean();
        System.out.print("Apakah stok tersedia? (True/False): ");
        boolean stok = sc.nextBoolean();

        if (statusPembayaran == true && stok == true) {
            System.out.println("Pesanan Anda sedang diproses.");
        } else if (statusPembayaran == false) {
            System.out.println("Sedang menunggu pembayaran.");
        } else if (stok == false) {
            System.out.println("Maaf stok habis.");
        }
    }
}
