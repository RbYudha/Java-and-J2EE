package Sesi_27;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        System.out.println("Menentukan bilangan Terbesar, Terkecil dan Rata-rata:");
        System.out.println("------------------------------------------------------");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukan bilangan pertama (X) = ");
            float angka1 = input.nextFloat(); // Read user input
            System.out.print("Masukan bilangan kedua (Y) = ");
            float angka2 = input.nextFloat(); // Read user input
            System.out.print("Masukan bilangan ketiga (Z) = ");
            float angka3 = input.nextFloat(); // Read user input

            System.out.println();
            System.out.println("Hasil :");
            System.out.println("Rata-rata adalah: " + ((angka1 + angka2 + angka3) / 3)); // Output user input

            double[] arr = { angka1, angka2, angka3 };

            // untuk mencari bilangan terbesar
            double max = arr[0];
            // Loop through the array
            for (int i = 0; i < arr.length; i++) {
                // Compare elements of array with min
                if (arr[i] > max)
                    max = arr[i];
            }
            System.out.println(max + " adalah bilangan terbesar");

            // untuk mencari bilangan terkecil
            double min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min)
                    min = arr[i];
            }
            System.out.println(min + " adalah bilangan terkecil");

        }

    }

}
