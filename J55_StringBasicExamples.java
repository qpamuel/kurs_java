package com.example.basics.data.string_class;
// 03.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 64 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728874#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J55_StringBasicExamples {
    public static void main(String[] args) {

        //Łańcuchy znaków, String
        //W javie nie ma wbudowanego typu String, tak naprawdę korzysta z predefiniowanej klasy o nazwie String.
        // Łańcuchy znakó zawarte w cudzysłowiu sątak naprawdę obiektem klasy String, który jest
        //tworzony automatycznie przez Javę.

        String s1 = "Przykładowy String"; // tak naprawdę tworzony jest obiekt klasy String
        String s2 = new String("Kolejny tekst"); // rónież obiekt klasy String

        // Inne sposoby tworzenia łańcuchów
        String str = "Info ".repeat(3); // powtórzony String 3 razy: "Info Info Info"
        // funkcja join połączy przekazane łąńcuchy podanym stringiem np kropką
        String txt = String.join(".", "Jeden", "Dwa", "Trzy"); //Jeden.Dwa.Trzy

        char arr[] = {'P', 'O', 'L', 'S', 'K', 'A'};
        String strx = new String(arr); // POLSKA

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(str);
        System.out.println(txt);
        System.out.println(strx);

        String s11 = "Hello World!";
        String s22 = new String("String passed to constructor");
        String s33 = "test".repeat(5);
        System.out.println(s33);
        String s44 = String.join(".", "1asdf", "2", "3gasd", "4", "5");
        System.out.println(s44);
        char arrarr [] = {'O', 'L','A'};
        System.out.println(arrarr);



    }
}
