import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input nama warna : ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "Merah":
                System.out.println("Berhenti");
                break;
            case "Kuning":
                System.out.println("Hati-hati");
                break;
            case "Hijau":
                System.out.println("Jalan");
                break;
            default:
                System.out.println("salah");

        }

    }
}
