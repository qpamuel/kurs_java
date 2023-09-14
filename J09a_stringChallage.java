package com.example.basics.data.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J09a_stringChallage {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Podaj swoje imię oraz swoje miasto:");
        String name = reader.readLine();
        String city = reader.readLine();
        System.out.println("Twoje imię to: " + name);
        System.out.println(name + " mieszka w " + city);

        String nameCity = name + city;
        System.out.println("Number of character: " + nameCity.length());
    }
}
