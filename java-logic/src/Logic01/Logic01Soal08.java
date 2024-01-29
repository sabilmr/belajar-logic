package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal08 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] angka = DeretAngka.asli(n);
        char[] huruf = DeretAngka.huruf(n);

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                array[i] = String.valueOf(huruf[i]);
            } else {
                array[i] = String.valueOf(angka[i]);
            }
        }
        PrintArray.printArray(array);
    }
}
