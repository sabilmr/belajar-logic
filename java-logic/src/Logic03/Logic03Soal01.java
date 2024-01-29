package Logic03;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal01 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int [] pangkat = new int[n];
        int value = 0;
        for (int i = 0; i < n; i++) {
            if (value < 2){
                pangkat[i]=i+1;
                value++;
            } else {
                double angka = Math.pow(i+1,2);
                pangkat[i] = (int) angka;
                value = 0;
            }
        }
        PrintArray.printArray(pangkat);
    }
}
