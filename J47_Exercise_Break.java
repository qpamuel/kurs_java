package com.example.basics.control_block_statements;

public class J47_Exercise_Break {
    public static void main(String[] args) {

        /*
        Stwórz dowolną pętlę od 0 do 50,
        wyświetl licznik pętli w każdej teracji,
        ale przerwij dziaanie pętli na 10 używając break.
         */

        int licznikPętli = 0;

        while (licznikPętli <= 50) {
            licznikPętli++;
            System.out.println("Licznik Pętli: " + licznikPętli);
            if (licznikPętli == 10) break;
        }

        for(int i = 0; i <= 50; i++) {
            System.out.println(i);
            if (i == 10) break;
        }

    }
}
