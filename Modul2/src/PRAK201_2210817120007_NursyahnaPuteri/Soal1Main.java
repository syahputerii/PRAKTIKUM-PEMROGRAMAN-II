package PRAK201_2210817120007_NursyahnaPuteri;

public class Soal1Main {

    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0);
        Buah mangga = new Buah("Mangga", 0.2, 3500.0);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000.0);

        apel.Hasil(40.0);
        mangga.Hasil(15.0);
        alpukat.Hasil(12.0);
    }
}