package com.example.basics.control_block_statements;
import java.util.Scanner;

// 17.10.2023 - lesson arrange by Kuba Wąsikowski
// lekcja 42. https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32706162#overview
public class J33_IfExercise_third {
    public static void main(String args[]){
        /*
        Wykorzystaj instrukcje if, else if itd
        wraz z operatorami logicznymi czyli AND i OR
        do sprawdzenia pogody i decyzji czy warto pójść na spacer
        Potrzebujesz następujących zmienncy typu boolean: raining, haveUmbrella
        Dodatkowo zapisz temperaturę jako int w zmiennej: temperature

        Wymagania:
        1. Gdy temperatura jest powyżej 40 lub poniżej -20 to komunikat o pozostaniu w domu
        2. Jeśli temperatura między -10 a 10, pada i ma parasolkę to może wyjść (w jednym if)
        3. Jeśli nie pada i powyżej 12 stopni może wyjść
        4. W innych wypadkach zostaje w domu
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj informacje jaka jest temperatura:");
        int temp = Integer.parseInt(scanner.nextLine());

        if (temp <= -20 || temp >= 40) {
            System.out.println("Lepiej pozostań w domu - skrajna temperatura!");
        } else {
            System.out.println("Jeśli pada podaj wartość: 1; jeśli nie pada: 0.");
            int rain = Integer.parseInt(scanner.nextLine());
            boolean raining = (rain == 1);

            if (raining) {
                System.out.println("Jeśli masz parasolkę podaj wartość: 1; jeśli nie masz parasolki: 0.");
                int umbrella = Integer.parseInt(scanner.nextLine());
                boolean haveUmbrella = (umbrella == 1);

                if ((temp >= -10 && temp <= 10 && haveUmbrella)) {
                    System.out.println("Jesteś przygotowany na deszcz - idź na spacer.");
                } else {
                    System.out.println("Nie jesteś przygotowany na deszcz - pozostań w domu.");
                }
            } else if (temp >= 12) {
                System.out.println("Pogoda jest cudowna - biegnij na spacer");
            } else {
                System.out.println("Pogoda jest ładna, ale temperatura nie jest wystarczająco wysoka, aby wyjść na spacer.");
            }
        }

        scanner.close();
    }
}