package Sesi_26;

public class ArrayMulti {
    public static void main(String[] args) {
        String[][] framework = {
                { "Java", "Kotlin" },
                { "React", "ReactNative" },
                { "PHP", "Laravel" }
        };

        // for (int i = 0; i < framework.length; i++) {
        // System.out.println("Bahasa: " + framework[i][0]);
        // System.out.println("Framework: " + framework[i][1]);
        // System.out.println("------------------");
        // }

        // System.out.println("Cara pertama");
        // for (int i = 0; i < framework.length; i++) {
        // for (String cetakFramework : framework[i]) {
        // System.out.print(cetakFramework + " ");
        // }
        // System.out.println("");
        // }

        System.out.println("---Cara Kedua---");
        for (int i = 0; i < framework.length; i++) {
            for (int j = 0; j < framework[i].length; j++) {
                System.out.print(framework[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.arraycopy(framework[0], 0, framework[2], 1, 1);

        System.out.println("---Manipulasi Data---");
        for (int i = 0; i < framework.length; i++) {
            for (int j = 0; j < framework[i].length; j++) {
                System.out.print(framework[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
