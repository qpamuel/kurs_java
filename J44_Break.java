package com.example.basics.control_block_statements;
// 31.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 53 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728530#overview

public class J44_Break {
    public static void main(String[] args) {

        // Break - wyjście z pętli
        //W przypadku, gdy potrzbne jest przerwanie działania pętli można zastosować instrukcje break,
        // która przerwie działanie pętli.

        for (int a = 0; a < 100; a++) {
            System.out.println(a);
            //wyjście z pętli
            if (a == 5) break;
        }
        System.out.println("Kod po pętli.");

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            if (i > 3) break;
        }
        System.out.println("Dalsza część programu.");

        int a = 10;
        while (a > 0) {
            System.out.println(a);
            a--;
            if (a == 2) break;
        }
        System.out.println("Pętla while zakończona.");
    }
}
