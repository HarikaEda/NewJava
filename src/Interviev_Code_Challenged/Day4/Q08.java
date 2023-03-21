package Interviev_Code_Challenged.Day4;

public class Q08 {
    public static void main(String[] args) {
/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */
            String str = "aaabbbbbcccccccc";
            String tekrarEdenKarakter="";
            int sayac=0;
for (int i = 0; i <str.length(); i++){
    if (str.charAt(i) == (char) i){
        sayac++;
    }
}

    }
}
