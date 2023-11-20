package soal2;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing(String r, String n, String w){
        super(n,r);
        this.warnaBulu = w;
    }
    public void displayDetailKucing() {
        super.display();
        System.out.println("\nDetail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + this.nama);
        System.out.println("Dengan ras: " + this.ras);
        System.out.println("Memiliki warna Bulu : " + this.warnaBulu);
    }
}