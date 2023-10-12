package com.example.basics.operators;
//12.10.2023 - lesson arrange by Kuba Wąsikowski
// "https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23485266#overview"
public class J19_Op2_incrementation_decrementation {
    public static void main(String args[]){

        //Inkrementacja i dekrementacja
        // Przyrostkowa, po argumencie zmiennej.
        //Zwiększa wartość o jeden po wykorzystaniu zmiennej w wyrażeniu.

        int num_test = 3;
        int value_test = 4 + num_test++; // 7, inkrementacja po dodaniu num_test do 4 i przypisaniu value_test
        System.out.println("value_test: " + value_test); // value_test: 7
        System.out.println("num_test: " + num_test); // num_test: 4

        //Przedrostkowa modyfikuje wartość przed jej wykorzystaniem.
        int num_test2 = 3;
        int value_test2 = 4 + ++num_test2; // 8 inkrementacja num_test i dopiero dodanie do 4 i przypisaniu do value
        System.out.println("value_test2: " + value_test2); //value_test2: 8
        System.out.println("num_test2: " + num_test2); //num_test2: 4

        //Aby przed i przyrostek w in lub dekrementacji miały znaczenie muszą występować w kontakście jakiegoś wyrażenia.
        int a = 10;
        a++;
        System.out.println("a++: " + a);

        // format int c używam tylko raz - potem zapisuje już tylko c.
        int b = 5;
        int c = 10 + b++; //inkrementacja przyrostkowa
        System.out.println("c: " + c); //15
        System.out.println("b:" + b); //6
        c = 10 + b++;
        System.out.println("b1: " + b);
        c = 10 + b++;
        System.out.println("b2: " + b);
        c = 10 + b++;
        System.out.println("b3: " + b);
        c = 10 + b++;
        System.out.println("b4: " + b);

        int d = 5;
        int e = 10 + ++d; //inkrementacja przedrostkowa
        System.out.println("e: " + e); //16
        System.out.println("d: " + d); //6
    }
}
