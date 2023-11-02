package com.example.basics.control_block_statements;
// 30.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 51 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728492#overview

public class J42_DoWhileLoop {
    public static void main(String[] args){
        //Pętle do while
        //Umożliwia wykonanie instrukcji tak długo jak warunek jest spełniony.
        //Różni się od pętli while tym, że najpierw jest wykonywany blok kodu i dopiero po tym sprawdzany jest
        //warunek czy wykonać kolejną iterację

        int a = 10;
        do {
            System.out.println("a: " + a);
            //zwiększenie a o jeden
            a++;
            //sprawdzenie warunku czy wykonać kolejną iterację
            //jeśli a jest mniejsze od 20
        } while (a < 20);

        int b = 2;
        do {
            System.out.println("b: " + b * 2 );
            b++;
        } while ( b < 10 );

        do {
            System.out.println("b2: " + b);
            b--;
        } while ( b > 0 );
    }
}
