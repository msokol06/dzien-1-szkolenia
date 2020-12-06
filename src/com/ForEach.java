package com;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List<Integer> listint = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            listint.add(i);
        }
        for (int i : listint) {
            if (i % 2 == 0) listint.set(i, i * 2);
        }
        for (int i : listint) {
            System.out.println(i);
        }


    }
}
