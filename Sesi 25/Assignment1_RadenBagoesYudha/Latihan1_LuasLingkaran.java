import java.util.Scanner;

public class Latihan1_LuasLingkaran {
    public static void main(String[] args) {
        Double luas, pi;
        int r;

        pi = 3.14;
        // r = 18;

        // scan
        Scanner input1 = new Scanner(System.in);

        // Hasil
        System.out.println("----Sistem menghitung Luas Linkaran----");
        System.out.print("Masukan Jari-jari lingkaran = ");
        r = input1.nextInt();
        luas = pi * r * r;

        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah = " + luas);
    }

}
