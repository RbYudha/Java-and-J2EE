public class segitiga {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        double c = ((a * a) + (b * b));

        double t = 0;
        double sqrtroot = c / 2;

        do {
            t = sqrtroot;
            sqrtroot = (t + (c / t)) / 2;
        } while ((t - sqrtroot) != 0);
        System.out.println(sqrtroot);
    }
}
