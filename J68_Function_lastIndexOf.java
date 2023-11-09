package com.example.basics.data.string_class;
// 09.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 77 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23730334#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J68_Function_lastIndexOf {
    public static void main(String[] args) {

        // Przydatne funkcje klasy String: lastIndexOf
        // Wyszukiwanie ostatniego wystąpienia tekstu w łańcuchy znaków dzięki funkcji lastIndexOf
        // Jeśli szykanego tekstu nie będzie w łańcuchu zwrócona zostanie wartość -1

        String strTest = "Kasia ma kota, również Kasia ma psa.";
        System.out.println("Praca na Stringu: " + strTest);

        int indexTest = strTest.lastIndexOf("Kasia");
        System.out.println("index znalezionego fragmentu 'Kasia': " + indexTest);
        // index znalezionego fragmentu 'Kasia': 23

        //gdy nie ma szukanego tekstu zwaracane jest -1
        int numTest = strTest.lastIndexOf("Adam");
        System.out.println("num: " + numTest); // num: -1

        String str = "Raz dwa trzy cztery. Raz dwa.";
        System.out.println("Praca na tekście: " + str);

        int index = str.lastIndexOf("Raz");
        System.out.println("Ostatnie wystąpienie 'Raz': " + index);
        String fragment = str.substring(index);
        System.out.println("Fragment: " + fragment);

        index = str.indexOf("Raz");
        System.out.println("Pierwsze wystąpienie 'Raz': " + index);

    }

}
