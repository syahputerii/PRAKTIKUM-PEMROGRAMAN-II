import java.util.Scanner;
public class PRAK104_2210817120007_NursyahnaPuteri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String pilihanAbu = input.nextLine();

        System.out.print("Tangan Bagas: ");
        String pilihanBagas = input.nextLine();

        String[] tanganAbu = pilihanAbu.split(" ");
        String[] tanganBagas = pilihanBagas.split(" ");


        int skorAbu = 0;
        int skorBagas = 0;

        for (int ronde = 0; ronde < 3; ronde++) {
            String tanganAbuRonde = tanganAbu[ronde];
            String tanganBagasRonde = tanganBagas[ronde];

            if (tanganAbuRonde.equals(tanganBagasRonde)) {
            } else if ((tanganAbuRonde.equals("B") && tanganBagasRonde.equals("G")) ||
                    (tanganAbuRonde.equals("G") && tanganBagasRonde.equals("K")) ||
                    (tanganAbuRonde.equals("K") && tanganBagasRonde.equals("B"))) {
                skorAbu++;
            } else {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        } else if (skorAbu < skorBagas) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}