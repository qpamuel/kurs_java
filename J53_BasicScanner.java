package com.example.basics.programs;
// 02.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 62 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728718#overview
import java.util.*;
public class J53_BasicScanner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String name = in.nextLine();

        System.out.println("Twoje imię to: " + name);

    }
}
