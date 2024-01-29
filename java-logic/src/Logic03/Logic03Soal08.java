package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal08 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[] bilGanjil = new int[n];
        int angka = 1;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 2){
                double pangkat = Math.pow(angka,2);
                bilGanjil[i] = (int) pangkat;
            } else {
                bilGanjil[i] = angka;
            }
            angka += 2;
        }
        int[][] array = new int[2][n];
        for (int i = 0; i < n; i++) {
            array[0][i] = bilGanjil[i];
            if (i % 3 == 0){
                array[1][i] = bilGanjil[i]*i;
            } else if (i % 4 == 0) {
                array[1][i] = 9;
            } else if (i % 4 == 1) {
                array[1][i] = 99;
            } else if (i % 4 == 2) {
                array[1][i] = 999;
            } else {
                array[1][i] = 9999;
            }
        }
        PrintArray.printArrayDengan0(array);
    }
}
