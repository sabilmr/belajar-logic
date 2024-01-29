package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal03 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] genap = DeretAngka.genap(n);
        PrintArray.printArray(genap);
    }
}
