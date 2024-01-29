package Logic02;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal03 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] bilanganGenap = new int[n];
        for (int i = 0; i < n; i++) {
            bilanganGenap[i] = 2 * i;
        }

        String[][] array = new String[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            array[0][i] = String.valueOf(bilanganGenap[i]);
            array[n-1][i] = String.valueOf(bilanganGenap[i]);
            array[i][i] = String.valueOf(bilanganGenap[i]);
            array[n-i-1][i] = String.valueOf(bilanganGenap[i]);
            array[i][0] = String.valueOf(bilanganGenap[index]);
            array[i][n-1] = String.valueOf(bilanganGenap[index+n-1]);
        }
        PrintArray.printArray(array);
    }
}
