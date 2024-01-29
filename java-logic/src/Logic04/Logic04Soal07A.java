package Logic04;

import Utils.DeretAngka;
import Utils.InputData;
import Utils.PrintArray;

import java.util.Scanner;

public class Logic04Soal07A {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        int[] ganjil = DeretAngka.ganjilModif(n*n*n,n,999);

        int p = n*(n-1)+1;
        int[][] array = new int[n][p];
        int index = 0;
        int geser = 0;
        int nTengah = n/2;
        for (int b = 1; b <= n; b++) {
            //kiri bawah atau kiri atas
            int start = b == 1? 0:1;
            for (int i = start; i <= nTengah; i++) {
                if (b%2 == 1){
                    array[nTengah-i][0 + geser] = ganjil[index]; //kiri atas
                } else {
                    array[nTengah+i][0 + geser] = ganjil[index]; // kiri bawah
                    }
                index++;
                }
            for (int i = 1; i < n; i++) {
                if (b%2 == 1){
                    array[0][i + geser] = ganjil[index]; //atas
                } else {
                    array[n-1][i + geser] = ganjil[index]; //bawah
                }
                index++;
            }
            for (int i = 1; i <= nTengah; i++) {
                if (b%2 == 1){
                    array[i][n-1+geser] = ganjil[index];//atas
                } else {
                    array[n-1-i][n-1+geser] = ganjil[index];//bawah
                }
                index++;
            }
            geser+= n-1;
            }
        PrintArray.printArray(array);
        }
    }
