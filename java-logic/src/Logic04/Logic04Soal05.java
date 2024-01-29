package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal05 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[] fibo = DeretAngka.fibo(n,3);
        char[] huruf = DeretAngka.huruf(n);

        String[][] array = new String[n][n];
        for (int i = 0; i < n; i++) {
            int index = 0;
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && i >= j && j < n/2){
                    array[i][j] = String.valueOf(huruf[j]);
                } if (i + j >= n-1 && i <= j){
                    array[i][j] = String.valueOf(fibo[j]);
                }
                index++;
            }
        }
        PrintArray.printArray(array);
    }
}
