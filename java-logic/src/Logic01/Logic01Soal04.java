package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal04 {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] fibo = DeretAngka.fibo(n,2);
        PrintArray.printArray(fibo);
    }
}
