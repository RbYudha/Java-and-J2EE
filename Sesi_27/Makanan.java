package Sesi_27;

public class Makanan {
    public static void main(String[] args) {
        Restoran data = new Restoran();

        data.setMenu("ayam goreng");
        data.setHarga(17.000);
        data.setSpesial(true);

        System.out.println("Menu makanan : " + data.getMenu());
        System.out.println("Harga makanan : " + data.getHarga());
        System.out.println("Menu spesial : " + data.isSpesial());
    }

}
