package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal09 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);
        
        int[] bilGenap = new int[n];
        for (int i = 0; i < n; i++) {
            bilGenap[i] = i * 2;
        }
        int[] genapKebalik = new int[n];
        for (int i = 0; i < n; i++) {
            genapKebalik[i] = 4 * (n/2-i);
        }
        int[][] array = new int[2][n];
        for (int i = 0; i < n; i++) {
            array[0][i] = bilGenap[i];
            array[1][i] = genapKebalik[i];
        }
        PrintArray.printArrayDengan0(array);
    }
}
