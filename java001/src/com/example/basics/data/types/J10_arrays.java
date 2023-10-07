package com.example.basics.data.types;

import javax.crypto.spec.PSource;

public class J10_arrays {
    public static void main(String args[]){
        /*
        Tablica to zbór elementó tego samego typu. Jest to również obiekt mający publiczne pole length
        określające ilość elementów w tablicy. Aby stworzyć tablicę trzeba wykorzystać operator new i
        określić ilość potrzebnych elementów, a tym samym potrzebnej pamięci, nazywamy to alokacją.
         */

        int arrayX[]; // Najpierw - Deklaracja tablicy o nazwie array
        arrayX = new int[8]; // Następnie - alokacja pamięci na 8 elementów typu int / 0 - 7 warości porządkowe

        System.out.println("Długość tablicy: " + arrayX.length); // Długość tablicy 8
        System.out.println("Wartość 2-go elementu: "+ arrayX[1]); //Wartość 2-go elementu: 0

        /*
        Używając operatora new tablice są inicjalizowane zerami. Elementy logiczne mają początkową wartość false,
        a obiekty przyjmują wartość null.
         */

        //przyporządkowanie miejsca = stworzenie obiektu

        long numArr[]= new long [5]; // deklaracja zmiennej i przyporządkowanie miejsca
        System.out.println("Fifth long element value: " + numArr[4]); //Fifth element value: 0

        boolean flagArr[] = new boolean[3]; //First boolean element: false
        System.out.println("First boolean element: " + flagArr[0]);

        String strArr[] = new String[7]; // Second String element: null
        System.out.println("Second String element: " + strArr[1]);

        int arrayY[] = { 3, 26, 99 }; //Deklaracja tablicy, alokacja pamięci oraz inicjalizacja
        //Ilość elementów jest automatycznie określona przez kompilator
        System.out.println("Array length: " + arrayX.length); // Array length: 3
        System.out.println("Second element: " + arrayY[1]); //Second element: 26

        // Pierwsza wartość tablicy ma numer rządaną wartość porządkową minus 1. Czyli dla 1 = 0, a dla 2 = 0.

        String strArr2[] = {"Ola", "Ania", "Marta"};
        System.out.println("First String element: " + strArr2[0]); //First String element: Ola

        int numArr1[] = new int[10];
        numArr1[1] = 7;
        System.out.println("numArr1[1]: " + numArr1[1]
                + " numArr1.length: " + numArr1.length);

        float floatsArr[] = { 10.1f, 123.78f, 78.0f, -99.9f};
        floatsArr[0] = 1.0f;
        System.out.println("floatArr[0]: " + floatsArr[0]);
        System.out.println("floatsArr[1]: " + floatsArr[1]
            + " floatsArr.lenght: " + floatsArr.length);

        String strArr3[] = new String[7];
        System.out.println("strArr3[1]: " + strArr3[1]);

        String namesArr3[] = {"Noemi & Sami", "Ola", "Grzegorz"};
        System.out.println("namesArr1: " + namesArr3[0]
                + " namesArr1: " + namesArr3.length);
    }
}
