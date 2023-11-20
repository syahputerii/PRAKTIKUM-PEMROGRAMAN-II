package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan Pilihan : ");

        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1 ->                 {
                String nama, ras, warnaBulu;

                System.out.print("Nama hewan peliharaan: ");
                nama = input.nextLine();

                System.out.print("Ras: ");
                ras= input.nextLine();

                System.out.print("Warna Bulu: ");
                warnaBulu = input.nextLine();

                Kucing HewanPeliharaan = new Kucing(nama, ras, warnaBulu);
                HewanPeliharaan.displayDetailKucing();
            }
            case 2 -> {
                String nama, ras, warnaBulu, kemampuan;

                System.out.print("Nama hewan peliharaan: ");
                nama = input.nextLine();

                System.out.print("Ras: ");
                ras = input.nextLine();

                System.out.print("Warna Bulu: ");
                warnaBulu = input.nextLine();

                System.out.print("Kemampuan: ");
                kemampuan = input.nextLine();

                String[] kemampuanBanyak = kemampuan.split(",");

                Anjing HewanPeliharaan = new Anjing(nama, ras, warnaBulu, kemampuanBanyak);
                HewanPeliharaan.displayDetailAnjing();
            }
            default -> System.out.println("Tidak ada!");
        }
    }
}