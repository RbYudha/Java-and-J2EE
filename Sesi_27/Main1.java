package Sesi_27;

public class Main1 {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi();
        persegi.sisi = 5;

        // Persegi persegi = new Persegi(sisi:2);

        Lingakran lingakran = new Lingakran();
        lingakran.r = 22;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        // Segitiga segitiga = new Segitiga();
        // segitiga.alas = 12;
        // segitiga.tinggi = 8;
        Segitiga segitiga = new Segitiga(12, 8);

        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingakran.luas();
        lingakran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segitiga.luas();
        segitiga.keliling();
    }

}
