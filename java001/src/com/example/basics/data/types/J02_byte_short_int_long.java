package com.example.basics.data.types;

public class J02_byte_short_int_long {
    public static void main (String args []){
        /* Wskazuje się w ten sposób ile miejsca dla tej zmiennej należy przypisać dla danej zmiennej. Zakres miejsca powinnien być większy niż potrzeba.
        1 bajt czyli 8 bitów, wartość z zakresu -128 do 127
        byte smallNum = 12;

        2 bajty = 16 bitów, wartość od -32768 do 32767
        short num2b = 32000;

        4 bajty = 32 bity, -2.147.483.648 do 2.147.283.647, najczęściej stosowany
        int number = -234234;

        8 bajtów = 64 bity, -9.223.372.036.854.775.808 do 9.223.372.036.854.775.807
        long bigNum = 998293L; podanie L jest wymagane aby wskazać typ literału
         */
        byte small = -127;
        short numShort = 32000;
        int number = 12345;
        long big = 1234512345L;

    }
}
