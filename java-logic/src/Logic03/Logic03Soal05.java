package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal05 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[] fibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                fibo[i] = 1;
                continue;
            }
            int result = 0;
            for (int j = 1; j < 3; j++) {
                result += fibo[i - j];
            }
            fibo[i] = result;
        }
        int[][] array = new int[2][n];

        for (int i = 0; i < n; i++) {
            array[0][i] = fibo[i];

        }
        PrintArray.printArray(array);
    }
}
