package com;

public class While {
    public static void main(String[] args) {
        int counter = 10;
        while(counter < 5){
            System.out.println("to jest pętla while");
            counter++;
        }
        int counterDoWhile = 10;
        do{
            System.out.println("To jest pętla do while");
            counterDoWhile++;
        }while(counterDoWhile < 5);

    }
}
