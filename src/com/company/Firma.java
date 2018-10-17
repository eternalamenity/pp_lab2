package com.company;

import com.company.Pracownik.Stanowisko;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Firma implements Iterable<Pracownik> {
    private List<Pracownik> pracownicy;

    public Firma() { pracownicy = new ArrayList<>(); }
    public Firma(List<Pracownik> pracownicy) {
        this.pracownicy = pracownicy;
    }

    public void dodajPracownika(Pracownik pracownik) {
        this.pracownicy.add(pracownik);
    }

    public boolean zwolnijPracownika(Pracownik pracownik) {
        if(this.pracownicy.remove(pracownik))
            return true;
        return false;
    }

    public int liczbaPracownikow() {
        return pracownicy.size();
    }

    public void spisPracownikow() {
        System.out.println("SPIS PRACOWNIKOW");
        for (Pracownik p : pracownicy) {
            System.out.println(p.toString());
        }
    }

    @Override
    public Iterator iterator() {
        return pracownicy.iterator();
    }

    public Iterator iterator(Stanowisko stanowisko) {
        Stream<Pracownik> lista = pracownicy.stream()
                .filter(p -> p.getStanowisko() == stanowisko);
        return lista.iterator();
    }
}
