package com.example.basics.control_block_statements;
// 01.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 59 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32717264#overview

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J50_Exercise_InfiniteLoop {
    public static void main(String[] args) throws IOException {

        /*
        W programie zapisz liczbę całkowitą z nazwą number
        o początkowej wartości 0.
        Dodaj BufferReader do odczytu danych od użytkownika.
        Pamiętaj o potencjalnym wyjątku, który musi być obsłużony.
        Stwórz dowolną nieskończoną pętlę.
        W każdej iteracji poproś użytkownika z konsoli za pomocą BufforedReader.
        Jeśli wpisane będzie quit zakończ działanie pętli.
        Aby porównać łańcuchy znaków wykorzystaj metodę equalsIgnoredCase(), która jest w string
        do zmiennej number. Zaprezentuj aktualną wartość number
        na koniec każdej iteracji.
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;

        for ( ; ; ) {
            System.out.println("Wpisz liczbę lub quit jeśli chcesz zakończyć program");
            String data = reader.readLine();
            if (data.equalsIgnoreCase("quit")) break;

            int num = Integer.parseInt(data);
            number += num;

            System.out.println("Wartość number: " + number);
        }


    }
}
