package com;

public class TabliceW {
    public static void main(String[] args) {
        int tab[][] = new int[2][3];
        int number = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = number;
                number++;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("tab[" + i + "," + "j] = " + tab[i][j] + ";");
            }
        }
    }
}
