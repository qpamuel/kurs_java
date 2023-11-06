package com.example.basics.data.string_class;
// 06.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 66 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32730142#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J57_Exercise_ConcatenationExample {
    public static void main(String[] args) {

        /*
        Stwórz tablicę 4 imion i połącz je za pomocą konkatenacji,
        nie ważne czy będzie to operator + czy metoda concat().
        Zaprezentuj na koniec wynik połączenia wszystkich elementów.
        Pamiętaj o spacji rozdzielającej imiona :)
         */
        String names[] = { "Ola", "Kasia", "Ela", "Karol" };
        String str = "";
        for (String s : names) {
            str = str.concat(s);
            str += " ";
        }
        System.out.println(str);
    }
}
