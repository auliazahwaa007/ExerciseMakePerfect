package Jobsheet1;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int lebar, panjang, diameter, panjangSisi, luasTanah;
        double luasKolamLingkaran, luasKolamPersegi, jari2Lingkaran, luasRumput, lebar, panjang, diameter, panjangSisi, luasTanah;

        System.out.print("Lebar tanah adalah: ");
        lebar = sc.nextDouble();
        System.out.print("Panjang tanah adalah: ");
        panjang = sc.nextDouble();
        System.out.print("Diameter kolam lingkaran adalah: ");
        diameter = sc.nextDouble();
        System.out.print("Panjang sisi kolam persegi adalah: ");
        panjangSisi = sc.nextDouble();
        
        luasTanah = panjang * lebar;
        jari2Lingkaran = diameter / 2;
        luasKolamLingkaran = 3.14 * jari2Lingkaran * jari2Lingkaran;
        luasKolamPersegi = panjangSisi * panjangSisi;
        luasRumput = (luasTanah - (luasKolamLingkaran + luasKolamPersegi));

        System.out.println("Luas kolam lingkaran adalah: " + luasKolamLingkaran + " Meter");
        System.out.println("Luas kolam persegi adalah: " + luasKolamPersegi + " Meter");
        System.out.println("Luas tanah yang akan ditanami rumput adalah: " + luasRumput + " Meter");
    }
}
