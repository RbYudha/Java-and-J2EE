public class Fbp {
    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        int fpb = 0;

        for (int n = 2; n <= a && n <= b; n++) {
            if (a % n == 0 && b % n == 0) {
                fpb = n;
            }
        }

        System.out.println(fpb);

    }
}
