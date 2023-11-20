package soal1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        String nama = "";
        String ras = "";

        Scanner input = new Scanner (System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        nama = input.nextLine();

        System.out.print("Ras: ");
        ras = input.nextLine();

        HewanPeliharaan kucing = new HewanPeliharaan(ras, nama);
        kucing.display();
    }
}