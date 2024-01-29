package Utils;

public class DeretAngka {
    //fibonacci
    public static int[] fibo(int n,int t){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < t){
                array[i]=1;
                continue;
            }
            int result = 0;
            for (int j = 1; j <= t; j++) {
                result += array[i-j];
            }
            array[i] = result;
        }
        return array;
    }
    //pangkat
    public static int[] pangkat(int n,int p){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            double angka = (double) i+1;
            double hasil = Math.pow(angka,(double) p);
            array [i] = (int) hasil;
        }
        return array;
    }
    //genap
    public static int[] genap(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= 2 * i;
        }
        return array;
    }
    //ganjil
    public static int[] ganjil(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 2 * i +1;
        }
        return array;
    }
    //bilangan asli
    public static int[] asli(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    //bilangan prima
    public static int[] bilanganPrima(int n){
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
        return array;
    }
    public static boolean isiPrima(int angka){
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
    //deret huruf
    public static char[] huruf(int n){
        char[] array = new char[n];
        char huruf = 'A';
        for (int i = 0; i < n; i++) {
            array[i] = huruf;
            huruf++;
        }
        return array;
    }
    //deret geometri
    public static int[] geometri(int n,int t){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 1){
                array[i] = 1;
            } else {
                array[i] = array[i-1]*t;
            }
        }
        return array;
    }
    public static int[] ganjilKebalik(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= 2 * (n-i)-1;
        }
        return array;
    }
    public static int[] genaplKebalik(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= 2 * (n-i)-2;
        }
        return array;
    }
    public static int[] asli2(int n2){
        int[] array = new int[n2];
        for (int i = 0; i < n2; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    public static int[] ganjil999(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 2 * i +1;
        }
        return array;
    }
    public static int[] ganjilModif(int n, int position, int prefix){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if(i%position == position-1){
                array[i] = prefix;
            }else {
                array[i] = (i * 2) + 1;
            }
        }

        return array;
    }
    public static int[] index(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
    public static int[] bilAsliModif(int n, int position, int prefix){
        int[] array = new int[n];
        int angka = 1;
        for (int i = 0; i < n; i++) {
            if(i%position == position-1){
                array[i] = prefix;
            }else {
                array[i] = angka;
            }
            angka++;
        }
        return array;
    }
}

