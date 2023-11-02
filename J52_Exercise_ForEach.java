package com.example.basics.control_block_statements;
// 02.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 61 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32730136#overview

public class J52_Exercise_ForEach {
    public static void main(String[] args) {
        /*
        Zapisz tablicę liczb całkowitych od 0 do 5 w zmiennej numbers.
        Użyj pętli for each aby przejść po całej tablicy
        i dodaj do sibie wszystkie elementy.
        Sumę elementów zaprezentuj po pętli w konsoli.
         */

        int numbers[] = { 0, 1, 2, 3, 4, 5 };
        int sum = 0;

        for(int num : numbers) {
            sum += num;
        }
        System.out.println("Suma wszystkich elementów tablicy to: " + sum);
    }
}
