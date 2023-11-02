package com.example.basics.control_block_statements;
// 29.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 44 https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23538344#overview
public class J35_TernaryOperators {
    public static void main(String args[]){
        int a_test = 10;
        int b_test = a_test > 5 ? 3 : 99;
        System.out.println(b_test); // 3

        // to samo co
        if (a_test > 5) {
            b_test = 3;
        } else {
            b_test = 99;
        }

        int a = 8;
        int b = (a > 3) ? 100 : 9;
        System.out.println("b = " + b);

        if (a > 3) {
            b = 100;
        } else {
            b = 9;
        }
        System.out.println("b: " + b);
    }
}
