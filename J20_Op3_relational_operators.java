package com.example.basics.operators;
//13.10.2023 - lesson arrange by Kuba Wąsikowski
// "https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23485430#overview"
public class J20_Op3_relational_operators {
    public static void main(String args[]){

        //Operatory porównania
        //Do poruównania dwóch wartości można użyć poniższych operatorów:

        System.out.println( 4 == 3 ); // operator równości, wynik false, wartości nie są równe
        System.out.println( 8 == 8 ); // wynik true, bo obie wartości są równe

        System.out.println( 4 != 3 ); // operator różny, wynik true bo obie wartości są różne
        System.out.println( 8 != 8 ); // false, bo obie wartości są równe, a nie różne

        System.out.println( 10 >= 9 ); // operator większy równy, true bo większe
        System.out.println( 10 >= 10 ); // operator większy równy, true bo równe
        System.out.println( 7 >= 12 ); // false, bo 7 nie jest większe lub równe 12

        // Do porównania dwóch wartości można użyć poniższych operatorów:
        // operator mniejszy równy
        System.out.println( 10 <= 9 ); // false bo 10 nie jest mniejsze od 9
        System.out.println( 6 <= 6 ); // true, bo 6 równe 6
        System.out.println( 3 <= 8 ); // true, bo 3 mniejsze od 8

        System.out.println( 11 > 3 ); // true, bo 10 większe od 9
        System.out.println( 2 > 6 ); // false, bo 2 nie jest większe od 6
        System.out.println( 3 < 8 ); // true, bo 8 większe od 3

        boolean b1 = 5 == 3; // false
        System.out.println(b1);
        boolean b2 = 7 == 7; // true

        boolean b3 = 7 != 7; // false
        boolean b4 = 7 != 5; // true

        boolean b5 = 10 > 4; // true
        boolean b6 = 10 < 8; // false

        boolean b7 = 8 >= 6; // true
        boolean b8 = 8 >= 8; // true
        boolean b9 = 8 > 8; // false

        boolean b10 = 10 <= 12 ; // true
        boolean b11 = 10 <= 10; // true

    }
}
