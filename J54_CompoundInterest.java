package com.example.basics.programs;
import java.util.*;
// 02.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 63 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23728780#overview
public class J54_CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // procent składany
        // fk = k * (1 + p) ^ y

        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;
        double finalCapital;

        System.out.println("Podaj swój kapitał początkowy: ");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Podaj oprocentowanie; 5,5% zapisz jako 5.5 : ");
        yearlyInterest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Podaj liczbę lat na którą otwierzasz lokatę: ");
        numYears = in.nextInt();
        //numYears = Integer.valueOf(in.nextLine()).intValue();

        finalCapital = startCapital * Math.pow((1 + (yearlyInterest / 100d)), numYears);
        System.out.println("Kwota, którą będziesz mógł wypłacić po " + numYears + " latach to: " + Math.round(finalCapital));

    }
}
