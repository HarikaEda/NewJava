package j22_Scope;

import javax.swing.*;

public class C04_LocalVariable {
    public static void main(String[] args) {
int yas=33;//
yas=48;
        System.out.println("yas = " + yas);

    /* i=23;//i loop vriable aynı loop

*/
            int yas1 = 33;//main localde cretae edilen primitive variable
            System.out.println("yas = " + yas);//33 -> aynı localde veriable call edildi

            for (int i = 1; i < 7; i++) {//for loop level
                System.out.println(yas+" " + i);//yas main local variable aynı main locale call edildi
                i+=3;//i loop variable aynı loop localde call edildi
            }//for loop sonu

            //i=23; //i loop local dısı call edilemez
        yas = 48;//main local variable doğrudan call edilerek update edildi
            System.out.println("yas = " + yas);
     }//main sonu
        //yas-> main localde tanımlandığı için main local dısı call edilemez
    }//class sonu








