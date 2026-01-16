package Jobsheet9;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappucino",
            "Chocolate Ice"
        };

        System.out.print("Masukkan nama makanan yang dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;

        for(int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Makanan \"" + cari + "\" tersedian di menu");
        } else {
            System.out.println("Makanan \"" + cari + "\" tidak tersedia di menu");
        }
    }
}
