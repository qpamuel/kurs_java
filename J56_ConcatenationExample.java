package com.example.basics.data.string_class;
// 03.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 65 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728910#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J56_ConcatenationExample {
    public static void main(String[] args) {
        //Łączenie łańcuchów, konkatenacja
        //Obiektyk klasy String można łączyć za pomocą znaku +, efektem jest powstanie nowego łańcucha

        String s1 = "Przykładowy String";
        String s2 = new String("Kolejny tekst");

        String s3 = s1 + s2;
        System.out.println(s3); //Przykładowy String Kolejny tekst

        // Łącząc String z wartością nie będącą łańcuchem wymusi konwersje na String.

        int year = 1967;
        String s4 = "Mustang rocznik " + year; // typ prosty int zamieniony na String
        System.out.println(s4); // Mustang rocznik 1967

        String s11 = "Hello ";
        String s22 = "World!";
        String s33 = s11 + s22 + " from Java prog.";
        System.out.println(s33);

        String txt1 = "Dodge Charger ";
        int year2 = 2020;

        String car = txt1 + year2;
        System.out.println(car);

        String car2 = txt1.concat(Integer.toString(year2));
        System.out.println(car2);
    }
}
