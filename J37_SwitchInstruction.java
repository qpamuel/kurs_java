package com.example.basics.control_block_statements;
// 29.10.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 46 https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23727654#overview

enum ShirtSize {S, M, L, XL}
enum CarVariant {SEDAN, COMBI, SPORT}
public class J37_SwitchInstruction {
    public static void main(String args[]){

        //Instrukcja switch
        //Zamiast stosowania wielu instrukcji if else często lepiej jest skorzystać z switch case sprawdzjąc
        //byte, int, long, char czy nawet String (od Java 7)

        int num_test = 7;
        switch (num_test) {
            case 3:
                System.out.println(3);
                break;
            case 7:
                System.out.println(7);
                break;
            case 9:
                System.out.println(9);
                break;
            default:
                System.out.println("default code");
        }
        // to samo co poniższy kod:
        if (num_test == 1) {
            System.out.println(1);
        } else if (num_test == 7){
            System.out.println(7);
        } else if (num_test == 9) {
            System.out.println(9);
        } else {
            System.out.println("default code");
        }

        // Instrukcja switch z String
        // Wygodnie można porównaywać zmienne typu String dzięki switch case.
        String str_test = "Ania";
        switch (str_test) {
            case "Ola":
                System.out.println("Ola");
                break;
            case "Kasia":
                System.out.println("Kasia");
                break;
            case "Ania":
                System.out.println("Ania");
                break;
            default:
                System.out.println("domyślny kod");
        }
        // porównując String trzeba użyć funkcji
        // equals, gdyż == porównuje tylko
        // referencje
        /*
W Javie "referencje" to sposób, w jaki program odnosi się do obiektów w pamięci.
Kiedy tworzysz obiekt i przypisujesz go do zmiennej,
to właściwie przypisujesz referencję do tego obiektu, a nie sam obiekt.
Referencja ta wskazuje na miejsce w pamięci, gdzie obiekt jest przechowywany.

Przykład z obiektami typu String w Javie:

java
Copy code
String a = "hello";
String b = "hello";
String c = new String("hello");
W tym przykładzie a i b wskazują na ten sam obiekt w pamięci, ponieważ JVM optymalizuje przechowywanie
literałów łańcuchowych. Jednak c jest nowym obiektem, nawet jeśli przechowuje tę samą wartość "hello".
W związku z tym, gdybyśmy porównali te zmienne za pomocą ==, wyniki byłyby następujące:

a == b zwróciłoby true, ponieważ obie wskazują na ten sam obiekt.
a == c (lub b == c) zwróciłoby false, ponieważ są to różne obiekty.
Aby porównać wartości przechowywane przez obiekty typu String, należy użyć metody equals(),
która porównuje zawartość łańcuchów, a nie ich referencje. W tym przypadku a.equals(c) zwróciłoby true.

W kontekście Twojego kodu, komentarz mówi o tym, że przy porównywaniu łańcuchów za pomocą instrukcji switch,
Java porównuje ich zawartość, a nie referencje, więc działa to tak, jakbyś używał metody equals().
         */
        if (str_test.equals("Ola")) {
            System.out.println("Ola");
        } else if (str_test.equals("Kasia")){
            System.out.println("Kasia");
        } else if (str_test.equals("Ania")) {
            System.out.println("Ania");
        } else {
            System.out.println("domyślny kod");
        }

        // Instrukcja switch z enum
        // u szczytu kodu: enum ShirtSize {S, M, L, XL}
        ShirtSize day = ShirtSize.L;

        switch (day) {
            case S:
                System.out.println("Size S");
                break;
            case L:
                System.out.println("Size L");
                break;
            default:
                System.out.println("Default Size");
        }
        int num = 10;

        switch (num) {
            case 1:
                System.out.println(1);
                System.out.println("dodatkowe coś");
                break;
            case 3:
                System.out.println(3);
                break;
            case 10:
                System.out.println(10);
                break;
            case 11:
                System.out.println(11);
                break;
            default:
                System.out.println("Default " + num);
        }

        String str = "Ania2";

        switch (str) {
            case "Ola":
                System.out.println("Ola");
                break;
            case "Ania":
                System.out.println("Ania");
                break;
            default:
                System.out.println("Default: " + str);
        }

        CarVariant car = CarVariant.COMBI;

        switch (car) {
            case COMBI:
                System.out.println(CarVariant.COMBI);
                break;
            case SEDAN:
                System.out.println(CarVariant.SEDAN);
                break;
            default:
                System.out.println("Default: " + car);
        }
    }
}
