package com.example.basics.control_block_statements;
// 26.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 47 https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/32717194#overview

public class J38_Exercise_SwitchInstruction {
    public static void main(String args[]){
        /*
        Wykorzystaj switch do określenia ory roku na bazie numeru
        miesiąca w zmiennej monthNum (od 1 do 12).
        Zaprezentuj w konsoli informacje o porze roku.
        Pory roku dla liczb:
        3, 4, 5 - wiosna
        6, 7, 8 - lato
        9, 10, 11 - jesień
        12, 1, 2 - zima
         */

        int monthNum = 5;
        String season = "";
        switch (monthNum) {
            case 3:
            case 4:
            case 5:
                season = "wiosna";
                break;
            case 6:
            case 7:
            case 8:
                season = "lato";
                break;
            case 9:
            case 10:
            case 11:
                season = "jesień";
                break;
            case 12:
            case 1:
            case 2:
                season = "zima";
                break;
            default:
                System.out.println("zakres miesiący wacha się od 1 - 12; podana wartość nie spełnia kryterium");
        }
        System.out.println("Wspomniana w Int pora roku to: " + season);
    }
}
