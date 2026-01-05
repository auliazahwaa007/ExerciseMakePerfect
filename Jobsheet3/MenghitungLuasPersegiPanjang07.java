package Jobsheet3;
import java. util.Scanner;

public class MenghitungLuasPersegiPanjang07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.print("Masukkan panjang: ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = sc.nextInt();
        
        luas = panjang * lebar;

        System.out.println("Luas persegi adalah: " + luas);
    }
}
