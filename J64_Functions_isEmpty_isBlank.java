package com.example.basics.data.string_class;
// 09.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 73 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23730122#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J64_Functions_isEmpty_isBlank {
    public static void main(String[] args){

        //Przydatne funkcje klasy String: isEmpty, isBlank
        // Funkcje sprawdzające czy łańcuchy są puste:
        // isEmpty zwraca true jeśli length = 0
        // isBlank zwróci true jeśli length = 0 lub treść to białe znaki: spacje, tabulacje etc.
        String emptyStrTest = ""; // pusty String

        if (emptyStrTest.isEmpty()) { // true
            System.out.println("Pusty String bo length: " + emptyStrTest.length()); // Pusty Sting bo length: 0
        }
        if (emptyStrTest.isBlank()) { // true
            System.out.println("isBlank() , pusty String bo length: " + emptyStrTest.length()); // ..lenght: 0
        }

        String emptyStr = "";
        String blankStr = "     \n           ";

        if(emptyStr.isEmpty()) { //true
            System.out.println("emptyStr jest pusty - is Empty()");
        }

        if (blankStr.isEmpty()) { //false
            System.out.println("blankStr jest pusty - is Empty");
        } else {
            System.out.println("blankStr nie jest pusty - isEmpty()");
        }

        if (blankStr.isBlank()) { //true
            System.out.println("blankStr 0 ma znaków lub same białe znaki - isBlank()");
        }

        if (emptyStr.isBlank()) { //true
            System.out.println("emptyStr 0 ma znaków lub same białe znaki - isBlank()");
        }
    }
}
