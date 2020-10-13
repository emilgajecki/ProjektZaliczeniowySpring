package com.sda.Projekt.zaliczeniowy.obieg.sprzetu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wydanie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pracownikId;
    private int sprzetId;

    public Wydanie (){

    }

    public Wydanie(int pracownikId, int sprzetId) {
        this.pracownikId = pracownikId;
        this.sprzetId = sprzetId;
    }

    public int getPracownikId() {
        return pracownikId;
    }

    public void setPracownikId(int pracownikId) {
        this.pracownikId = pracownikId;
    }

    public int getSprzetId() {
        return sprzetId;
    }

    public void setSprzetId(int sprzetId) {
        this.sprzetId = sprzetId;
    }
}
