package com.example.basics.data;
//10.10.2023 - lesson arrange by Kuba Wąsikowski
// "https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23522440#overview"
public class J17_MathRoundCeilFloor {
    public static void main(String args[]){
        /*
        Zaokrąglenie liczby rzeczywistej do najbliżeszej liczby całkowitej
        W praktyce najlepiej jest zaokrąglić liczbę rzeczywistą do najbliższej liczby całkowitej np:
        3.45 do wartości 3
        3.89 do wartości 4
        Służy do tego funkcja Math.round();


        double d = 10.876;
        int i = (int)d; // rzutowanie double na int

        System.out.println(i); //10 bo część ułamkowa została utracona po konwersji
        System.out.println( Math.round(d));
         */

        //zaokrąglenie do najbliższej liczby całkowitej
        System.out.println( Math.round(5.51)); //6
        System.out.println( Math.round(5.49)); //5

        //rzutowanie, utrata części ułamkowej - zawsze w dół
        System.out.println( (int) 5.45d ); //5

        // Math.ceil() - największa możliwa liczba całkowita
        System.out.println( Math.ceil(6.11) ); //7.0
        System.out.println(  Math.ceil(6.8) ); //7.0

        // Math.floor - najmniejsza możliwa liczba całkowita
        System.out.println( Math.floor(6.11) ); //6.0
        System.out.println( Math.floor(6.8) ); //6.0
    }
}
