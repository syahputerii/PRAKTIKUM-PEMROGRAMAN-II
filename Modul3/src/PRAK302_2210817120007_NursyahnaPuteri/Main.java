package PRAK302_2210817120007_NursyahnaPuteri;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String nama = "";
        String jenis = "";
        String pemimpin = "";

        int tanggal = 0;
        int bulan = 0;
        int tahun = 0;

        Scanner input = new Scanner(System.in);
        Negara negara = new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun);
        LinkedList<Negara> llNegara = new LinkedList<Negara>();

        int ulang;
        ulang = input.nextInt();

        for (int i=0; i<ulang; i++){
            Negara c = new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun);
            c.getData();
            llNegara.add(c);
        }

        for (int i = 0; i < llNegara.size(); i++){
            Negara nIndex = llNegara.get(i);
            nIndex.Tampilan();
        }
    }
}