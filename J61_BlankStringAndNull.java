package com.example.basics.data.string_class;
// 07.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 70 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23729218#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J61_BlankStringAndNull {
    public static void main(String[] args) {

        //Puste łańcuchy i wartość null
        //Łańcuchy znaków, które są puste nie mają treści, ale nadal są to obiekty klasy String, ale o zerowej
        //długości znaków. Z drugiej strony null wskazuje, że do zmiennej nie został przypisany jakikolwiek obiekt.

        //null wskazuje brak przypisanej wartości/obiektu
        String s1 = null;
        System.out.println("s1" + s1); // s1: null

        // przypisany obiekt typu String, ale jest to pusty łańcuch
        String s2 = "";
        System.out.println("s2 długość: " + s2.length());

        String s11 = "";
        System.out.println(s11.length());
        s11 = s11.concat("Hello World!");

        String s22 = null;
        /*
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s22" is null
	at com.example.basics.data.string_class.J61_BlankStringAndNull.main(J61_BlankStringAndNull.java:26)
	null nie ma długości bo nie ma przypisanej żadnej wartości - nawet zero.
         */
        s22 = "test";
        System.out.println(s22.length());
        s22 = null;
        System.out.println("s22: " + s22);

    }
}
