package Sesi_26;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        String[] profesi = new String[4];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < profesi.length; i++) {
            System.out.print("Profesi index ke-" + i + ": ");
            profesi[i] = scan.nextLine();
        }

        System.out.println("-----------");
        System.out.println("List Profesi:");

        for (String b : profesi) {
            System.out.println(b);
        }

        scan.close();
    }

}
