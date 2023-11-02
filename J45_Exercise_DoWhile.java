package com.example.basics.control_block_statements;
// 31.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 54 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32717234#overview

public class J45_Exercise_DoWhile {
    public static void main(String[] args) {

        /*
        Stwórz pętle Do While od 0 do 20
        i wyświetl tylko i wyłącznie nieparzyste liczby
         */

        int nieparzysta = 0;
        do {
            if (nieparzysta % 2 == 1){ //(nieparzysta % 2 != 0)
                System.out.println("liczba " + nieparzysta + " jest nieparzysta");
            };
            nieparzysta++;
        } while (nieparzysta <= 20);

    }
}
