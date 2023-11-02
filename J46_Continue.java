package com.example.basics.control_block_statements;
// 31.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 55 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728558#overview

public class J46_Continue {
    public static void main(String[] args) {

        // countinue - wyjście z pętli
        // Jeśli potrzebne jest przerwanie aktualnej iteracji pętli, ale nie całej pętli -
        // stosuje się instruckje continue

        for(int a = 0; a <= 5; a++) {

            if(a == 3) {
                // przerwanie aktualnej iteracji pętli - 3 nie będzie wyświetlone
                continue;
            }
            System.out.println(a);
        }

        for(int b = 0; b < 10; b++) {
            if(b == 2 || b == 5 || b == 9) continue;
            System.out.println("Wartość b: " + b);
        }

    }
}
