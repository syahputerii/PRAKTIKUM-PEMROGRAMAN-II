package PRAK203_2210817120007_NursyahnaPuteri;

//Pada baris ini, yaitu baris ke-4 mengalami error, karena pada public class tidak sesuai dengan nama file java. Jadi perlu disesuaikan dengan nama file dari ketentuan soal yaitu "Pegawai"
//public class Employee
public class Pegawai {
    public String nama;

    //pada baris ini, yaitu baris ke-8 terdapat kesalahan penggunaan tipe data, tipe data yang digunakan sebelumnya char, namun tipe data yang sesuai adalah String
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    //Pada baris ini, yaitu baris ke-10 sebelumnya terjadi error karena property asal masih dengan tipe data char, setelah diganti dengan string maka akan dapat dijalankan baris ini
    public String getAsal() {
        return asal;
    }

    //Pada baris ini, yaitu baris ke-25 terjadi error karena kurangnya pendeklarasian variabel j. Maka perlu pendeklarasian untuk variabel j, berupa String j
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}