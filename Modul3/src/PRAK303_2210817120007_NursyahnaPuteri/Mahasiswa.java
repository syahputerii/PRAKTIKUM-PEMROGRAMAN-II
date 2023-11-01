package PRAK303_2210817120007_NursyahnaPuteri;
public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim;
    }
}