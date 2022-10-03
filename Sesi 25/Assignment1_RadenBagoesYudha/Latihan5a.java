public class Latihan5a {
    public static void main(String[] args) {
        int y1 = 10;
        int y2 = 25;

        System.out.println("--Latihan 5--");
        System.out.println("Nilai y1 = " + y1);
        System.out.println("Nilai y2 = " + y2);
        System.out.println("");

        // jawaban point a
        int x1 = y1 + y2;
        // x1 = x1 * x1;
        x1 *= x1;

        int x2 = y1 % 4;
        x2 = x2 * y2;

        // print hasil point a
        System.out.println("--Jawaban Point A--");
        System.out.println("Nilai x1 = " + x1);
        System.out.println("Nilai x2 = " + x2);
        System.out.println("");
    }

}
