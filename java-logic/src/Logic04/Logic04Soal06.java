package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal06 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);
        int n2 = InputData.input2(scanner);

        int[] bilAsli = DeretAngka.asli(n*3);
        int[] asli = DeretAngka.asli2(n2*3);

        int[][] array = new int[n][n];
        int index = n-1;
        int index1 = n*3-3;
        for (int i = 0; i < n; i++) {
            array[n-1][i] = bilAsli[index];
            array[i][i] = bilAsli[index1];
            array[i][0] = bilAsli[i];
            index++;
            index1--;
        }
        int[][] array2 = new int[n2][n2];
        int indexArray2 = n2-1;
        int index2Array2 = n2*3-3;
        for (int i = 0; i < n2; i++) {
            array2[n2-1][i] = asli[indexArray2];
            array2[i][i] = asli[index2Array2];
            array2[i][0] = asli[i];
            indexArray2++;
            index2Array2--;
        }
        PrintArray.printArray(array);
        PrintArray.printArray(array2);
    }
}
