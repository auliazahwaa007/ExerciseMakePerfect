package Jobsheet1;

public class Tugas1 {
    public static void main(String[] args) {
        
        int gajiPokok = 3000000, tunjanganAnak = 150000, jmlAnak = 3, jmlTunjanganAnak;
        double simpananWajib = 0.05, jmlSimpananWajib, gajiBersih;

        System.out.println("Jumlah gaji pokok adalah: " + gajiPokok);
        System.out.println("Jumlah tunjangan anak per bulan adalah: " + tunjanganAnak);
        System.out.println("Jumlah anak bu jesi adalah: " + jmlAnak);
        System.out.println("Simpanan wajib dana pensiun dari gaji pokok = " + simpananWajib);

        jmlSimpananWajib = gajiPokok * simpananWajib;
        jmlTunjanganAnak = tunjanganAnak * jmlAnak;
        gajiBersih = gajiPokok + jmlTunjanganAnak - jmlSimpananWajib;

        System.out.println("Total gaji bersih yang didapatkan bu jesi adalah: " + gajiBersih);
    }
}
