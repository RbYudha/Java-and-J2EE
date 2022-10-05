package Sesi_27;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Barang[] arr;
        Barang[] arr2;

        int[] kodeBarang = new int[5];
        int[] qty = new int[5];
        double[] subTotal = new double[5];
        double totalBayar = 0;

        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');

        kursIndo.setDecimalFormatSymbols(formatRp);

        arr = new Barang[5];
        arr[0] = new Barang(1, "Mouse Bluetooth 5.0 ", 149999.00, 0.1);
        arr[1] = new Barang(2, "Headphone Eksternal ", 246000.00, 0.05);
        arr[2] = new Barang(3, "Power Bank          ", 136000.00, 0);
        arr[3] = new Barang(4, "Tripod Kamera       ", 267999.00, 0.2);
        arr[4] = new Barang(5, "Smart watch Xiomi   ", 899000.00, 0.1);

        arr2 = new Barang[100];

        System.out.println("-Sistem Penjualan Menggunakan Java-");
        System.out.println("---------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah pembelian barang = ");
        int jumlah = scan.nextInt();
        System.out.println();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan kode barang ke-" + (i + 1) + " = ");
            kodeBarang[i] = scan.nextInt();
            System.out.print("Masukan jumlah barang ke-" + (i + 1) + " = ");
            qty[i] = scan.nextInt();
            if (kodeBarang[i] == 1) {
                // arr[0].display();
                arr2[i] = new Barang(arr[0].getNo(), arr[0].getNama(), arr[0].getHarga(), arr[0].getDiskon());
            }
            if (kodeBarang[i] == 2) {
                // arr[1].display();
                arr2[i] = new Barang(arr[1].getNo(), arr[1].getNama(), arr[1].getHarga(), arr[1].getDiskon());
            }
            if (kodeBarang[i] == 3) {
                // arr[2].display();
                arr2[i] = new Barang(arr[2].getNo(), arr[2].getNama(), arr[2].getHarga(), arr[2].getDiskon());
            }
            if (kodeBarang[i] == 4) {
                // arr[3].display();
                arr2[i] = new Barang(arr[3].getNo(), arr[3].getNama(), arr[3].getHarga(), arr[3].getDiskon());
            }
            if (kodeBarang[i] == 5) {
                // arr[4].display();
                arr2[i] = new Barang(arr[4].getNo(), arr[4].getNama(), arr[4].getHarga(), arr[4].getDiskon());
            }
        }
        scan.close();

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("Struk Pembelian");
        System.out.println("---------------------------------------");

        System.out.println("No" + "\t" +
                "Nama barang" + "\t \t" +
                "Harga" + "\t \t" +
                "Qty" + "\t" +
                "Diskon" + "\t" +
                "SubTotal");

        for (int i = 0; i < jumlah; i++) {
            // System.out.println(arr2[i].getNama());

            subTotal[i] = ((arr2[i].getHarga() - (arr2[i].getHarga() * arr2[i].getDiskon())) * qty[i]);

            System.out.println((i + 1) + "\t" +
                    arr2[i].getNama() + "\t" +
                    kursIndo.format(arr2[i].getHarga()) + "\t" +
                    " " + qty[i] + "\t" +
                    (int) (arr2[i].getDiskon() * 100) + "%" + "\t" +
                    kursIndo.format(subTotal[i]));

            totalBayar += subTotal[i];
        }
        System.out.println("---------------------------------------");
        System.out.println("Total pembayaran adalah = " + kursIndo.format(totalBayar));
        System.out.println("---------------------------------------");

    }

}
