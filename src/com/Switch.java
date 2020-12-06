package com;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
  /*      int y=3;
        switch (y) {
            case 3:
                System.out.println("liczba 3");
                break;
            case 2:
                System.out.println("liczba 2");
                break;
            case 1:
                System.out.println("liczba 1");
                break;
            default:
                System.out.println("inna liczba");
        }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj gatunek owoców");
        String owoc = scan.nextLine();
        System.out.println("Podaj ilość");
        int ilosc = scan.nextInt();

        switch (owoc) {
            case "jablka":
                if (ilosc < 100)
                    System.out.println("Mamy jeszcze " + (100 - ilosc) + " kg miejsca");
                else if (ilosc == 100)
                    System.out.println("Jabłek jest w sam raz");
                else
                    System.out.println("Jablek jest o " + (ilosc - 100) + " kg za dużo");
                break;
            case "banany":
                if (ilosc < 100)
                    System.out.println("Mamy jeszcze " + (100 - ilosc) + " kg miejsca");
                else if (ilosc == 100)
                    System.out.println("Bananów jest w sam raz");
                else
                    System.out.println("Bananów jest o " + (ilosc - 100) + " kg za dużo");
                break;
            case "pomarancze":
                if (ilosc < 100)
                    System.out.println("Mamy jeszcze " + (100 - ilosc) + " kg miejsca");
                else if (ilosc == 100)
                    System.out.println("Pomarańczy jest w sam raz");
                else
                    System.out.println("Pomarańczy jest o " + (ilosc - 100) + " kg za dużo");
                break;
            default:
                System.out.println("Nie mamy takich owoców");
        }
    }
}

