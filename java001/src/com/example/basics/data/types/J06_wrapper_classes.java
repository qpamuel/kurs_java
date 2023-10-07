package com.example.basics.data.types;

public class J06_wrapper_classes {
    public static void main(String args[]){
        /*
        w JAVA typy proste mają swoje odpowiedniki w formie typów klas czyli bardziej złożonej które również mogą posiadać swoją wartość..
        na przykład Interger może posiadać wartość Int będzie posiadał szereg różnych funkcji.

        javadoc Integer https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html

        Integer objI = Integer.valueOf(98);
        objI.toString(); //zmiana na String/tekst

        Integer otherI = new Integer(32); //nie powinnno się używać już tego sposobu, deprecated

        Integer result = objI + otherI;
        System.out.println("Result: " + result); //130

         */

        int a = 123;
        Integer number = Integer.valueOf(a);

        System.out.println( number.toString() );
        System.out.println(number.floatValue() );
        System.out.println( number.toHexString(a) );
    }
}
