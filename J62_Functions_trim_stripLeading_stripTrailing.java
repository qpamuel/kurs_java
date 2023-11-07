package com.example.basics.data.string_class;
// 07.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 71 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23730060#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J62_Functions_trim_stripLeading_stripTrailing {
    public static void main(String[] args) {

        //Przydatne funkcje klasy String: trim, stripLeading, stripTrailing
        //Funkcje kasujące białe znaki: spacje, znaki nowej linii, tabulacje itd.

        // łańcuch znaków z białymi znakami (spacjami na początku i końcu)
        String strTest = " Hello World!     ";

        // skasowanie białych znaków na początku i końcu łańcucha
        String trimedText = strTest.trim(); // "Hello World!"

        // skasowanie białych znaków na początku łańcucha
        String trimedFront = strTest.stripLeading(); // "Hello World!   "

        // skasowanie białych znaków na końcu łańcucha
        String trimedBack = strTest.stripTrailing(); // " Hello World!"

        String str = "     \n  \n Hello World!          \n  ";
        String str2 = str.trim();
        System.out.println( "\"" + str2 + "\"" );

        String str3 = str.stripLeading();
        System.out.println( "\"" + str3 + "\"" );

        String str4 = str.stripTrailing();
        System.out.println( "\"" + str4 + "\"");


    }

}
