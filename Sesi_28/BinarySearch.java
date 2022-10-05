package Sesi_28;

import java.util.Scanner;

public class BinarySearch {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[] = { 5, 8, 12, 15, 17, 23, 26, 30, 34, 38, 42, 54, 64, 78, 81 };// deret angka

        System.out.println("-Coba Binary Search-");
        System.out.print("Deret bilangan : ");
        for (int i : data) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Cari bilangan : ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();

        boolean ketemu = false;
        int banyak = data.length;
        int kiri = 1;
        int kanan = banyak;
        int tengah = (kiri + kanan) / 2;
        int posisi = tengah;
        while (ketemu == false && kiri <= kanan) {
            if (data[tengah] == x) {
                ketemu = true;
            } else {
                if (x < data[posisi]) {
                    kanan = tengah--;
                }
                if (x > data[posisi]) {
                    kiri = tengah++;
                }
            }
        }

        System.out.println("");
        System.out.println("Data yang dicari = " + x);
        if (ketemu == true) {
            posisi = tengah;
            System.out.println("Data tersebut berada pada index ke-" + posisi);
        } else {
            posisi = 0;
            System.out.println("Data yang anda cari tidak ditemukan!");
        }
    }
}