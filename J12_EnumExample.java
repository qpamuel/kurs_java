package com.example.basics.data;

public class J12_EnumExample {

    enum SoundVolume { LOW, MEDIUM, HIGH, VERY_HIGH };
    enum CarVariant { SEDAN, COMBI, SUPER_CAR };

    public static void main(String args[]){
        SoundVolume phoneSound = SoundVolume.LOW;
        System.out.println("soundVolume: " + phoneSound);

        /*
        Typ wyliczeniowy - enumerated type = enum
        Jeżeli zmienna ma przyjmować tylko jedną z określonych wartości to warto zastosować enum,
        który wskazuje jakie mogą być użyte w zmiennej.
        Przykładem może być wielkość ubrań dostępnych w sklepie etc.

        public class Test {
            enum ShirtSize { S, M, L, XL};

            public static void main(String args[]){

                ShirtSize buyerShirtSize = ShirtSize.M;
                buyerShirtSize = ShirtSize.L;
            }
        }
        */

    }

}
