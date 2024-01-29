package Logic02;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal04 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] fibo = DeretAngka.fibo(n,2);

        int[][] array = new int[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            array[0][i] = fibo[i];
            array[n-1][i] = fibo[i];
            array[n/2][i] = fibo[i];
            array[i][0] = fibo[index];
            array[i][n/2] = fibo[index + n/2];
            array[i][n-1] = fibo[index + n-1];
        }
        PrintArray.printArray(array);
    }
}
