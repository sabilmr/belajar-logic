package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal04 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[] fibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2){
                fibo[i] = 1;
                continue;
            }
            int result = 0;
            for (int j = 1; j <= 2; j++) {
                result += fibo[i-j];
            }
            fibo[i] = result;
        }
        int[][] array = new int[2][n];
        int index = 3;
        int value = 3;
        for (int i = 0; i < n; i++) {
            array[0][i] = fibo[i];
            if (i == index){
                array[1][i] = 999;
                index += value;
                value--;
            }
            if (value < 2){
                value += 3;
            }
        }
        PrintArray.printArrayDengan0(array);
    }
}
