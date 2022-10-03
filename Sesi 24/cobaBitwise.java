public class cobaBitwise {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 20; i++) {
            if ((i & 1) == 1) {
                System.out.print(i + "");
            }
        }
    }
}