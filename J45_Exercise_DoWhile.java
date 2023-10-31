package com.example.basics.control_block_statements;

public class J45_Exercise_DoWhile {
    public static void main(String[] args) {

        /*
        Stwórz pętle Do While od 0 do 20
        i wyświetl tylko i wyłącznie nieparzyste liczby
         */

        int nieparzysta = 0;
        do {
            if (nieparzysta % 2 == 1){ //(nieparzysta % 2 != 0)
                System.out.println("liczba " + nieparzysta + " jest nieparzysta");
            };
            nieparzysta++;
        } while (nieparzysta <= 20);

    }
}
