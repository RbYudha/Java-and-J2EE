public class Latihan5b {
    public static void main(String[] args) {
        int y1 = 10;
        int y2 = 25;

        System.out.println("--Latihan 5--");
        System.out.println("Nilai y1 = " + y1);
        System.out.println("Nilai y2 = " + y2);
        System.out.println("");

        // jawaban point a
        // x1
        int x1 = (y1 + y2) * (y1 + y2);
        // x2
        int x2 = (y1 % 4) * y2;

        // print hasil point a
        System.out.println("--Jawaban Point A--");
        System.out.println("Nilai x1 = " + x1);
        System.out.println("Nilai x2 = " + x2);
        System.out.println("");

        // jawaban & print hasil point b
        System.out.println("--Jawaban Point B--");
        // 1.
        System.out.println("1. X1 lebih besar sama dengan X2 ===> " + (x1 >= x2));
        // 2.
        System.out.println("2. X2 lebih besar sama dengan X1 ===> " + (x2 >= x1));
        // 3.
        System.out.println("3. (X1 mod 4 == ++X2 mod 5) ===> " + (x1 % 4 == ++x2 % 5));

    }

}
