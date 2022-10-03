public class Latihan4 {
    public static void main(String[] args) {
        // Buat Variabel
        int a = 10;
        int b = 8;
        int c = 12;
        int d = 5;

        // 1. > , hasil yang diinginkan true
        System.out.println("Tes ke-1 menggunakan simbol >, hasil = " + (a > b));

        // 2. < , hasil yang diinginkan true
        System.out.println("Tes ke-2 menggunakan simbol <, hasil = " + (b < c));

        // 3. >= , hasil yang diinginkan true
        System.out.println("Tes ke-3 menggunakan simbol >=, hasil = " + (a >= b));

        // 4. <= , hasil yang diinginkan true
        System.out.println("Tes ke-4 menggunakan simbol <=, hasil = " + (b <= c));

        // 5. == , hasil yang diinginkan true
        System.out.println("Tes ke-5 menggunakan simbol ==, hasil = " + (a == 10));

        // 6. != , hasil yang diinginkan true
        System.out.println("Tes ke-6 menggunakan simbol !=, hasil = " + (a != 99));

        // 7. > , hasil yang diinginkan false
        System.out.println("Tes ke-7 menggunakan simbol >, hasil = " + (d > c));

        // 8. <= , hasil yang diinginkan false
        System.out.println("Tes ke-8 menggunakan simbol <=, hasil = " + (c <= a));

        // 9. == , hasil yang diinginkan false
        System.out.println("Tes ke-9 menggunakan simbol ==, hasil = " + (c == a));

        // 10. != , hasil yang diinginkan false
        System.out.println("Tes ke-2 menggunakan simbol !=, hasil = " + (d != 5));

    }

}
