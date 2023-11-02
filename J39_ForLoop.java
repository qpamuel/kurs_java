package com.example.basics.control_block_statements;
// 29.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 48 https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728422#overview

public class J39_ForLoop {
    public static void main(String args[]) {

        // Pętla for
        // Pętle pozwalają na wykonanie instrucji tak długo jak warunek jest spełniony.
        // Uwaga: warunek sprawdzany w iteracji nie powinien skutkować nieskończoną pętlą!

        String names[] = { "Adam", "Ola", "Kasia" };
        // a to wartość początkowa akumulatora
        // W każdej interacji sprawdzana jest z względem długości tablicy
        // jeśli true iteracja się wykona
        // Po wykonaniu iteracji następuje inkrementacja a
        for (int a = 0; a < names.length; a++) {
            String str = names[a];
            System.out.println("Osoba: " + str);
        }

        int arr[] = { 1, 5, 10, 15, 23, 34, 64, 98, 879, 1234, 23466, 6451135 };
        for (int i = 0; i < arr.length; i += 2) {
            int value = arr[i];
            System.out.println("arr: " + value);
        }

        String names2[] = { "Adam", "Ola", "Kasia" };
        for ( int i = names.length - 1; i >= 0; i-- ) {
            String str2 = names[i];
            System.out.println("Imię: " + str2);
        }
    }
}
