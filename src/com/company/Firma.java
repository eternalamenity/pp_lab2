package com.company;

import java.util.Iterator;
import java.util.List;

public class Firma implements Iterable<Pracownik> {
    private List<Pracownik> pracownicy;

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


}
