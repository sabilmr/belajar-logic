package Logic02;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal05 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] fibo = DeretAngka.fibo(n,3);

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            int index = 0;
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && i >= j){
                    array[i][j] = fibo[index];
                } else if (i + j >= n-1 && i <= j) {
                    array[i][j] = fibo[index];
                }
                index++;
            }
        }
        PrintArray.printArray(array);
    }
}
