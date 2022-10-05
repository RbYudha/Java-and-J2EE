package Sesi_27;

public class BangunDatar {

    float luas() {
        System.out.println("Luas bangun datar");
        return 0;
    }

    float keliling() {
        System.out.println("Keliling bangun datar");
        return 0;
    }
}

class Persegi extends BangunDatar {
    float sisi;

    Persegi() {
        this.sisi = 0;
    }

    Persegi(float sisi) {
        this.sisi = sisi;
    }

    float luas() {
        float luasBD = this.sisi * this.sisi;
        System.out.println("Luas Persegi " + luasBD);
        return luasBD;
    }

    float keliling() {
        float kelilingBD = this.sisi * 4;
        System.out.println("Luas Persegi " + kelilingBD);
        return kelilingBD;
    }
}

class Lingakran extends BangunDatar {
    double r;

    Lingakran() {
        this.r = 0;
    }

    public Lingakran(float r) {
        this.r = r;
    }

    float luas() {
        double luasBD = this.r * this.r * Math.PI;
        System.out.println("Luas Lingkaran " + luasBD);
        return (float) luasBD;
    }

    float keliling() {
        double kelilingBD = 2 * Math.PI * this.r;
        System.out.println("Luas Persegi " + kelilingBD);
        return (float) kelilingBD;
    }

}

class PersegiPanjang extends BangunDatar {
    float panjang, lebar;

    PersegiPanjang() {
        this.panjang = 4;
        this.lebar = 6;
    }

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
}

class Segitiga extends BangunDatar {
    float alas, tinggi;

    Segitiga() {
        this.alas = 3;
        this.tinggi = 4;
    }

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
}