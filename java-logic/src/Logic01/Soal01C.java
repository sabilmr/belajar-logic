package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Soal01C {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));
        int[][] array = new int[n][n];
        int[] fibo = DeretAngka.fibo(n,2);

        int index = 0;
        for (int i = 0; i < n; i++) {
            array[0][i] = fibo[index];
            array[i][0] = fibo[index];
            array[i][n-1] = fibo[index];
            array[n-1][i] = fibo[index];
            array[i][i] = fibo[index];
            array[n-1-i][i] = fibo[index];

            if (i < n/2){
                index++;
            } else {
                index--;
            }
        }
        PrintArray.printArray(array);
    }
}
