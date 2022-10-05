package Sesi_27;

public class Barang {
    private int no;
    private String nama;
    private double harga;
    private double diskon;

    public Barang(int no, String nama, double harga, double diskon) {
        this.no = no;
        this.nama = nama;
        this.harga = harga;
        this.diskon = diskon;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public void display() {
        System.out.println(no + "   " + nama + "   " + harga + "    " + diskon * 100 + "%");
        System.out.println();
    }
}
