package Interviev_Code_Challenged.Day4;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
//Get String from user and print just vowels(aeiou) inside String on the console

            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir string giriniz: ");
            String str = scanner.nextLine().toLowerCase();//soruda kucuk harf istemis o yuzden toLowerCase yaptik
        System.out.println("str = " + str);
    }
}
