package Sesi_27;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Latihan3 {
    public static void main(String[] args) {
        double beli = 1000000;
        double diskon = 0.1;
        double hargaBayar;

        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');

        kursIndo.setDecimalFormatSymbols(formatRp);

        System.out.println("-Sistem Diskon Menggunakan Java-");
        System.out.println("-----------------------------------");
        System.out.println();

        System.out.println("Harga Pembelian Normal  = " + kursIndo.format(beli).replace(".00", "") + ",-");
        hargaBayar = beli - (beli * diskon);
        System.out.println("Anda mendapat diskon = 10%");
        System.out.println("Harga yang harus anda bayar adalah = " + kursIndo.format(hargaBayar).replace(".00", ""));
    }
}
