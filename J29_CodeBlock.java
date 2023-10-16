package com.example.basics.control_block_statements;
// 16.10.2023 - lesson arrange by Kuba Wąsikowski
// lekcja 38: https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23519274#overview
public class J29_CodeBlock {
    public static void main(String args[]){

        // Blok kodu
        // Grupa instrucji ograniczona nawiasami klamrowymi często używana w instrukcjach warunkowych czy pętlach.

        // 1. Poniższy blok kodu w nawiaskach klamrowych wykona się i informacja pojawi się w konsoli.
        {
            int a_test = 10;
            // blok kodu, który zawsze będzie wykonany
            System.out.println("Blok sie wykona");
        }

        // 2. Zmienne zadeklarowane w bloku nie będą dostępne poza tym blokiem.
        {
            int a_test2 = 10;
            // blok kodu, który zawsze będzie wykonany
            System.out.println("Blok sie wykona");
        }
        // System.out.println(a_test2); // wywoła błąd kompilatora ponieważ zmienna a nie jest dostępna poza blokiem.

        // 3. Blok kodu nie pozwala na deklarację zmiennej o tej samej nazwie z poziomu wyżej
        // Nie można zadeklarować nowej zmiennej  o tej samej nazwie w bloku co poza nim - przed nim.

        int num_test;
        {
            // zmienna o tej samej nazwie już istnieje poza blokiem
            // wywoła to błąd: java: variable num is already defined
            // in method main(java.lang.String[])
            // int num_test = 10;
        }

        // 4. Zagnieżdzone bloki kodu
        // Bloki kodu mogą być zawarte w innych blokach, co jest przydatne przy korzystaniu z instrukcji
        // strujących. Blok ma dostęp do zmiennych zdefiniowanych poza nim.

        int num_test2 = 99;
        {
            int test_test = 10;
            {
                // zagnieżdżony blok wewnątrz innego bloku
                // blok ma dostęp do własnych zmiennych oraz tych poza blokiem
                System.out.println(test_test); // 10
                System.out.println(num_test2); // 99
            }
        }

        // 5. Zagnieżdzone bloki kodu a zmienne
        // Poniższy blok nie ma dostępu do zmiennej num o wartości 10, bo jest zadeklarowana za blokiem.
        // Dzięki temu nie ma błędu, konfliktu takich samych nazw.
        {
            int num_test3 = 99;
        }
        // zmienna zdefiniowana za blokiem, może mieć taką samą nazwę jak
        // w bloku, bo i tak jest wczesniej i nie ma do niej dostępu
        int num_test3 = 10;
        System.out.println(num_test3); // 10

        int b = 12;
        int num = 100;
        {
            // long num = 1000; // powoduje błąd: variable num is already defined in method main(java.lang.String[])
            long num2 = 1000; // nie powoduje błędu
            int a = 5;
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            // System.out.println("c: " + c); powoduje błąd: brak zmiennej o takiej nazwie
        }
        int c = 7;
        int a = 99; // nie ma konfliktu nazw z zmienną w bloku

        {
            int value = 9;
            {
                int test = 8;
                {
                    System.out.println("value: " + value); // 9
                    System.out.println("test: " + test); // 8
                    System.out.println("a: " + a); // 99
                }
            }
        }

    }
}
