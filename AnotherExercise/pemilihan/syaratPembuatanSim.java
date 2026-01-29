package AnotherExercise;

import java.util.Scanner;

public class syaratPembuatanSim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Umur pengguna: ");
        int umur = sc.nextInt();

        if (umur < 17) {
            System.out.println("Usia belum legal.");
        } else {
            System.out.println("Usia sesuai silahkan membuat SIM");
        }
    }
    
}
