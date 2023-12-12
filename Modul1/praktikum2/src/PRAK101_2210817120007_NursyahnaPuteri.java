import java.util.Scanner;
public class PRAK101_2210817120007_NursyahnaPuteri {

    public static void main (String [] Args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukan Tempat Lahir: ");
        String tempatlahir = input.nextLine();

        System.out.print("Masukan Tanggal Lahir: ");
        int tanggallahir = input.nextInt();

        System.out.print("Masukan Bulan Lahir: ");
        int bulanlahir = input.nextInt();

        System.out.print("Masukan Tahun Lahir: ");
        int tahunlahir = input.nextInt();

        System.out.print("Masukan Tinggi Badan: ");
        int tinggibadan = input.nextInt();

        System.out.print("Masukan Berat Badan: ");
        double beratbadan = input.nextDouble();

        String[] namabulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        String nbulan;
        if (bulanlahir >= 1 && bulanlahir <= 12) {
            nbulan = namabulan[bulanlahir - 1];
        } else {
            nbulan = "Bulan tidak valid";
        }

        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatlahir + " pada Tanggal " +
                tanggallahir + " " + nbulan + " " + tahunlahir + " Tinggi Badan " + tinggibadan + " cm dan Berat Badan " + beratbadan + " kilogram");
    }
}