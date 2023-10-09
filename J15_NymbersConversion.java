package com.example.basics.data;
//9.10.2023 - lesson arrange by Kuba Wąsikowski
// "https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23522430#overview"
public class J15_NymbersConversion {
    public static void main(String args[]){
        //konwersja jawna - zawężająca
        int i = 5;
        double d = 20.0d / (double)i;
        System.out.println(d);

        // konwersja niejawna - rozszerzająca
        int a = 4;
        double b = 10.0d * a;
        System.out.println(b);

        // konwersja niejawna - rozszerzająca
        double d2 = 5.5;
        int num = 10 * (int)d2; //przy rzutowaniu/konwersji float/double na typ całkowity część ułamkowa
                                // jest tracona bez zaokrąglenia
        System.out.println(num);//50

        // rzutowanie / casting
        byte small = (byte)200; //rzutowanie/konwersja z short na byte co powoduje utratę informacji
        System.out.println("small: " + small);


        /*
        Kowersje typów - jawne i niejawne
        Dane można zapisać w różnych typach i czasem potrzebna jest konwersja między jednym typem,
        a drugim. Przykładowo gdy trzeba podzielić liczbę rzeczywistą przez całkowitą wymagana jest konwersja liczb.

        Konwersje mogą być jawne (zawężająca) zdefiniowane przez programistę,
        albo niejawne (rozszerzająca).

        int i = 3;
        double a = 10.0d;

        //jawna (zawężająca) konwersja między typem int a double
        double b = a / (double)i;
        System.out.println(b);//3.33333333333333333

        int i2 = 3;
        double a2 = 10.0d;
        //niejawna (rozszerzająca) konwersja między typem int a double
        //typ int będzie automatycznie zmieniony z int na double
        double b2 = a2 / i2;
        System.out.println(b2);
         */
    }
}
