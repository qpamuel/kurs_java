package com.example.basics.control_block_statements;
// 26.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 49 https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32717216#overview

import java.sql.SQLOutput;

public class J40_Exercise_ForLoop {
    public static void main(String args[]){
        /*
        Wykorzystaj pętlę for aby pokazać wszystkie elementy tablicy
        od jej początku w konsoli.
        Użyj kolejnej pętli for aby pokazać elementy tablicy
        od końća do początku.
         */
        String names[] = { "Ania", "Kasia", "Ola", "Olek", "Daniel" };

        System.out.println("Imiona od początku: ");
        for ( int i = 0; i < names.length; i++ ) {
            System.out.println("Imię " + i + " " + names[i]);
        }

        System.out.println("Imiona od końca: ");
        for ( int i = names.length - 1; i >= 0; i-- ) {
            System.out.println("Imię: " + i + " " + names[i]);
        }

        /*
        for ( int odPrzodu = 0; odPrzodu < names.length; odPrzodu ++ ) {
            String elementTablicyOdPrzodu = names[odPrzodu];
            System.out.println("Element tablicy od przodu: " + elementTablicyOdPrzodu);

        for ( int odTyłu = names.length - 1; odTyłu >= 0; odTyłu -- ) {
            String elementTablicyOdTyłu = names[odTyłu];
            System.out.println("Element tablicy od tyłu: " + elementTablicyOdTyłu);
        }
        */
    }
}
