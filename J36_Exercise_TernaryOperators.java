package com.example.basics.control_block_statements;
// 29.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 45 https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32706170#overview
public class J36_Exercise_TernaryOperators {
    public static void main(String args[]){
        /*
        Użyj operator trójargumentowy aby sprawdzić czy liczba jest parzysta lub nieparzysta.
        Zastosuj operator modulo, który jeśli zawróci 0
        to wskarze parzystą liczbę.
        Pokaż informacje o wyniku w konsoli
         */

        int number = 12;
        String info = (number % 2 == 0) ? "parzysta" : "nieparzysta";

        System.out.println("Liczba: " + number + " jest " + info);
    }
}
