package PRAK203_2210817120007_NursyahnaPuteri;

public class Soal3Main {
    public static void main(String[] args) {

        Pegawai p1 = new Pegawai();

        //pada baris ini, yaitu baris ke-9 terjadi error karena kurangnya penempatan titik koma(;) diakhir
        //p1.nama = "Roi"
        p1.nama = "Roi";

        p1.asal = "Kingdom of Orvel";

        p1.setJabatan("Assasin");

        //pada baris ini, yaitu baris ke-17  belum dilakukan pendeklarasian pada property umur
        p1.umur = 17;

        //Pada baris ini, yaitu baris ke-20 output yang diperlukan pada soal adalah "Nama : Roi", sehingga pada baris ke-20 keterangan Pegawai menajadi di hapus
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());

        System.out.println("Asal: " + p1.getAsal());

        System.out.println("Jabatan: " + p1.jabatan);

        //pada baris ini, yaitu baris ke-28 tidak ada keterangan tahun diakhir, maka perlu penambahan kata"tahun"
        //System.out.println("Umur: " + p1.Umur);
        System.out.println("Umur: " + p1.umur+ " tahun");
    }
}