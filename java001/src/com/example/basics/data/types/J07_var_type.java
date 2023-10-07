package com.example.basics.data.types;

/*
Od Javy 10 nie musimy podawać typu dla lokalnych zmiennych np w funkcji
Kompilator automatycznie sam odreśli sobie ty[ takiej zmiennej.

public int add(int num1, int num2){
//typ zmiennej lokalnej result rozpozna kompilator, bedzie int
var result = num1 + num2;
return result;
}
 */

public class J07_var_type {
    public static void main(String args[]){
        int number = add (10, "5");
        System.out.println(number);
    }
    public static int add(int a, String b){
        var result = a + Integer.valueOf(b).intValue();
        return result;
    }
}
