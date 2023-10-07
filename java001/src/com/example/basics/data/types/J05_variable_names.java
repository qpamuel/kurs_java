package com.example.basics.data.types;

public class J05_variable_names {
    public static void main(String args[]) {
        /*
        Nazwa zmiennych musi przestrzegać kilku zasad:
        - zaczyna się od litery, znaku podreślenia lub $, kolejnymi mogą być również cyfry
        - wiekość liter ma zanczenie (case -sensityve)
        - nazwa zmiennej nie może być jednym z zarezerwowanych słów luczowych:
            abstract, assert, boolean, break, byte casecatch char, class, const, continue, default, double,
            do, else, enum, extends, falsefinal, finally, float, for goto, if, implements, import instanceof, int,
            interface, longnative, new, null, package, private, protected, public, return, short, static, strictfp,
            superswitch synchronized, this, throw
         */
        //Pamiętajmy, aby nazwa zmiennej odzwierciedlała jej znaczenie
        int studentsNumber = 34; //dobrze - to jest forma zapisu camel-case
        int xdJK78 = 23; //źle

        int _int1 = 10;
        int currentHour = 12;
        float moneyInThePocket = 23.12f; // te dwie zmienne to dwie całkiem różne zmienne
        float MoneyInThePocket = 32.12f;
        double $speed = 100.10d;
    }
}
