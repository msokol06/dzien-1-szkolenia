package com;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dolną granicę zakresu");
        int down = scanner.nextInt();
        System.out.println("Podaj górną granicę zakresu");
        int up = scanner.nextInt();
        int[] dividers = new int[up - down+1];

        for (int i= down; i <=up; i++ ) {
            dividers[i-1] = i;
        }
        for (int i = down; i <= up; i++) {
            int sum = 0;
            for (int j=0; j<dividers.length;j++) {
                if (i % dividers[j] == 0) sum++;
            }
            if (sum == 2) System.out.println(i);
        }
    }
}