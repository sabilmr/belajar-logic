package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal03 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] genap = DeretAngka.genap(n);

        String[][] array = new String[n][n];
        int index = n-1;
        for (int i = 0; i < n; i++) {
            array[0][i] = String.valueOf(genap[i]);
            array[n-1][i] = String.valueOf(genap[index]);
            array[i][i] = String.valueOf(genap[i]);
            array[i][n-1-i] = String.valueOf(genap[i]);
            array[i][0] = String.valueOf(genap[i]);
            array[i][n-1] = String.valueOf(genap[index]);
            index--;
        }
        PrintArray.printArray(array);
    }
}
