package PRAK201_2210817120007_NursyahnaPuteri;

public class Buah {
    public String nama;
    public double berat;
    public double hargaGram;

    Buah(String nama, double berat, double hargaGram) {
        this.nama = nama;
        this.berat = berat;
        this.hargaGram = hargaGram;
    }

    double getMendapatkanHargaSebelumDiskon(double jumlahDibeli) {
        return jumlahDibeli /berat* hargaGram;
    }

    double getTotalDiskon(double jumlahDibeli) {
        double totalBeratKg = jumlahDibeli;
        int potonganPer4Kg = (int) (totalBeratKg / 4) * 2;
        return potonganPer4Kg * (hargaGram * 4) / 100;
    }

    double getMendapatkanHargaSetelahDiskon(double jumlahDibeli) {
        double hargaSebelumDiskon = getMendapatkanHargaSebelumDiskon(jumlahDibeli);
        double diskon = getTotalDiskon(jumlahDibeli);
        return hargaSebelumDiskon - diskon;
    }


    void Hasil(double jumlahDibeli) {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + hargaGram);
        System.out.println("Jumlah Beli: " + jumlahDibeli + " kg");
        System.out.println("Harga Sebelum Diskon: Rp. " + String.format("%.2f", getMendapatkanHargaSebelumDiskon(jumlahDibeli)));
        System.out.println("Total Diskon: Rp. " + String.format("%.2f", getTotalDiskon (jumlahDibeli)));
        System.out.println("Harga Setelah Diskon: Rp. " + String.format("%.2f", getMendapatkanHargaSetelahDiskon(jumlahDibeli)) + "\n");
    }
}