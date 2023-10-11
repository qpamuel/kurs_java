package com.example.basics.operators;
//11.10.2023 - lesson arrange by Kuba Wąsikowski
// "https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23485252#overview"
public class J18_Operators1_basics {
    public static void main(String args[]){

        int z = 10;
        int x, t;

        x = t = z + 5;
        System.out.println("x:" + x + " t:" + t);

        int v = (100 * 2) / 5 + 20;
        System.out.println("v:" + v);

        System.out.println("modulo 20 % 7: " + (20 % 7));


        // Operatory pozwalają na wykonanie różnych operacji na danych np obliczeń matematycznych.

        //Operator przypisania pozwala na przypisanie wartości do zmiennej czy stałej.
        int num = 10; // 10

        //Operator przypisania jako jedyny z operatorów dwuargumentowych ma wiązanie prawostronne.
        //Poniższe wyrażenie jest obliczane od prawej do lewej.
        int value = num + 90; // 100
        int a, b;

        // priorytet + jest wyższy od =, pierwsze będzie obliczone wyrażenie num + value
        // wynik będzie podstwiony do zmiennej a oraz b
        a = b = num + value; // a, b = 110
        System.out.println( "a:" + a + " b:" + b ); //a:110 b:110

        // Operatory arytmetyczne służą do operacji na liczbach.

        int i1 = 3 + 5; // wynik dodawania: 8
        int i2 = 9 - i1; // wynik odejmowania: 1
        int i3 = 2 * 2; // wynik mnożenia: 4
        int i4 = 10 / 4; // wynik dzielenia całkowitoliczbowego to 2
        float f1 = 10 / 2.5f; //wynik dzielenia: 4.0
        int rest = 12 % 8; // modulo, reszta z dzielenia: 4

        // Kolejność wykonywania działań jest taka sama jak w matematyce.
        int exampleOfValue = 10 - 2 * 2; // wynik 6

    }
}
