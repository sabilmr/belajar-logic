package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal09 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 1){
                array[i] = 1;
            } else {
                array[i] = array[i-1]*3;
            }
        }
        PrintArray.printArray(array);
    }
}
