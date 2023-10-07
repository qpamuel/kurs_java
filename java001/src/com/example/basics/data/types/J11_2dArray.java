package com.example.basics.data.types;

public class J11_2dArray {
    public static void main(String args[]){
        /*
        Tablice wielowymiarowe
        Tablice są zwykle obiekatmi jednowymiarowymi, ale można stworzyć tablicę wielowymiarową zagnieżdżając tablice.
         */
        int multiArr[][]; //deklaracja dwuwymiarowej tablicy
        multiArr = new int[2][3]; //tablica dwóch wierszy po 3 elementy

        System.out.println("Drugi wiersz, trzeci element: " + multiArr[1][2]); //0

        String multiStrArr[][] = { {"one", "two", "tree"}, {"four", "five", "six"}, {"7", "8", "9"}, {"10", "11", "12"} };
        System.out.println(" multiStrArr[0][1]: " + multiStrArr[0][1]); //two

        String strArr[][] = { //[3][4] - tablica dwóch wierszy i trzech kolumn
          //                kolumny  1    2    3
          //                indeksy  0    1    2
          /* wiersz 1, index 0 */  {"1", "2", "3"},
          /* wiersz 2, index 1 */  {"4", "5", "6"}
        };
        System.out.println(strArr[0][1]); // "4"
        System.out.println(strArr[0][2]); // "3"

        int numArr[][] = new int [3][4];
        numArr[1][2] = 100;

        int numRows = 10;
        int numCols = 15;
        int arr[][] = new int[numRows][numCols];

    }
}
