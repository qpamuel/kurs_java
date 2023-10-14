package com.example.basics.operators;
//13.10.2023 - lesson arrange by Kuba Wąsikowski
// 34. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32706096#overview
public class J24_operators2Challange {
    public static void main(String args []){

        // zanotuj na kartce  wyniki wykorzystania poniższych operatorów logicznych: AND - koniunkcja
        System.out.println( "#1 " + ( true && true )); //#1 - true
        System.out.println( "#2 " + ( true && false )); //#2 - false
        System.out.println( "#3 " + ( false && false )); //#3 - false
        System.out.println( "#4 " + ( 3 > 1 && 24 != 12 )); // #4 - true
        System.out.println( "#5 " + ( 9 < 8 && 8 <= 9 )); // #5 - false
        System.out.println( "#6 " + ( 10 != 10 && 100 != 100 )); // #6 - false

    }
}
