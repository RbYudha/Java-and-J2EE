import java.math.BigDecimal;

public class CobaKalkulasi {

    public static void main(String[] args) {
        // double a = 1.2;
        // double b = 1.3;
        // double c = a + b;
        // System.out.println(c);

        BigDecimal b1 = new BigDecimal("2.1");
        BigDecimal b2 = new BigDecimal("2.2");
        BigDecimal b3 = b1.add(b2);

        System.out.println("Contoh 1 :" + b3);

        // contoh lain
        BigDecimal b5 = new BigDecimal("1.123456789123456789");
        System.out.println("Contoh 2 : " + b5);
    }
}
