package com.example.basics.control_block_statements;
// 02.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 60 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728648#overview

public class J51_ForEach {
    public static void main(String[] args){

        //Pętla for each w java
        //Specjalna wersja pętli for w wygodny sposób pozwala na iterację elementów.

        int numbers[] = { 1, 5, 10, 17 };

        for (int num : numbers) {
            System.out.println(num);
        }

        String strArr[] = { "Ola", "Adam", "Kasia", "Olek" };

        for(String str: strArr) {
            if(str.equalsIgnoreCase("Kasia")) continue;
            System.out.println(str);
        }

    }
}
