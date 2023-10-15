package com.example.basics.operators;
//13.10.2023 - lesson arrange by Kuba Wąsikowski
// 37. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23522324#overview
public class J28_Op7_compoundAssignmentOperators {
    public static void main(String args[]){

        //Operatory złożone, dwuargumentowe wykonują działanie i przypisują do zmiennej nową wartość
        // np: +=, -=, *=, %=, /=
        // złożone operatory przypisania
        // += -= *= /= %=

        int a = 5;
        a =+ 10; // to samo ja a = a + 10
        System.out.println(a); // 15

        int b = 2;
        b *= 3; // to samo co b = b * 3
        System.out.println(b); // 6

        int c = 20;
        c %= 3; // to samo co c = c % 3
        System.out.println(c); // 2
    }
}
