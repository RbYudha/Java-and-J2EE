package Sesi_27;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        int tahun;
        System.out.println("-Sistem Pengecekan Tahun Kabisat-");
        System.out.println("---------------------------------------");

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan tahun = ");
        tahun = scan.nextInt();

        if (tahun % 4 == 0) {
            System.out.println("Tahun " + tahun + " merupakan tahun kabisat");
        } else if (tahun % 4 != 0) {
            System.out.println("Tahun " + tahun + " bukan merupakan tahun kabisat");
        } else {
            System.out.println("Input tidak valid");
        }
        scan.close();
    }

}
