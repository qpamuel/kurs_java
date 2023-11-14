package com.example.oop.basics;
// 13.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 85 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32730172#overview



public class J76_Exercise_Object_Oriented_Programming {
    public static void main(String[] args) {

        /*
        Stwórz klasę Tv opisującą telewizor wraz z zzmiennymi jak:
        poducent, model, rok produkcji i dodatkowe informacje, które będą
        pasowały do produktu.
        Dodaj jedną metodę printBasicData() prezentującą w konsoli te trzy
        powyższe wartości przechowywane w instancji klasy.
        Na koniec dodaj instancję do głównego programu i wartości do
        podstawowych pól oraz wywołaj metodę printBasicData().
         */

        J76a_TvClass_for_J76 tv1 = new J76a_TvClass_for_J76();
        tv1.manufacturer = "Rubin";
        tv1.model = "Kolorowy";
        tv1.year = 1987;

        tv1.printBasicData();

    }
}
