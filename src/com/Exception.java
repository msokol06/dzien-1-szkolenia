package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        try {
            System.out.println("Przed wyjątkiem");
            // int a = 2 / 0;
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();

        } catch (ArithmeticException e) {
            System.out.println("to jest błąd arytmetyczny: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Błąd danych: " + e.getMessage());
        } finally {
            System.out.println("Po wyjątku");
        }
    }
}
