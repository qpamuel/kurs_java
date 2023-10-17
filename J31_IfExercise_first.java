package com.example.basics.control_block_statements;
// 17.10.2023 - lesson arrange by Kuba Wąsikowski
// lekcja 40. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32706150#overview
import java.util.Scanner;

// 17.10.2023 - lesson arrange by Kuba Wąsikowski
// lekcja 40. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32706150#overview
public class J31_IfExercise_first {
    public static void main(String args[]){
        /*
        Napisz program sprawdzający całkowitą liczbę
        i prezentujący informację czy jest ona:
        dodatnia, ujemna lub o wartośvi zero.
        Wykorzystaj bloki kodu z:
        if
        else if
        else
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Wprowadź liczbę: " );
        int liczba = scanner.nextInt();

        if ( liczba > 0) {
            System.out.println( "Zmienna jest większa od zero");
        } else if ( liczba < 0) {
            System.out.println( "Zmienna jest mniejsza od zero");
        } else {
            System.out.println( "Zmienna jest równa zero");
        }
        scanner.close();
    }
}
