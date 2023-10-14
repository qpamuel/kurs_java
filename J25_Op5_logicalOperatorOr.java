package com.example.basics.operators;
//13.10.2023 - lesson arrange by Kuba Wąsikowski
// 35. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32706096#overview
public class J25_Op5_logicalOperatorOr {
    public static void main(String args[]){

        //Operatory logiczne

        //Alternatywa || ("lub") zwróci false, gdy oba warunki dadzą false.
        // true || true zwróci true
        // true || false zwróci true
        // false || true zwróci true
        // false || false zwróci false

        System.out.println( 10 > 4 || 12 == 12 ); // true, obie strony dają wynik true
        System.out.println( 10 >4 || 3 > 12 ); // true, bo lewa strona daje true, a prawa false
        System.out.println( 4 < 1 || 6 != 6 ); // false, bo obie strony dają false

        // operator logiczny alternatywa, inaczej lub, or
        // true || true - wynik true
        // false || true - wynik true
        // true || false - wynik true
        // false || false - wynik false

        System.out.println( 10 > 2 || 5 >= 1 ); // true
        System.out.println( 10 > 8 || 1 == 10 ); // false
        System.out.println( 3 < 8 || 1 == 1 ); // true
        System.out.println( 4 > 5 || 2 <= 1 ); // false

    }
}
