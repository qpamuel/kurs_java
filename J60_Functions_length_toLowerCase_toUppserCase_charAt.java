package com.example.basics.data.string_class;
// 06.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 69 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23729082#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J60_Functions_length_toLowerCase_toUppserCase_charAt  {
    public static void main(String[] args) {

        // Przydatne funkcje klasy String: toLowerCase, toUpperCase, chartAt, length
        // Łańcuchy znaków są jedynym z częściej wykorzystywanych rodzajów danych na których operują
        // programy, dlatego klasa String dostarcza wiele przydatnych funkcji.

        String str = "Hello World!";
        int strLength = str.length(); // 12 - długość łańcucha znaków

        // znak char pod indeksem 0 łańcucha
        char character = str.charAt(0); // H
        System.out.println(character);

        // nowy String z małymi literami na bazie łańcucha
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase); //hello world!

        //nowy String z dużymi literami na bazie łańcucha
        String upperCase = str.toUpperCase();
        System.out.println(upperCase); //HELLO WORLD!

        String str111 = "Ola ma kota";
        System.out.println("ilość znaków: " + str.length());

        char sign = str111.charAt(1);
        System.out.println("Znak pod indeksem 1: " + sign);

        String str111Up = str111.toUpperCase();
        System.out.println(str111Up);

        String str111LowerCase = str111.toLowerCase();
        System.out.println(str111LowerCase);

    }
}
