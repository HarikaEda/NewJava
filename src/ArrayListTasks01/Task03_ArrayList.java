package ArrayListTasks01;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.reflect.Array.getLength;

public class Task03_ArrayList {
    public static void main(String[] args) {
/*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("New jersey", "New york", "Ohio", "Florida", "Boston"));

        //getLength();
    }

   /* private static String getLength() {
        ArrayList<Integer> lengthList=new ArrayList<>();
      for (int i=0;i< lengthList.size();i++){
      }



    }*/


}


