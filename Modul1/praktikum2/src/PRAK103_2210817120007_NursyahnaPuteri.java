import java.util.Scanner;
public class PRAK103_2210817120007_NursyahnaPuteri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.print("Masukkan angka awal: ");
        int angkaAwal = input.nextInt();

        int i = 0;
        do {

            if (angkaAwal % 2 != 0) {
                System.out.print(angkaAwal);

                if (i < N - 1) {
                    System.out.print(", ");
                }
                i++;
            }

            angkaAwal += 2;
        } while (i < N);

        System.out.println();
    }
}