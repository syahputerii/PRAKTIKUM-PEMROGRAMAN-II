package PRAK301_2210817120007_NursyahnaPuteri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu hitung = new Dadu();
        int inputnilai = input.nextInt();

        hitung.setInput(inputnilai);
        hitung.acakNilai();
    }
}