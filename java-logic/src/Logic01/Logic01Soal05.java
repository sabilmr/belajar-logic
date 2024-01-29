package Logic01;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal05 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] fibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 3){
                fibo[i] = 1;
                continue;
            }
            int result = 0;
            for (int j = 1; j <= 3; j++) {
                result += fibo[i-j];
            }
            fibo[i] = result;
        }
        PrintArray.printArray(fibo);
    }
}
