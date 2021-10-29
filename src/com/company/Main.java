package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String unknownName;
        final int NUM = 32;
        String word = "Exel";
        unknownName = NUM  + word;
        System.out.println(unknownName);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else
            System.out.println("Вы сохранили нуль");


        Scanner x = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String myName = x.nextLine();
        System.out.println("Привет "+ myName);
    }
}
