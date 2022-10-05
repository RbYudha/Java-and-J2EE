import java.util.Scanner;

public class BiayaAdmin {
    public static void main(String[] args) {
        float biayaAdmin = 10000;
        double bunga = 0.02;
        float saldo;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Saldo anda : Rp.");
        saldo = scan.nextInt();
        scan.close();
        double saldoAkhir;

        if (saldo >= 1000000) {
            saldoAkhir = saldo + saldo * bunga;
            System.out.println("Saldo anda ditambah bunga: Rp." + (saldoAkhir));
        } else if (saldo >= 200000 && saldo <= 1000000) {
            saldoAkhir = saldo;
            System.out.println("Saldo anda: Rp." + (saldoAkhir));
        } else {
            saldoAkhir = saldo - biayaAdmin;
            System.out.println("Saldo anda: Rp." + (saldoAkhir));
        }

    }
}
