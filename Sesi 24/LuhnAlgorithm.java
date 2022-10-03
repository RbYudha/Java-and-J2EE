
public class LuhnAlgorithm {
    public static void main(String[] args) {

        String nokartu = "79927398713";

        // array untuk menyimpan length no kartu
        int[] digitKartu = new int[nokartu.length()];

        // perulangan untuk mengubah sting ke interger
        for (int i = 0; i < nokartu.length(); i++) {
            digitKartu[i] = Integer.parseInt(nokartu.substring(i, i + 1));
        }

        // Perulangan untuk menghitung luhn algoritme
        for (int i = digitKartu.length - 2; i >= 0; i = i - 2) {
            int j = digitKartu[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            digitKartu[i] = j;
        }

        // sum nilai validasi
        int sum = 0;
        for (int i = 0; i < digitKartu.length; i++) {
            sum += digitKartu[i];
        }
        // int sum = 7 + 9 + 9 + 2 + 7 + 3 + 9 + 8 + 7 + 1 + 3;
        // logika apakah sum merupakan kelipatan 10 atau bukan
        if (sum % 10 == 0) {
            System.out.println(nokartu + " Kartu valid");
        } else {
            System.out.println(nokartu + " Kartu tidak valid");
        }
    }
}