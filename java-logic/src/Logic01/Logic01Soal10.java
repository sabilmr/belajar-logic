package Logic01;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal10 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            double angka = (double) i;
            double hasil = Math.pow(angka,(double) 3);
            array [i] = (int) hasil;
        }
        PrintArray.printArray(array);
    }
}
