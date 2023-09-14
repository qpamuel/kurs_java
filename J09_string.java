package com.example.basics.data.types;

import java.util.Locale;

public class J09_string {
    public static void main(String args[]){
        /*
        Klasa String pozwala na zapisanie łąńcuchów znaków w kodowaniu Unicode (UTF-16).
        Znaki indeksowane są od 0.
        Różne Stringi mogę być łączone z innymi Stringami oraz typami za pomocą konkatenacji +
        Stringi posiadają wiele użytecznych funkcji do pracy z tekstem.
        Raz stworzony String nie może być modyfikowany - pamięć będzie zwalaniana i powstanie nowy String.
         */
        String s1 = "Ola ma "; //nowy String jako literał tekstowy
        String s2 = new String("Kota"); //z użyciem konstruktora
        s1 = s1 + s2; // łączenie dwóch stringów, powstanie nowy string przypisany do s1
        System.out.println(s1); // Ola ma kota

        /*
        Znaki specjalne
        Lewy ukośnik tzw backslash czyli \, inaczej zwany symbolem ucieczki (escape character)
        pozwala na zastosowanie znaków specjalnych w tekście.
        Nowy wiersz \n
        Tabulacja - Tab \t
        Backspace \b
        Powrót karteki \r
        Apostrof \'
        Cudzysłów \"
        Backslash \\
        Dowolny znak Unicode \u2222
         */
        String s3 = "String #1 ";
        String s4 = new String(" str #2");
        String s5 = s3 + s4;
        System.out.println(s5.toUpperCase());

        String s6 = "wiersz 3 \nwiersz 4 \nwiersz 5 \n\u263a \n\"";
        System.out.println(s6);
    }
}
