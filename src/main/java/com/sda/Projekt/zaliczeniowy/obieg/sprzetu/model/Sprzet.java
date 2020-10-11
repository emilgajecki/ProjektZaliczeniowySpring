package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sprzet {

    @Id
    //nie będzie powielało id.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nazwaSprzetu;
    private String kategoriaSprzetu;

    public Sprzet(){

    }

    public Sprzet(String nazwaSprzetu, String kategoriaSprzetu) {
        this.nazwaSprzetu = nazwaSprzetu;
        this.kategoriaSprzetu = kategoriaSprzetu;
    }

    public String getNazwaSprzetu() {
        return nazwaSprzetu;
    }

    public void setNazwaSprzetu(String nazwaSprzetu) {
        this.nazwaSprzetu = nazwaSprzetu;
    }

    public String getKategoriaSprzetu() {
        return kategoriaSprzetu;
    }

    public void setKategoriaSprzetu(String kategoriaSprzetu) {
        this.kategoriaSprzetu = kategoriaSprzetu;
    }

}
