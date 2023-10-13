package com.example.basics.operators;
//12.10.2023 - lesson arrange by Kuba Wąsikowski
// 33. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23522302#overview
public class J23_Op4_logicalOperatorAnd {
    public static void main(String args[]){

        //Operatory logiczne
        // Często używa się operatorów logicznych ja koniunkcja && ("i") oraz alternatywa || ("lub")

        // Koniunkcja daje wynik true jeśli warunki po obu stronach zwróca true.

        // true && true - zwróci true
        // true && false - zwróci false
        // false && true - zwróci false
        // false && false - zwróci false

        System.out.println( 10 > 4 && 12 == 12 ); // true, obie strony daje wynik true
        System.out.println( 10 > 4 && 3 > 12 ); // false, bo lewa strona true, a prawa false
        System.out.println( 4 < 1 && 6 != 6 ); // false, bo obie strony dają false

        // Koniunkcja - operator logiczny, inaczej and

        System.out.println( 5 < 10 && 20 > 15 ); // true && true wynik true
        System.out.println( 5 > 10 && 20 > 15 ); // false && true wynik false
        System.out.println( 4 > 2 && 10 == 11 ); // true && false wynik false
        System.out.println( 4 == 2 && 12 > 20 ); // false && false wynik false



    }
}
