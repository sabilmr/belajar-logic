package Logic02;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal07 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] fibo = DeretAngka.fibo(n,2);

        int[][] array = new int[n][n];

        int indexBaris = 0;
        for (int i = 0; i < n; i++) {
            int indexKolom = 0;
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && i <= n/2 && j <= n/2 && i >= j){
                    array[i][j] = fibo[indexKolom];
                } else if (i + j >= n-1 && i >= n/2 && j <= n/2) {
                    array[i][j] = fibo[indexBaris];
                } else if (i + j <= n-1 && i <= n/2 && j >= n/2) {
                    array[i][j] = fibo[indexBaris];
                } else if(i + j >= n-1 && i >= n/2 && j >= n/2 && i <= j){
                    array[i][j] = fibo[indexKolom];
                }
                if (j < n/2){
                    indexKolom++;
                } else {
                    indexKolom--;
                }
            }
            if (i < n/2){
                indexBaris++;
            } else {
                indexBaris--;
            }
        }
        PrintArray.printArray(array);
    }
}
