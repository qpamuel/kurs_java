package com.example.basics.data.string_class;
// 07.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 72 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23730088#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J63_Functions_substring {
    public static void main(String[] args) {

        //Przydatne funkcje klasy String: substring
        //Funckje operujące na łańcuchach.
        String str = "Ola ma kota.";

        // pobranie kawałka łańcucha funckją substring (int beginIndex)
        // beginIndex - indeks liczony od zeraz od którego skopiowany będzie łańcuch
        // do jego końca.
        String strFragment = str.substring(3);
        System.out.println("'" + strFragment + "'");

        //pobranie fragmentu łańcucha dzięki substring (int beginIndex, int endIndex)
        // beginIndex - od któego indeksu skopiować tekst, inclusive
        // endIndex - do którego indeksu skopiować nieuwzględniając ostatniego indeksu, exclusive
        String strPart = str.substring(4, 8); // w praktyce od 4 do 7 indexu
        System.out.println("'" + strPart + "'"); // 'ma k'

        String str2 = "Ola ma psa oraz kota";

        String frag1 = str2.substring(7);
        System.out.println(frag1);

        String frag2 = str2.substring(7, 9);
        System.out.println(frag2);

    }
}
