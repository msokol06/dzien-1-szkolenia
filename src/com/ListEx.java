package com;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
  /*      List<String> stringList= new ArrayList<String>();
        stringList.add("Jan");
        stringList.add("Kuba");
        stringList.add("Mateusz");

        System.out.println(stringList.contains("Jan"));
        System.out.println(stringList.size());
        stringList.remove(0);

        System.out.println(stringList.contains("Jan"));
        System.out.println(stringList.size());
*/
        List<Integer> listint = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            listint.add(i);
        }
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) listint.set(i,i*2);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(listint.get(i));
        }
    }
}
