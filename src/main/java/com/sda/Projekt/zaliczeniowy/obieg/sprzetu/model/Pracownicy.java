package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pracownicy {

    @Id
    //nie będzie powielało id.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String imiePracownika;
    private String nazwiskoPracownika;

    public Pracownicy(){

    }

    public Pracownicy(String imiePracownika, String nazwiskoPracownika) {
        this.imiePracownika = imiePracownika;
        this.nazwiskoPracownika = nazwiskoPracownika;
    }

    public String getImiePracownika() {
        return imiePracownika;
    }

    public void setImiePracownika(String imiePracownika) {
        this.imiePracownika = imiePracownika;
    }

    public String getNazwiskoPracownika() {
        return nazwiskoPracownika;
    }

    public void setNazwiskoPracownika(String nazwiskoPracownika) {
        this.nazwiskoPracownika = nazwiskoPracownika;
    }
}
