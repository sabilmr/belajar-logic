package Logic01;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal05A {
    public static void main(String[] args) {

        int n = InputData.input(new Scanner(System.in));
        int[] fibo3 = DeretAngka.fibo(n,3);
        PrintArray.printArray(fibo3);

    }
}
