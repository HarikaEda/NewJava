package ArrayListTasks01;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02_ÖğrtNot {
    public static void main(String[] args) {
    /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */


        ArrayList<Integer> notlarListesi = new ArrayList<>();
        // 1. adım, henüz içi boş bir arraylist
        Scanner scan = new Scanner(System.in);
        System.out.println("kaç tane not girmek istiyorsunuz");
        int notSayisi= scan.nextInt(); //2. adım
        int toplam=0;

        for (int i = 0; i < notSayisi; i++) { // 3. adım
            System.out.println("notları giriniz");
            int notlar= scan.nextInt();
            notlarListesi.add(notlar);
            toplam+=notlar;
        }
        int ortalama= toplam/notSayisi; // 4. adım
        int sayac=0;

        for (int i = 0; i < notlarListesi.size(); i++) {
            if (notlarListesi.get(i)>ortalama) {
                sayac++;
            }
        }
        System.out.println("ortalama= "+ortalama);
        System.out.println("ortalamayı geçen öğrenci sayısı "+sayac);

    }
}









