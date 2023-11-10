package com.example.basics.data.string_class;
// 09.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 80 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23730380#overview
// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
public class J71_Function_toCharArray_split_toString {
    public static void main(String[] args) {

        // Przydatne funkcje klasy String: toCharArray, split, toString
        // toCharArray zwraca tablicę znaków typu char

        String str = "Test wielu łańcuchów";
        char arr[] = str.toCharArray();
        System.out.println(arr.length); // 20

        String strArr[] = str.split(" "); // rozdzielenie elementów na podstawie spacji
        System.out.println(strArr[0]); // Test
        System.out.println(strArr[1]); // wielu

        String s = str.toString(); // obiekt zwraca sam siebie :)
        System.out.println(s); // test wielu łańcuchów

        String str1 = "Ola ma kota";

        char arr1[] = str1.toCharArray();
        System.out.println("Liczba znaków: " + arr.length);

        String str1arr[] = str1.split(" ");
        System.out.println(str1arr[0]);
        System.out.println(str1arr[1]);
        System.out.println(str1arr[2]);

        String ss = str1.toString();
        System.out.println(ss);

        System.out.println(str1arr.toString());

        Integer ii = new Integer(123);
        System.out.println(ii.toString());

        String text1 = "Liczba: " + ii;
        System.out.println(text1); // Liczba: 123


    }
}
