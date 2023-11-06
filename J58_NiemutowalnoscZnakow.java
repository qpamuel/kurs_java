package com.example.basics.data.string_class;
// 06.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 67 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728950#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J58_NiemutowalnoscZnakow {
    public static void main(String[] args) {

        // Łańcuchy znaków są w Java niemutowalne
        // Obiekty klasy String są niemutowalne, z ang. immutable, czyli nie można zmienić ich zawartości.
        // Aby zmienić łańcuch trzeba stworzyć nowy na ego podstawie korzytając z wielu funkcji klasy String.

        // aby zmienić zawartość tekstu np World na User
        // można skorzystać np z funkcji replaceAll, któa zwróci
        // nowy zmieniony String
        String txt = "Hello World!";
        txt = txt.replaceAll("World", "User");

        System.out.println(txt); // Hello User!

    }
}
