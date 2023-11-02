package com.example.basics.control_block_statements;
// 31.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 57 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32717256#overview

public class J48_Exercise_Continue {
    public static void main(String[] args) {

        /*
        Stwórz dowolną pętlę od 0 do 50.
        W każdej iteracji oblicz czy licznik jest
        podzielny przez 3 (reszta z dzielenia będzie 0),
        w takiej sytuacji przeskocz do kolejnej iteracji.
        Wyświetl wartość licznika po wykonaniu sprawdzenia.
         */

        int i = 0;

        for (i = 0; i <= 50; i++) {
            if (i % 3 == 0) {continue;}
            System.out.println("Liczba " + i + " nie jest podzielna przez 3!");
        }


    }
}
