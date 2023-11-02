package com.example.basics.control_block_statements;
// 31.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 58 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728598#overview

public class J49_InfiniteLoop {
    public static void main(String[] args){


        // Nieskończona pętla for
        // Jest możliwość stworzenia nieskończonej pętli, ale w praktyce jest to niezalecane, gdyż zwykle
        // zawiesi to działanie programu, UI itd.


        for( ; ; ) {
            int random = (int) Math.round(20 * Math.random());
            System.out.println("random: " + random);

            //jeżeli losowa liczba ma wartość 1 lub 2
            // wychodzimy z pętli dzięki break
            if (random == 1 || random == 2) {
                System.out.println("Wyjście z pętli, random = " + random);
                break;
            }
        }

        while(true) {
            int random1 = (int)Math.round(10 * Math.random());
            System.out.println("1: " + random1);

            if (random1 == 10) {
                System.out.println("Wyjście z pętli while.");
                break; }
        }

        for( ; ; ) {
            int random2 = (int)Math.round(10 * Math.random());
            System.out.println("2: " + random2);
            if(random2 == 3 || random2 == 8) {
                System.out.println("Wyjście z pętli for");
                break; }
        }

    }
}
