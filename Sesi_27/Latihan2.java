package Sesi_27;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        // String[][] framework = {
        // { "PHP", "Kotlin", "Java" },
        // { "Golang", "JavaScript", "Swift" }
        // };

        String[][] framework = new String[2][3];

        Scanner scan = new Scanner(System.in);

        // input
        for (int i = 0; i < framework.length; i++) {
            for (int j = 0; j < framework[i].length; j++) {
                System.out.print("Bahasa pemograman yang akan menempati posisi ke " + "(" + i + ", " + j + ")" + " = ");
                framework[i][j] = scan.nextLine();
            }
        }
        scan.close();

        // cetak
        System.out.println();
        System.out.println("---Bahasa Pemograman---");
        System.out.println("================================");
        for (int i = 0; i < framework.length; i++) {
            for (int j = 0; j < framework[i].length; j++) {
                System.out.print("|" + framework[i][j] + "|" + "   ");
            }
            System.out.println("");
        }
        System.out.println("================================");
        System.out.println();
    }

}
