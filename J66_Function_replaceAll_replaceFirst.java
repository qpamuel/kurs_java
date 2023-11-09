package com.example.basics.data.string_class;
// 09.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 75 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23730160#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J66_Function_replaceAll_replaceFirst {
    public static void main(String[] args) {
        // Przydatne funkcje klasy String: replaceAll, replaceFirst
        // Funkcja replaceAll szuka i podmienia wszystkie wystąpienia tekstu w podanym łańcuchu znaków
        // zwraca zamieniony String. Funkcja replaceFirst podmienia tylko pierwsze wystąpienie.

        String str = "Ola ma kota. Dodatkowo Ola ma psa.";

        // podmiana wszystkich wystąpień "Ola" na "Kasia"
        String changed = str.replaceAll("Ola", "Kasia");
        System.out.println(changed); // Kasia ma kota. Dodatkowo Kasia ma psa.

        String firstChanged = str.replaceFirst("Ola", "Kasia");
        System.out.println(firstChanged);

        String str11 = "Jan Kowalski Kasia Kowalska";
        String str111 = str11.replaceAll("Kowalska", "Zawadzka");
        System.out.println(str111);

        String str22 = str11.replaceFirst(" ", " Junior ");
        System.out.println(str22);
    }
}
