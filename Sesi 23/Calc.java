import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int a1;
        int a2;
        int h;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan angka pertama: ");
        a1 = scan.nextInt();
        System.out.print("Masukan angka Kedua: ");
        a2 = scan.nextInt();

        // penjumlahan
        h = a1 + a2;
        System.out.println("Hasil = " + h);

        // pengurangan
        h = a1 - a2;
        System.out.println("Hasil = " + h);

        // perkalian
        h = a1 * a2;
        System.out.println("Hasil = " + h);

        // pembagian
        h = a1 / a2;
        System.out.println("Hasil = " + h);

        // mod
        h = a1 % a2;
        System.out.println("Hasil = " + h);

        System.out.println("Test nilai ++");
        System.out.println(++a1);
        System.out.println(a1++);

    }
}
