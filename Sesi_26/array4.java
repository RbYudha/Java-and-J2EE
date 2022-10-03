package Sesi_26;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Masukan nilai array : ");
            int n = scan.nextInt();

            int[] angka = new int[n];

            for (int i = 0; i < angka.length; i++) {
                System.out.print("angka index ke-" + i + ": ");
                angka[i] = scan.nextInt();
            }

            int min = angka[0];
            int max = angka[0];
            System.out.println("-----------");
            System.out.println("List angka:");

            for (int b : angka) {
                System.out.println(b);
            }

            for (int i = 0; i < angka.length; i++) {
                if (angka[i] > max) {
                    max = angka[i];
                }
                if (angka[i] < min) {
                    min = angka[i];
                }
            }

            System.out.println("Angka max adalah = " + max);
            System.out.println("Angka min adalah = " + min);

            scan.close();
        }
    }

}
