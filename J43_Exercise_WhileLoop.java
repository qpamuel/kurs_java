package com.example.basics.control_block_statements;
// 26.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 52 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32717228#overview

public class J43_Exercise_WhileLoop {
    public static void main(String[] args) {

    /*
    Wykorzytaj pętle while do odczytania wszystkich liczb
    z tablicy i pomnożenia każdej z nich przez dwa.
    Pokaż każdy z wyników w konsoli.
     */
    int numbers[] = { 1, 2, 3, 4, 5, 6 };
    int i = 0;
    while (i < numbers.length) {
            System.out.println("Pozycja z tablicy: " + numbers[i] * 2);
            i++;
        }
    }
}
