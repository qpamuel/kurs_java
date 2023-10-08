package com.example.basics.data;
import java.lang.*;

public class J13_MathExample {
    public static void main(String args[]){
         double d = 16.0d;
         double sqrt = Math.sqrt(d);
        System.out.println(sqrt);

        double power = Math.pow(d, 2);
        System.out.println(power);

        double Samuel = Math.random();
        double samuel = Samuel*(-100);
        double samue = Math.abs(samuel);
        System.out.println("random: " + samue);
    }
}
/*
Klasa Math - funkcje matematyczne
Operując na danych często korzysta się funkcji matematycznych np do obliczenia pierwiastka z liczby, potęgi etc.
Do tego najczęściej wykorzystuje się klasę math.

double num = 4.0d;
double sqrt = Math.sqrt(num);
//funkcje w Math są statyczne, więc nie trzeba tworzyć obiektu do ich wywołania
System.out.printnl(num + " do 3 potęgi: " + power); //64.0

double value = Math.abs(-10); //wartość bezwględna: 10
double random = Math.random(); / liczba losowa >= 0 < 1 np. 0.9277543542451833
 */