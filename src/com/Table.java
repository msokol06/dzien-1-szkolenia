package com;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int size = scan.nextInt();
        int table [] = new int[size];

        for (int i = 0; i < size; i++) {
            table[i] = i + 1;
        }
        int counter = 0;
        while(counter < size){
            System.out.println(table[counter]);
            counter++;
        }

    }
}
