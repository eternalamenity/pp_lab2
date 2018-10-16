package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pracownik> pracownicy = new ArrayList<Pracownik>();
        pracownicy.add(new Pracownik("Szymon", "Bandowski", Pracownik.Stanowisko.Dyrektor, 10000));
        pracownicy.add(new Pracownik("Andrzej", "Bandowski", Pracownik.Stanowisko.Kierownik, 5000));
        pracownicy.add(new Pracownik("Stefan", "Bandowski", Pracownik.Stanowisko.Pracownik, 3000));
        Firma firma = new Firma(pracownicy);
        for (Pracownik p: firma) {
            System.out.println(p.toString());
        }
    }
}
