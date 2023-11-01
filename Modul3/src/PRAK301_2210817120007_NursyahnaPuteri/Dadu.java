package PRAK301_2210817120007_NursyahnaPuteri;

import java.util.LinkedList;
import java.util.Random;

public class Dadu {
    private int Input;
    private int min = 1;
    private int max = 6;
    private int total;

    public void setInput(int Input){
        this.Input = Input;
    }

    public void acakNilai(){

        LinkedList<Integer>daduList = new LinkedList<Integer>();
        daduList.add(min);daduList.add(max);

        for (int i = 0; i < Input; i++) {
            int acak_int = new Random().nextInt(max - min + 1) + min;
            daduList.add(acak_int);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + acak_int);
            total += acak_int;
        }
        System.out.println("Total Nilai Dadu Keseluruhan " + total);
    }
}