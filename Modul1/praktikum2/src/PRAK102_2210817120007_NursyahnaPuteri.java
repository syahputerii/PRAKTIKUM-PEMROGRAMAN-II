import java.util.Scanner;
public class PRAK102_2210817120007_NursyahnaPuteri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angkaAwal = input.nextInt();

        int baris = 0;

        while (baris <= 10) {
            if (angkaAwal % 5 == 0) {
                System.out.print((angkaAwal / 5) - 1);
            } else {
                System.out.print(angkaAwal);
            }

            if (baris <= 9) {
                System.out.print(",");
            } else {
                System.out.println();
            }

            angkaAwal++;
            baris++;
        }
    }
}