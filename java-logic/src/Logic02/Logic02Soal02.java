package Logic02;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal02 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] ganjil = new int[n];
        for (int i = 0; i < n; i++) {
            ganjil[i] = 2 * i +1;
        }

        int[][] array = new int[n][n];
        int index = 0;
        int index2 = n-1;
        for (int i = 0; i < n; i++) {
            array[0][i] = ganjil[i];
            array[n-1][i] = ganjil[i];
            array[i][0] = ganjil[index];
            array[i][n-1] = ganjil[index2];
        }
        PrintArray.printArray(array);
    }
}
