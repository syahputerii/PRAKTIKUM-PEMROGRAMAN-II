package PRAK303_2210817120007_NursyahnaPuteri;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Tampilkan Seluruh Data Mahasiswa");
            System.out.println("0. Keluar");

            System.out.print("Pilihan: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = scanner.nextLine();
                Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                daftarMahasiswa.add(mahasiswa);
                System.out.println("Mahasiswa " + nama + " ditambahkan.");
            } else if (menu == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nim = scanner.nextLine();
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNIM().equals(nim)) {
                        daftarMahasiswa.remove(mahasiswa);
                        System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                        break;
                    }
                }
            } else if (menu == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                String nim = scanner.nextLine();
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    if (mahasiswa.getNIM().equals(nim)) {
                        System.out.println("Data Mahasiswa:");
                        System.out.println("Nama: " + mahasiswa.getNama());
                        System.out.println("NIM: " + mahasiswa.getNIM());
                        break;
                    }
                }
            } else if (menu == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa mahasiswa : daftarMahasiswa) {
                    System.out.println("NIM: " + mahasiswa.getNIM() + ", Nama: " + mahasiswa.getNama());
                }
            } else if (menu == 0) {
                System.out.println("Terima Kasih!");
                daftarMahasiswa.clear();
                break;
            } else {
                System.out.println("Menu tidak valid.");
            }
        }
        scanner.close();
    }
}