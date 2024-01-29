package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal07 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[] ganjil = new int[n*n*n];

        int angka = 1;
        int value = 0;
        for (int i = 0; i < n*n*n; i++) {
            if (value < n-1){
                ganjil[i] = angka;
                value++;
            } else {
                ganjil[i] = 999;
                value = 0;
            }
            angka+=2;
        }
        int[][] array = new int[n][n*(n-1)+1];

        for (int i = 0; i < n; i++) {
            int indexTengah = n/2;
            for (int j = 0; j < n*(n-1)+1; j++) {

                array[i][n-1] = ganjil[n+1+i];
                array[n-1-i][n+n-2] = ganjil[(n*3-1)+i];
                array[n-1-i][0] = ganjil[indexTengah+i];
                array[n-1][i+n-1] = ganjil[n*2+i];
                array[0][n+i+n-2] = ganjil[n*4-2+i];
                array[0][i] = ganjil[n/2+i];
                if (n == 3){
                    array[i][n*(n-1)] = ganjil[n*4+i];
                }
                if (n == 5){
                    array[i][n*(n-1)] = ganjil[4];
                    array[i][n*2+2] = ganjil[n*4+i];
                    array[n-1][n*2+2+i] = ganjil[n*n-1+i];
                    array[n-1-i][n*3+1] = ganjil[(n*n)+3+i];
                    array[0][n*3+1+i] = ganjil[n*6+2+i];
                }
            }
        }
        PrintArray.printArray(array);
        PrintArray.printArray(ganjil);
    }
}
