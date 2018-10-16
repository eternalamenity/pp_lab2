package com.company;

public class Pracownik extends Osoba {

    enum Stanowisko {
        Dyrektor(1, "CEO"), Kierownik(2, "Ponizej dyrektora, nad pracownikiem"),
        Pracownik(3, "Najnizej w hierarchi");

        private final int numer;
        private final String opis;
        Stanowisko(int i, String opis) {
            this.numer = i;
            this.opis = opis;
        }
    }

    private double pensja;
    private Stanowisko stanowisko;

    public Pracownik(String imie, String nazwisko, Stanowisko stanowisko, double pensja) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public String toString() {
        return imie + " " + nazwisko + " " + stanowisko + " " + pensja;
    }
}
