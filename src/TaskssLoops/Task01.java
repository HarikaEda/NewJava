package TaskssLoops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
       /* Interview Question

        Girilen  100’den kucuk bir tamsayi için
        1’den baslayarak girilen sayiya kadar tum sayilari
                - Sayi 3’un kati ise sayi yerine “Java”
        - Sayi 5’in kati ise sayi yerine “CAN'dır”
                - Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

     */ Scanner input=new Scanner(System.in);
        System.out.println("1 ile 100 arası bir tam sayı giriniz");
        int sayi= input.nextInt();

        for (int i=1;i<100;i++){
           if (i%3==0) System.out.println("java");else if (i%5==0) System.out.println("CAN");else System.out.println("javaCAN");

           } }}














