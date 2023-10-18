package com.example.basics.control_block_statements;

import java.util.Scanner;

// 17.10.2023 - lesson arrange by Kuba Wąsikowski
// lekcja 41. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32706160#overview
public class J32_IfExercise_second {
    public static void main(String args []){
        /*
            Napiesz program kwalifikujący do oddania krwi
            Taka osoba musi mieć 18lat i minimum 50kg wagi.
            Użyj zagnieżdżonych instrukcji if.
            Pamiętaj o informacji dla użytkownika czy się kwalifikuje
            oraz dlaczego nie spełnia danego warunku.
            Dla uproszczenia stosuj liczby całkowie.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź swój wiek: ");
        int wiek = Integer.parseInt(scanner.nextLine());
        System.out.println("Wprowadź swoją wagę: ");
        int waga = Integer.parseInt(scanner.nextLine());

        if ( wiek >= 18 && waga >= 50 ) {
            System.out.println( "Kwalifikujesz się! Możesz oddać krew!" );
        } else {
            System.out.println( "Przykro nam, ale nie kwalifikujesz się do odddnia krwi.");
        }

        scanner.close();

        /*
        int age = 18;
        int weight = 50;

        if ( age >= 18 ){
            if ( weight >= 50 ) {
                System.out.println( "Można oddać krew.");
            }
            else {
                System.out.println( "Kryterium wagi nie spełnione - nie można oddać krwi.");
            }
        } else {
            System.out.println( "Kryterium wieku nie spełnione - nie można oddać krwi.");
        }
        */

    }
}
