package com.example.basics.data.types;

public class J01_variable_declaration {
    public static void main (String args[]){

        /*
        Zmienna to pewne miejsce w pamięci komputera, które przechowuje jakąś wartość np. liczbę,
        tekst itd, W pamięci jestwiele różnych zmiennych, więc aby dostać się do konkretnej zmiennej
        używa się nazw zmiennych, wskazują na wartość zmiennej w pamięci.

        Wartość zmiennej może być zmieniona w czasie dizałania programu.
         */

        int number = 24;
        number = 98;
        System.out.println("Wartość zmiennej number: " + number);
        int data = -123;
        System.out.println("data: " + data);

        number = data * 2;
        System.out.println("number: " + number);
    }
}
