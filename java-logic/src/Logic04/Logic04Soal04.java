package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal04 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[] fibo = DeretAngka.fibo(n,2);

        int[][] array = new int[n][n];
        int index = (n-1);
        for (int i = 0; i < n; i++) {
            array[i][n/2] = fibo[index];
            array[n-1][i] = fibo[index];
            array[0][i] = fibo[i];
            array[n/2][i] = fibo[i];
            array[i][0] = fibo[i];
            array[i][n-1] = fibo[index];
            index--;
        }
        PrintArray.printArray(array);
    }
}
