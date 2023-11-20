package soal1;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String r, String n) {
        this.ras = r;
        this.nama = n;
    }
    public void display () {
        System.out.println("\nDetail Hewan Peliharaan");
        System.out.println("Nama Hewan Peliharaanku adalah: "  + this.nama);
        System.out.println("Dengan ras : " + this.ras);
    }
}