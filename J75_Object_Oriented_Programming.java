package com.example.oop.basics;
// 13.11.2023 - lesson arrange by Kuba Wąsikowski
//lekcja 84 - https://www.udemy.com/course/kurs-java-od-podstaw-od-zera-do-mastera-zbuduj-wlasne-aplikacje/learn/lecture/23730534#overview

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    public void printInfo() {
        System.out.println(this.manufacturer + " "
                        + this.name + " "
                        + this.year + " "
                        + this.color + " "
                        + this.topSpeed);
    }
}

public class J75_CarExample {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;
        ford.printInfo();

        Car chevrolet = new Car();
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "red";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.0f;
        chevrolet.printInfo();


        /*
        Java to obiektowy język programowania - Klasy
        Podstwowymi terminami, którymi operują programiści Javy to: klasa, obiekt oraz metoda.
        Klasa to fundament Javy, jest to szablon opisujący stan oraz zachowania danego obiektu.
        Klasy są jak foremki do robienia ciastek, natomiast ciastkami są obiekty.
        Poniższa klasa Car opisuje samochód oraz jego właściwości jak producent, nazwę i prędkość maksymalną.
         */

        // deklaracja klasy CarTest
        class CarTest {
            String manufacturer;
            String name;
            String color;
            float topSpeed;

            // Java to obiektowy język programowania - Metody
            // Metoda to grupa instrukcji, które mogą być łatwo wywołane w razie potrzeby.
            // metoda zwracająca topSpeed
            public float getTopSpeed() {
                return this.topSpeed;
            }
            public void printInfo() {
                System.out.println(
                        this.manufacturer + " " + this.name
                );
            }
        }

        // Na podstawie klasy Car można utworzyć obiekty z danymi
        // obiekt mustang na podstawie klasy Car, słowo kluczowe
        // new tworzy nową instancję obiektu klasy Car
        // Słowo kluczowe new tworzy nową instancję obiektu
        CarTest mustang = new CarTest(); // obiekt mustang
        mustang.manufacturer = "Ford"; // unikalne dane obiektu
        mustang.topSpeed = 290.0f;
        mustang.name = "Mustang";
        mustang.printInfo(); // Ford Mustang
        System.out.println( mustang.getTopSpeed() ); // 290.0f

        //Java to obiektowy język programowania - Obiekty
        // Obiekty tworzy się na podstawie klas, mają zmienne oraz metod zdefiniowane w klasie,
        // natomiast między sobą obiekty mogę różnić się danymi jakie posiadają: producent, prędkość itd.
        // obiekt Camaro na podstawie klasy Car
        CarTest camaro = new CarTest();
        camaro.manufacturer = "Chevrolet";
        camaro.topSpeed = 300.0f;
        mustang.printInfo();
        System.out.println( camaro.getTopSpeed() ); // 300.0


        // Przykład z pracownikiem
        class Employee {
            String name;
            String surname;
            String jobTitle;

            public void printInfo() {
                System.out.println(
                        this.name + " "
                                + this.surname + " "
                                + this.jobTitle
                );
            }
        }

        Employee employee1 = new Employee();
        employee1.name = "Adam";
        employee1.surname = "Kowalski";
        employee1.jobTitle = "programmer";
        employee1.printInfo();

        Employee employee2 = new Employee();
        employee2.name = "Kasia";
        employee2.surname = "Zawadzka";
        employee2.jobTitle = "żona Adama";
        employee2.printInfo();
    }
}
