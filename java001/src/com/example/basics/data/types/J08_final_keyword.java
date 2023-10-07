package com.example.basics.data.types;
/*
Zmienne mogą mieć przypisaną inną wartość, ale stałe już nie.
Jest to przydatne jeśli chce mieć pewność, że dana zmienna nie ulegnie zmianie.
 */
public class J08_final_keyword {
    public static void main(String args[]){
        int num = 10;
        num = 32; // przypisanie nowej wartości do zmiennej num

        final int num2 = 100;
        //num2 = 200; - kompilator wyrzuci błąd
    }
}
