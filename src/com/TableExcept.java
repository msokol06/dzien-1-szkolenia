package com;

public class TableExcept {
    public static void main(String[] args) {
        try {
            int[] table = new int[5];
            for (int i = 0; i < table.length; i++) table[i] = i + 1;
            for (int i = 0; i < table.length + 1; i++) {
                System.out.println(table[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Koniec");
        }
    }
}
