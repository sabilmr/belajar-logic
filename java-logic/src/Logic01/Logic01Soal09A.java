package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal09A {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] array = DeretAngka.geometri(n,4);
        PrintArray.printArray(array);
    }
}
