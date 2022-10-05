package Sesi_28;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan jumlah data : ");
        int jml_data = scan.nextInt();

        int[] data = new int[jml_data];
        System.out.println();
        for (int i = 0; i < jml_data; i++) {
            System.out.print("Input nilai data ke-" + (i + 1) + " : ");
            data[i] = scan.nextInt();
        }

        System.out.println();
        System.out.print("Data sebelum di sorting : ");
        for (int i = 0; i < jml_data; i++) {
            System.out.println(data[i] + " ");
        }

        System.out.println("\n\n Proses selection sort");
        for (int i = 0; i < jml_data; i++) {
            System.out.println("Iterasi ke-" + (i + 1) + " : ");
            for (int j = 0; j < jml_data; j++) {
                System.out.println(data[j] + " ");
            }

            System.out.println("Apakah data " + data[i] + " sudah benar urutannya");

            boolean tukar = false;
            int index = 0;
            int min = data[i];
            String pesan = "    Tidak ada pertukaran";

            for (int j = 0; j < jml_data; j++) {
                if (min > data[j]) {
                    tukar = true;
                    index = j;
                    min = data[j];
                }
            }
            if (tukar == true) {
                pesan = "Data ditukar";
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }

            for (int j = 0; j < jml_data; j++) {
                System.out.println(data[j] + " ");
            }

            System.out.println(pesan + "\n");
        }

        System.out.println("Data setelah sorting : ");
        for (int i = 0; i < jml_data; i++) {
            System.out.print(data[i] + " ");
        }

        scan.close();
    }

}
