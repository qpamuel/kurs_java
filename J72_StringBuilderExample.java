package com.example.basics.data.string_class;
// 09.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 81 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23730422#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J72_StringBuilderExample {
    public static void main(String[] args) {

        // Klasa StringBuilder
        // Łączenie wielu łańcuchów znaków jest nieefektywne, gdyż przy każdej operacji powstaje nowy String,
        // a poprzecni musi być wyczyszczony przez Garbage Collector. Zużywa to więcej pamięci oraz spowalnia program.
        // Rozwiązaniem jest zastosowanie klasy StringBuilder.

        StringBuilder builderT = new StringBuilder();

        builderT.append(" Hello World ").append(" test ");
        System.out.println(builderT.toString()); // Hello World test 192

        builderT.insert(6, " INSERTED ");
        System.out.println(builderT.toString()); // Hello INSERTED World test 192

        builderT.delete(0, 6); // kasowanie od 0 do 5
        System.out.println(builderT.toString()); // INSERTED World test 192

        StringBuilder builder = new StringBuilder();
        builder.append("Ola ma kota.").append(123);
        builder.append(" Kolejny tekst");

        builder.insert(0, "Kasia ma psa. ");
        System.out.println(builder.toString()); // Kasia ma psa. Ola ma kota.123 Kolejny tekst

        builder.replace(0, 5, "Julia");
        System.out.println(builder.toString()); // Julia ma psa. Ola ma kota.123 Kolejny tekst

        builder.insert(12, " oraz kota");
        System.out.println(builder.toString()); // Julia ma psa oraz kota. Ola ma kota.123 Kolejny tekst

        int index = builder.indexOf("123");
        builder.delete(index, builder.length());
        System.out.println(builder.toString()); //Julia ma psa oraz kota. Ola ma kota.

    }
}
