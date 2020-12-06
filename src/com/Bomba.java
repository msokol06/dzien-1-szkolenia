package com;

import java.util.Scanner;

public class Bomba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nastaw licznik bomby");
        int licznik = scan.nextInt();

        for ( int i = licznik; i > 0; i--){
            System.out.println("Bomba wybuchnie za " + i);
        }
        System.out.println("BOOM!");


    }
}
