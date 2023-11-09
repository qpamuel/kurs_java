package com.example.basics.data.string_class;
// 09.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 76 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23730314#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J67_Function_indexOf {
    public static void main(String[] args) {

        //Przydatne funkcje klasy String: indexOf
        // Wyszukiwanie pierwszego wystąpienia tekstu w łańcuchu znakó dzięki funkcji indexOf
        // Jeśli szukanego tekstu nie będzie w łańcuchu znaków zostanie zwrócona wartość -1

        String str = "Ola ma kota, natomiast Kasia ma psa";
        int index = str.indexOf("Kasia");
        System.out.println("index od którego zaczyna się 'Kasia': " + index); // ..23

        String strFragment = str.substring(index); // pobranie fragmentu tekstu od indeksu 25
        System.out.println("Fragment tekstu: " + strFragment); // Fragment tekstu: Kasia ma psa.

        int num = str.indexOf("Adam"); // gdy nie ma szukanego tekstu zwracane jest -1
        System.out.println("num: " + num); // num: -1

        int nr = str.indexOf("nr: ", 10); // szukanie od przekazanego indeksu np 10
        System.out.println("nr: " + nr); //nr: -1

        String str11 = "Raz dwa trzy cztery";
        System.out.println("Praca na tekście: " + str11);

        int index11 = str11.indexOf("dwa trzy");
        System.out.println("dwa trzy, index: " + index11);

        index11 = str11.indexOf("pięć");
        System.out.println("pięć, index: " + index11);

        index11 = str11.indexOf("trzy", 10);
        System.out.println("trzy, fromIndex 10: " + index11);



    }
}
