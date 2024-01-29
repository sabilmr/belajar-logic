package Logic02;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal10 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] ganjil = DeretAngka.ganjilKebalik(n);

        int[][] array = new int[n][n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n/2 || j - i >= n/2){
                    array[i][j] = ganjil[index+n/2];
                    if (j < n/2){
                        index++;
                    } if (j > n/2-1){
                        index--;
                    }
                } else if (i - j >= n/2 || i + j >= n-1+n/2) {
                    array[i][j] = ganjil[index+n/2];
                    if (j < n/2){
                        index++;
                    } if (j > n/2-1){
                        index--;
                    }
                } else {

                }
            }
        }
        PrintArray.printArray(array);
    }
}
