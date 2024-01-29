package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal01 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[] asli = DeretAngka.asli(n);

        int[][] array = new int[n][n];
        int indexBaris = 1;
        for (int i = 0; i < n; i++) {
            int indexJAwal = 0;
            int indexJAkhir = n-1;
            for (int j = 0; j < n; j++) {
                if (indexBaris % 2 == 1) {
                    array[i][j] = asli[indexJAwal];
                    indexJAwal++;
                } if (indexBaris % 2 == 0) {
                    array[i][j] = asli[indexJAkhir];
                    indexJAkhir--;
                }
            }
            indexBaris++;
        }
        PrintArray.printArray(array);
    }
}
