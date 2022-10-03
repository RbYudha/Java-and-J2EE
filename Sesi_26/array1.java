package Sesi_26;

public class array1 {
    public static void main(String[] args) {
        int[] contoh = new int[4];

        contoh[0] = 1;
        contoh[1] = 2;
        contoh[2] = 3;
        contoh[3] = 4;

        System.out.println("array index ke-0 = " + contoh[0]);
        // System.out.println("array index ke-0 = " + contoh[4]);
        System.out.println("Jumlah array = " + contoh.length);
        System.out.println("Akses nilai array terakhir = " + contoh[contoh.length - 1]);

    }
}
