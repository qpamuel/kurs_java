package com.example.basics.control_block_statements;
// 30.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 50- https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728456#overview

public class J41_WhiteLoop {
    public static void main(String[] args) {

        double i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        i = 0;
        while (i < 6) {
            System.out.println("i: " + i);
            i++;
        }



    }
}
