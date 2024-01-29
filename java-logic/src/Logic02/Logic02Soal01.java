package Logic02;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal01 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] bilanganAsli = new int[n];
        for (int i = 0; i < n; i++) {
            bilanganAsli[i]=i+1;
        }

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i][i] = bilanganAsli[i];
            array[n-i-1][i] = bilanganAsli[i];
        }
        PrintArray.printArray(array);
    }
}
