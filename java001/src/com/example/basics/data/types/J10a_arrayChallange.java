//2023.09.25 lesson guided by
package com.example.basics.data.types;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J10a_arrayChallange {
    public static void main(String[] args) throws IOException {

        /*
            1.  Pobierz numer indeksu w tablicy od użytkownika
                za pomocą BufferedReader

                BufferedReader reader = new BufferedReader (
                new InputStreamReader(System.in));
                do odczytu wartości int użyj read()

            2.  Zapytaj użytkownika o indeks wskazując jego maksumalną wartość
                w tablicy. Odczytaj Tą  wartość liczbową dzięki metodzie readLine()

            3.  Skonwertuj otrzymany String na liczbę za pomocą Integer.parseInt( str )

            4.  Użyj indeksu do zaprezentowania użytkownikowi elementu z tablicy.
        */
        /*
        System.out.println("Podaj wartość indes w przedziale od 0 do " + (names.length - 1));
        String strNam = reader.readLine();

        int index = Integer.parseInt(strNam);
        System.out.println("Pod numerem " + index + " kryje się imię: " + names[index]);
        */

       String names[] = { "Ania", "Ola", "Daniel", "Karol", "Kasia"};

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Podaj wartość indes w przedziale od 1 do " + names.length);
        String strNam = reader.readLine();

        int index = (Integer.parseInt(strNam) - 1);
        System.out.println("Na pozycji " + (index + 1) + " w tabeli kryje się imię: " + names[index]);

    }
}
