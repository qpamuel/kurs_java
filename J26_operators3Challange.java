package com.example.basics.operators;
//13.10.2023 - lesson arrange by Kuba Wąsikowski
// 36. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32706106#overview
public class J26_operators3Challange {
    public static void main(String args[]){

        // zanotuj na kartce wyniki wykorzystania poniższych operatorów logicznych: OR - alternatywa
        System.out.println( "#1 " + ( true || true )); // #1 - true
        System.out.println( "#2 " + ( true || false )); // #2 - true
        System.out.println( "#3 " + ( false || false )); // #3 - false
        System.out.println( "#4 " + (2 > 5 || 24 != 12) ); // #4 - true
        System.out.println( "#5 " + (47 >= 1 || 8 <= 6 )); // #5 - true
        System.out.println( "#6 " + (1 != 1 || 5 != 5 )); // #6 - false

    }
}
