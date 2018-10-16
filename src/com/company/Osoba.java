package com.company;

public class Osoba {
    protected final String imie;
    protected final String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String toString() {
        return imie + " " + nazwisko;
    }
}
