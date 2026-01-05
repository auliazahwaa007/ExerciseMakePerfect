package Jobsheet1;

public class Tugas2 {
    public static void main(String[] args) {
        
        int lebar = 50, panjang = 100, diameter = 2, panjangSisi = 2, luasTanah;
        double luasKolamLingkaran, luasKolamPersegi, jari2Lingkaran, luasRumput;

        System.out.println("Lebar tanah adalah: " + lebar + " Meter");
        System.out.println("Panjang tanah adalah: " + panjang + " Meter");
        
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
