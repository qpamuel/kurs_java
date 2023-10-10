package com.example.basics.data;
import java.lang.*;

//10.10.2023 - lesson arrange by Kuba Wąsikowski
// "https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32694378#overview"
public class J16_bmiChallange {
    public static void main(String args[]) {

    /*
    BMI:
    18,5 _< BMI _< 24,9
    wzór:
    bmi = masa / (wzrost * wzrost)
    Wzrost w metrach np. 1.8

    Math.pow(a, b) pamiętaj że zwraca double, potrzebna konwersja
    a do potęgi b
    Zaprezentuj w konsoli wynuik bmi

    na koniec skonwertuj wynik na liczbę całkowitą
     */

        double weight = 70.1;
        float height = 1.78f;

        double bmi = weight / Math.pow((double)height, 2);
        //float bmi = (float) (weight / Math.pow(height, 2));
        System.out.println("Wynik BMI: " + bmi);

        int bmiConverted = (int)bmi;
        System.out.println("Wynik bmi: " + bmiConverted);
    }

}
