package com.example.basics.data.string_class;
// 06.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 68 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23729020#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J59_StringComparison {
    public static void main(String[] args) {

        /*
        Porównywanie łańcuchów
        Standardowe porównanie prostych typów == nie sprawdzi sięprzy porównywania łańcuchów
        będących obiekatmi klasy String, gdyż w ten sposób sprawdza się czy łańcuchy są w tej samej
        lokacji w pamięci. Oczywiście może zdarzyć się sytuacja, że łąńcuchy będąwspółdzielone co da
        fałszywe przeświadczenie, że operator porównania działa.
         */

        String str = "Tekst"; // proste łańcuchy będą w praktyce współdzielone
        String txt = "Tekst"; // zoptymalizowane przez Javę
        // takie porównanie daje fałszywe true, bo w praktyce porównujemy
        // ten sam obiekt sam do siebie! Taki sam prosty tekst jest współdzielony.
        if (str == txt) {
            System.out.println(str + " - porównanie tekstów dało true - " + txt);
        } else {
            System.out.println(str + " - porównanie tekstów dało false - " + txt);
        }

        // Gdy łańcuchy nie są współdzielone, ale mimo wszystko porównujemy teksty mające to samo znaczenie
        // to otrzymamy wynik, że są nierówne. Oczywiście nie będzie to prawdą.

        String s1 = "Hello";
        String s2 = "He"; // s1 i s2 nie są współdzielone, bo to dwa różne teksty
        String s3 = s2 + "llo"; // operator konkatenacji stworzy nowy String: Hello
        System.out.println("s3: " + s3); // s3: Hello

        if (s1 == s3) { // "Hello" == "Hello" da false!
            System.out.println(s1 + " - równy - " + s2);
        } else {
            System.out.println( s1 + " - nie jest równy - " + s3); //Hello - nie jest równy - Hello
        }

        //Porównywanie łańcuchów z metodą equals()
        //Tylko metoda equals jest stosowana do porównywania łańcuchów znaków, ponieważ porównywana
        // jest zawartość czyli treść obu tekstów czy jest taka sama.

        String s11 = "Hello";
        String s22 = "He";
        String s33 = s22 + "llo";

        if (s11.equals(s33)) {
            System.out.println(s11 + " - równy - " + s33); //Hello - równy - Hello
        } else {
            System.out.println(s11 + " - nie jest równy - " + s33);
        }

        // Porównywanie łańcuchów z metodą equals()
        // Metoda equals bierze pod uwagę wielkość znaków, jeśli treść jest taka sama, ale wielkość znaków się różni
        // to nie będą takie same łańcuchy.

        String s111 = "HELlo";
        String s222 = "He";
        String s333 = s222 + "llo";

        if (s111.equals(s333)) {
            System.out.println(s111 + " - równy - " + s333);
        } else {
            System.out.println(s111 + " - nie jest równy - " + s333); // HELlo - nie jest równy - Hello
        }


        //Porównywanie łańcuchów z metodą equalsIgnoreCase()
        //Metoda equalsIgnoreCase porównuje łańcuchy ignorując wielkość znaków.

        String s11111 = "HELlo";
        String s22222 = "He";
        String s33333 = s22222 + "llo";

        if (s11111.equalsIgnoreCase(s33333)) {
            System.out.println(s11111 + " - równy - " + s33333); //HELlo - równy - Hello
        } else {
            System.out.println(s11111 + " - nie jest równy - " + s33333);
        }

        String s111111 = "Hello";
        String s222222 = "Hello";
        String s333333 = "HELLo";

        if(s222222.equals(s111111)) System.out.println("s2 równe jest s1");
        if(s333333.equals(s111111)) System.out.println("s3 równe jest s1"); //false
        if(s111111.equalsIgnoreCase(s333333)) System.out.println("s1 równe jest s3 - wiekość znaków jest ignorowana");
    }
}
