package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Soal01B {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[] fibo = DeretAngka.fibo(n,2);
        int[][] array = new int[n][n];

        int nTengah = n/2;
        for (int i = 0; i < nTengah+1; i++) {
            array[i][i] = fibo[i];
            array[n-1-i][i] = fibo[i];
            array[i][n-1-i] = fibo[i];
            array[n-1-i][n-1-i] = fibo[i];
            array[i][0] = fibo[i];
            array[n-1-i][0] = fibo[i];
            array[0][i] = fibo[i];
            array[0][n-1-i] = fibo[i];
            array[n-1][i] = fibo[i];
            array[n-1][n-1-i] = fibo[i];
            array[i][n-1] = fibo[i];
            array[n-1-i][n-1] = fibo[i];
            array[i][n-i-2] = fibo[i];
            array[n-2-i][i] = fibo[i];
        }
        PrintArray.printArray(array);
    }
}
