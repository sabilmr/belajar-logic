package Logic01;

import Utils.PrintArray;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai N: ");
        int n = input.nextInt();

        int[] ganjil = new int[n];
        for (int i = 0; i < n; i++) {
            ganjil[i]= 2 * (n-i)-1;
        }

        int[][] array = new int[n][n];
        int indexBaris = 0;
        int nTengah = n/2;
        for (int i = 0; i < n; i++) {
            int indexKolom = 0;
            for (int j = 0; j < n; j++) {
                if (i == 0||i == n-1){
                    array[i][j] = ganjil[indexKolom+nTengah];
                } else if (i == j||i + j == n-1||j == 0||j == n-1) {
                    array[i][j] = ganjil[indexBaris+nTengah];
                }
                if (j < nTengah){
                    indexKolom++;
                } else {
                    indexKolom--;
                }
            }
            if (i < nTengah){
                indexBaris++;
            } else {
                indexBaris--;
            }
        }
        PrintArray.printArray(array);
    }
}
