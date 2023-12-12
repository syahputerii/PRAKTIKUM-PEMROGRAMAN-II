package PRAK202_2210817120007_NursyahnaPuteri;

public class Kopi {
    String namaKopi;
    String ukuran;
    double harga;
    String pembeli;

    public Kopi() {
        namaKopi = "";
        ukuran = "";
        harga = 0;
    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

    public void setPembeli(String nama) {
        pembeli = nama;
    }

    public String getPembeli() {
        return pembeli;
    }
    public double getPajak() {
        return harga * 0.11;
    }
}