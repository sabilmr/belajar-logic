package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal06A {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[] bilAsli = DeretAngka.asli(n * 3);

        int[][] array = new int[n][n];
        int index = n - 1;
        int index1 = n * 3 - 3;
        for (int i = 0; i < n; i++) {
            array[n - 1][i] = bilAsli[index];
            array[i][i] = bilAsli[index1];
            array[i][0] = bilAsli[i];
            index++;
            index1--;
        }
        PrintArray.printArray(array);
    }
}