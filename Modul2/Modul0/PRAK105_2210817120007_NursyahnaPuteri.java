package PRAKTIKUM1;

import java.util.Scanner;

public class PRAK105_2210817120007_NursyahnaPuteri {

    public static void main (String [] Args) {

        Scanner input = new Scanner(System.in);
                 
        System.out.print("Masukan Makanan Favorit: ");
        String makan = input.nextLine();

        System.out.print("Masukan Hobi: ");
        String hobi = input.nextLine();


        System.out.println("Aku Suka Makan " +makan+ ", dan Hobiku " +hobi);
    }

}