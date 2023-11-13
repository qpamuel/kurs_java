package com.example;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
// 11.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 83 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/24518128#overview
public class J74_ChuckExample {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStream is = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(is)
            );

            String line = null;
            while ( (line = bufferedReader.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
