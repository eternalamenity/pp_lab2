package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("Szymon", "Bandowski", Pracownik.Stanowisko.Dyrektor, 10000);
        Pracownik p2 = new Pracownik("Andrzej", "Bandowski", Pracownik.Stanowisko.Kierownik, 5000);
        Pracownik p3 = new Pracownik("Stefan", "Bandowski", Pracownik.Stanowisko.Pracownik, 3000);
        Firma firma = new Firma();

        firma.dodajPracownika(p1);
        firma.dodajPracownika(p2);
        firma.dodajPracownika(p3);

        firma.spisPracownikow();

        System.out.println();
        System.out.println("SPIS PRACOWNIKOW - ITERATOR");
        for (Pracownik p: firma) {
            System.out.println(p.toString());
        }

        System.out.println();
        System.out.println("KIEROWNIK - STREAM.FILTER");
        for (Iterator it = firma.iterator(Pracownik.Stanowisko.Kierownik); it.hasNext(); ) {
            Pracownik p = (Pracownik) it.next();
            System.out.println(p.toString());
        }
    }
}
