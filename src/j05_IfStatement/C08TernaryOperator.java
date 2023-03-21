package j05_IfStatement;

import java.util.Scanner;

public class C08TernaryOperator {
    public static void main(String[] args) {
/*
Task-> Girilen  ürün miktarını ve ürünün birim fiyatını için Eğer urun miktarı 100 den fazla ise
      %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
*/
        Scanner input=new Scanner(System.in);
        System.out.println("ürün miktarı giriniz");
       double urun1= input.nextDouble();
        System.out.println("birim fiyatı giriniz");
       double urun2=input.nextDouble();
        System.out.println ((urun1>100)?(urun1*urun2*0.67):(urun1*urun2 ));












    }
}
