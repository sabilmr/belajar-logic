package Logic03;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal01A {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int angka = 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (angka % 3 == 0){
                array[i] = angka * angka;
            } else {
                array[i] = angka;
            }
            angka++;
        }
        PrintArray.printArray(array);
    }
}
