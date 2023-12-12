import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Buatkan Sistem Untuk Menampilkan Nilai IPK.
        //menginput berapa banyak semester yang ada x
        //menginput ip sebanyak semester yang ada x
        //mencari ipk dari ip yang sudah diinput x
        //tampilkan ipk x
        // Syarat nilai 0<ip<=4, jika salah maka ulang inputan; x
        Scanner scanner = new Scanner(System.in);
        int semester;
        float total = 0;
        System.out.print("Masukan Semester: ");
        semester = scanner.nextInt();
        float[] ip = new float[semester];

        for(int i = 0; i < semester; i++){
            do {
                System.out.print("Masukan IP Semester " + (i + 1) + " : ");
                ip[i] = scanner.nextFloat();
                if (ip[i] > 4 || ip[i] < 0) {
                    System.out.println("Inputan Yang Anda Masukan Salah, Ulangi!");
                } else {
                    total = total + ip[i];
                }
            } while (ip[i] > 4 || ip[i] < 0);
        }
        float ipk = total/(float)semester;
        System.out.println(ipk);



    }
}