package Interviev_Code_Challenged.Day4;

public class Q06 {
    public static void main(String[] args) {
 /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */
        int arr[] = {1, 1, 1, 22, 23, 85, 58, 77, 66, 22, 23, 77};
        int tekrarEdenSayi =0;//kaça eşitlemek gerekiyor*
        int sayac = 0;
        for (int i =1; i < arr.length; i++) {

            if (arr[i] == tekrarEdenSayi) {
                sayac++;
            }

        }
        System.out.println("*** "+tekrarEdenSayi+" sayısından "+sayac+" adet vardır ***");

    }
}