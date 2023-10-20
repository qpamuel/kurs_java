package com.example.basics.control_block_statements;

public class J34_IfExercise_fourth {
    public static void main(String args[]){
        /*
        Stwórz prostą ocenę kierowcy zaczynając od początkowych zmiennych:
        points = 0 (int), driverLicence (boolean), expeienceYears (int),
        drunkDriving (boolean), causedAccident (boolean), overSpeeding (boolean).
        Zastosuj instrukcje if do sprawdzedzania warunków i dodawania czy odejmowania punktów.

        1. Kierowca startuje z ilością 0 punktów, dostaje +20 jeśli ma prawo jazdy
        2. -100 punktów jeśli jeździł pod wpływem albo spowodował wypadek
        3. -10 jeśli przekraczał prędkość
        4. Jeśli ma przynajmniej 10lat doświadczenia +20 punktów
        5. Jeśli ma więcej niż 60 lat doświadczenia -20 punktów
         */

        int points = 0;
        boolean driverLicence = true;
        int experienceYears = 12;
        boolean drunkDriving = false;
        boolean causeAccident = true;
        boolean overSpeeding = true;

        if (driverLicence == true) points += 20;
        if (experienceYears >= 10) points += 20; else if (experienceYears > 60) points -= 20;
        if (drunkDriving == true || causeAccident == true) points -= 100;
        if (overSpeeding == true) points -= 10;

        System.out.println("Kierowca posiada " + points + " punktów.");
    }
}
