package com.example.basics.operators;
//13.10.2023 - lesson arrange by Kuba Wąsikowski
// 37. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23522324#overview
public class J27_Op6_concatenattionOperator {
    public static void main(String args[]){

       // Operator konkatenacji, przypisanie, złożone
        // Konkatenacja służy do łączenia stringów
        String s1 = "Ola ";
        String str = s1 + "ma kota"; // wynik: Ola ma kota

        int a = 5;
        int b = 3;
        int c = a + b; // 8

        b += a; // 8 bo 5 + 3

        String t1 = "Hello ";
        String t2 = t1 + "World!";
        System.out.println(t2);
    }
}
