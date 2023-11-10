package com.example.basics.data.string_class;
// 09.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 79 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32730154#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J70_Exercise_methodInString {
    public static void main(String[] args){

        /*
        Stwórz zmienną text z trzykrotnie powtórzonym łańcuchem
        znaków "Ola ma kota".
        Zamień wszystkie wystąpienia "Ola" na "Kasia".
        Dodatkowo zamień pierwsze wystąpienie "Kasia" na "Monika".
        Końcowy tekst zaprezentuj w konsoli.
        Znajdź indeks pierwszego wystąpienia "Kasia" i podaj go w konsoli.
        Znajdź ostatni indeks "Kasia" i rónież wypisz go w konsoli.
        Wyświetl fragment tekstu od pierwszego wystąpienia "Kasia" do końca łańcucha.
         */

        String text = "Ola ma kota. ";
        text = text.repeat(3);
        text = text.replaceAll("Ola", "Kasia");
        text = text.replaceFirst("Kasia", "Monika");
        System.out.println(text);

        int firstIndex = text.indexOf("Kasia");
        System.out.println("Wartość index'u pierwszego wystąpienia imienia Kasia to: " + firstIndex);

        int lastIndex = text.lastIndexOf("Kasia");
        System.out.println("Wartość index'u ostatniego wystąpienia imienia Kasia to: " + lastIndex);

        String fromLastIndex = text.substring(firstIndex);
        System.out.println(fromLastIndex);

    }
}
