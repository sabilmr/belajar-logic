package Logic01;

import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal06A {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));

        int[] array = new int[n];
        int index = 0;
        int angka = 2;

        while(index < n){
            if (isiPrima(angka)){
                array[index] = angka;
                index++;
            }
            angka++;
        }
        PrintArray.printArray(array);
    }
    public static boolean isiPrima (int angka){
        if (angka < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0){
                return false;
            }
        }
        return true;
    }
}
