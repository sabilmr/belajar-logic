package Logic01;

import Utils.PrintArray;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");
        int n = input.nextInt();

        int[] fibo = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2){
                fibo[i]=1;
            } else {
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
        }

        int[][]array = new int[n][n];
        int index = 0;
        int nTengah = n/2;
        for (int i = 0; i < n; i++) {
            int indexKolom = 0;
            for (int j = 0; j < n; j++) {
                if (i == j||i + j == n-1||j == n-1||j == 0){
                    array[i][j] = fibo[index];
                } else if (i == 0||i == n-1) {
                    array[i][j] = fibo[indexKolom];
                }
                if (j < nTengah){
                        indexKolom++;
                    } else {
                        indexKolom--;
                    }
            }
            if (i < nTengah){
                index++;
            } else {
                index--;
            }
        }
        PrintArray.printArray(array);
    }
}
