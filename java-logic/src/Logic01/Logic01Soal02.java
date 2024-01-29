package Logic01;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;
public class Logic01Soal02 {
    private static Scanner input;
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] ganjil = new int[n];
        for (int i = 0; i < n; i++){
            ganjil[i] = 2 * i +1;
        }
        PrintArray.printArray(ganjil);
    }
}

