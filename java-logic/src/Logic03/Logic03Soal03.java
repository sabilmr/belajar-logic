package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal03 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[][] array = new int[2][n];
        int angka = 0;
        for (int i = 0; i < n; i++) {
            array[0][i] = angka;
            angka += 2;
            if (i % 3 == 0){
                double pangkat = Math.pow(i,3);
                array[1][i] = (int) pangkat;
            } else {
                array[1][i] = 999;
            }
        }
        PrintArray.printArrayDengan0(array);
    }
}
