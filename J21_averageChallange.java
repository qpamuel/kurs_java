package com.example.basics.operators;
//12.10.2023 - lesson arrange by Kuba Wąsikowski
// 31. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32694414#overview
public class J21_averageChallange {
    public static void main(String args[]){
        /*
        1.  Oblicz średnią z następujących liczb: 1, 2, 3, 4
            Pamiętaj o użyciu nawiasów aby operacje matematyczne
            były prawidłowe.
            Upewnij się że dzielisz przez liczbę zmiennoprzecinkową.
            Zaprezentuj wynik użytkownikowi.
        2.  Zaprezentuj efekt inkrementacji i dekrementacji obliczenej wcześniej średniej.
         */

        /*
        double dane = 1 + 2 + 3 + 4;
        System.out.println( "Wartość danych: " + dane);

        double iloscDanych = 4;

        double srednia = dane / iloscDanych;
        System.out.println( "Wartość średniej: " + srednia );
        */

        double srednia = ( 1 + 2 + 3 + 4 ) / 4.0d;
        System.out.println( "Średnia: " + srednia);

        /*
        double prezentacja1 = 13 + ++srednia;
        System.out.println( "Prezentacja1: " + prezentacja1);

        double prezentacja2 = 13 + --srednia;
        System.out.println( "Prezentacja2: " + prezentacja2 );
         */

        --srednia;
        --srednia;
        --srednia;
        System.out.println("Dekrementacja x3: " + srednia);

        ++srednia;
        ++srednia;
        ++srednia;
        System.out.println( "Inkrementacja x3: " + srednia);

    }

}
