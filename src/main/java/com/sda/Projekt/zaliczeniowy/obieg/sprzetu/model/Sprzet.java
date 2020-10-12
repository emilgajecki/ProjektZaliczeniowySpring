package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sprzet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nazwaSprzetu;
    private int typUrzadzenia;

    public Sprzet(){

    }

    public Sprzet(String nazwaSprzetu, int typSptzetu) {
        this.nazwaSprzetu = nazwaSprzetu;
        this.typUrzadzenia = typSptzetu;
    }

    public String getNazwaSprzetu() {
        return nazwaSprzetu;
    }

    public void setNazwaSprzetu(String nazwaSprzetu) {
        this.nazwaSprzetu = nazwaSprzetu;
    }

    public int getTypUrzadzenia() {
        return typUrzadzenia;
    }

    public void setTypUrzadzenia(int typSptzetu) {
        this.typUrzadzenia = typSptzetu;
    }
}
