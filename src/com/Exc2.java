package com;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę testów");
        int testnum = scanner.nextInt();
        System.out.println("Podaj n");
        int n = scanner.nextInt();
        int tab[] = new int[n];
      //  for (int i =0; i<testnum; i++)
        for (int i : tab) {
            System.out.println("Podaj liczbę:");
            tab[i] = scanner.nextInt();
        }


    }
}

/*
package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises5 {
    // https://pl.spoj.com/problems/RNO_DOD/

    public static void main(String[] args) {

        System.out.println("podaj liczbe testow");
        Scanner scanner = new Scanner(System.in);
        int testsNumber = scanner.nextInt();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < testsNumber; i++) {
            int amountNumbersToSum = scanner.nextInt();
            int sum = 0;
            for (int y = 0; y < amountNumbersToSum; y++) {
                sum = sum + scanner.nextInt();
            }
            results.add(sum);
        }

        System.out.println(results);
    }
}
 */


/*
package com;

import java.util.Scanner;

public class rno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Podaj liczba testów:");
        int liczbaTestow = scan.nextInt();
        int[] liczby = new int[liczbaTestow];
        String[] liczbyTest = new String[liczbaTestow];
        for (int i = 1; i <= liczbaTestow; i++) {
            System.out.print("Podaj ilość liczb dla testu " + i + ":");
            liczby[i - 1] = scan.nextInt();
            System.out.print("Podaj liczby dla testu " + i + ":");
            liczbyTest[i - 1] = scan2.nextLine();
        }

        for (String liczbyTestu:liczbyTest) {
            String[] elementy = liczbyTestu.split(" ");
            int suma = 0;
            for (int i = 0; i< elementy.length; i++) {
                suma += Integer.parseInt(elementy[i]);
            }
            System.out.println(suma);
        }
    }
}
 */