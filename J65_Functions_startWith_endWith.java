package com.example.basics.data.string_class;
// 09.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 74 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23730144#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J65_Functions_startWith_endWith {
    public static void main(String[] args) {

        // Przydatne funkcje klasy String: startsWith, endsWith
        // Funkcje sprawdzające czy łańcuch zaczyna się czy kończy danym tekstem.

        String str1 = "Hello World!";

        if (str1.startsWith("Hello")) { //true, bo zaczyna się tekstem Hello
            System.out.println("String zaczyna się tekstem Hello");
        }
        if (str1.endsWith("Hello")) { //false, bo nie kończy się tym tekstem
            System.out.println("String kończy się tekstem Hello");
        }
        if (str1.endsWith("World!")) { // true, bo kończy się na World!
            System.out.println("String kończy się tekstem World!");
        }

        String str = "Java program";

        if (str.startsWith("PHP")) System.out.println("Starts with PHP");
        if (str.startsWith("Java")) System.out.println("Starts with Java");
        if (str.endsWith("program")) System.out.println("Ends with program");
    }
}
