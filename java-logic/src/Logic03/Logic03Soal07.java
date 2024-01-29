package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal07 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 3 == 2){
                double pangkat = Math.pow(i+1,2);
                array1[i] = (int) pangkat;
            } else {
                array1[i] = i+1;
            }
        }
        int[][] array = new int[2][n];
        for (int i = 0; i < n; i++) {
            array[0][i] = array1[i];
            if (i % 4 == 0){
                array[1][i] = 9;
            } else if (i % 4 == 1) {
                array[1][i] = 99;
            } else if (i % 4 == 2) {
                array[1][i] = 999;
            } else {
                array[1][i] = 9999;
            }
        }
        PrintArray.printArray(array);
    }
}
