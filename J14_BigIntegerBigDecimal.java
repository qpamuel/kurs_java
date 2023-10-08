package com.example.basics.data;

import java.math.BigDecimal;
import java.math.BigInteger;

public class J14_BigIntegerBigDecimal {
    public static void main(String args[]){

        BigInteger bigInt = new BigInteger("34262362356326326");
        bigInt = bigInt.add(new BigInteger("3245345324534543235"));
        System.out.println("Wynik: " + bigInt.toString());

        BigDecimal decimal = new BigDecimal("23453532235345.4567");
        decimal = decimal.pow(3);
        decimal = decimal.subtract( new BigDecimal("53456734574357457345773452345325.3456"));

        System.out.println("Wynik 2: " + decimal);

        /*
        Wielkie liczby - klasy BigInteger, BigDecimal
        Jeśli zakres liczb long i double nie wystarczy można zastosować specjalne klasy zapewniające
        przechowywanie oraz operacje na bardzo dużych liczbach. To klasy, nie są to typy!

        //Można utworzyć obiekt za pomcą funkcju valueOf, ale tylko do wartości long
        BigInteger num = BigInteger.valueOf(98760987609876L);
        //również można wykorzystć konstruktor jak poniżej przekazując String z dowolną liczbą całkowitą
        BigInteger bigInt = new BigInteger("93847270364827342364723476364");

        //operacje na dużych liczbabh wymagają skorzystania z funkcji: add, subreact, divide, muliply, sqrt itd
        bigInt = bigInt.add( new BigInteger("222222222222222222222222222222"));
        System.out.println(bigInt.toString());

        BigDecimal decimal = new BigDecimal("123456745623464747245672346");
        decimal = decimal.multiply( new BigDecimal("123543.1252135213"));
        decimal = decimal.subtract( new BigDecimal("2364574562456326.2456"));
        decimal = decimal.add( new BigDecimal("236235463246346324.45345"));
        decimal = decimal.divide(new BigDecimal("25"));
        decimal = decimal.abs();
        System.out.println("Wynik: " + decimal);

                System.out.println("Wynik: " + bigInt.toString()); - plus to operator konkatenacji
         */



    }
}
