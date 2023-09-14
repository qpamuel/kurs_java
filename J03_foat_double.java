package com.example.basics.data.types;

public class J03_foat_double {
    public static void main(String args []){
        /*
        4 bajty czyli 32 bity, max około 6-7 cyfr po przecinku
        f wymagane, gdyż domyślnym typem literału zmiennoprzecinkowego jest double

        8 bajtów = 64 bity, max około 15 cyfr po przecinku
        d można dodać do literału podkreślając typ zmiennej, która i tak jest domyślna dla zmiennej po przecinku
        dla lepszej precyzji obliczeń stosuje się double
         */
        float number = 10.5f;
        double bigNumber = 23.12341234;
        System.out.println("number: " + number);
        System.out.println("big number: " + bigNumber);
    }
}
